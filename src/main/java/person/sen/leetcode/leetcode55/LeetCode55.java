package person.sen.leetcode.leetcode55;

public class LeetCode55 {
    public boolean canJump(int[] nums) {
        int[] indexArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            indexArray[i] = nums[i] + i;
        }

        int jump = 0;
        int max_index = indexArray[0];
        while (jump < indexArray.length && jump <= max_index) {
            if (max_index < indexArray[jump]) {
                max_index = indexArray[jump];
            }
            jump++;
        }
        if (jump == indexArray.length) {
            return true;
        }


        return false;
    }
}
