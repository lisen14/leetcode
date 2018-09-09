package person.sen.leetcode.leetcode1;

import java.util.Arrays;

public class Leetcode1 {

    public int[] twoSum(int[] nums, int target) {
        //result array
        int[] result = new int[2];

        int[] copyOfNums = new int[nums.length];

        System.arraycopy(nums, 0, copyOfNums, 0, nums.length);

        //sort the parameter nums
        //Arrays.sort(nums);

        //check the number where nums[i] < target
        int j = nums.length;

        for (int i = 0; i < j ;i++){
            int number1 = nums[i];

            for(int k = i; k< j ; k++){
                if(target - number1 == nums[k] && k!=i){
                    //find the right position for each code
                    //return getPositions(nums[k], result, copyOfNums, number1);
                    result[0] = i;
                    result[1] = k;
                }
            }
        }
        return result;
    }

    private int[] getPositions(int num, int[] result, int[] copyOfNums, int number1) {
        boolean flag = false;
        for(int l = 0; l< copyOfNums.length; l++){
            if(copyOfNums[l] == number1 && !flag){
                result[0] = l;
                flag = true;
            }
            if(copyOfNums[l] == num && l != result[0]){
                result[1] = l;
            }
        }

        Arrays.sort(result);

        return result;
    }
}
