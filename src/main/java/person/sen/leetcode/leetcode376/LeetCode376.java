package person.sen.leetcode.leetcode376;

public class LeetCode376 {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length < 2){
            return nums.length;
        }

        STAT stat = STAT.BEGIN;
        int maxLength = 1;

        for(int i = 1; i < nums.length; i++){
            switch (stat){
                case BEGIN:{
                    if(nums[i] > nums[i-1]){
                        stat = STAT.UP;
                        maxLength++;
                    }
                    else if (nums[i - 1] > nums[i]){
                        stat = STAT.DOWN;
                        maxLength++;
                    }
                    break;
                }
                case UP:{
                    if(nums[i-1] > nums[i]){
                        stat = STAT.DOWN;
                        maxLength++;
                    }
                    break;
                }
                case DOWN:{
                    if(nums[i-1] < nums[i]){
                        stat = STAT.UP;
                        maxLength++;
                    }
                    break;
                }
            }
        }

        return maxLength;
    }

    enum STAT {
        BEGIN,
        UP,
        DOWN;
    }
}
