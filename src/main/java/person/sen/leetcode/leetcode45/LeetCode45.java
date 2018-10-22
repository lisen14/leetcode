package person.sen.leetcode.leetcode45;

public class LeetCode45 {
    public int jump(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        int currentMaxIndex = nums[0];
        int preMaxMaxIndex = nums[0];
        int jumpMin = 1;

        for (int i = 1; i < nums.length; i++) {
            if (i > currentMaxIndex) {
                jumpMin++;
                currentMaxIndex = preMaxMaxIndex;
            }
            if (preMaxMaxIndex < nums[i] + i) {
                preMaxMaxIndex = nums[i] + i;
            }

        }
        return jumpMin;

    }
}
