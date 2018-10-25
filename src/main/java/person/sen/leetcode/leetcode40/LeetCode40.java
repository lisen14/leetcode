package person.sen.leetcode.leetcode40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Set<List<Integer>> result = new HashSet<>();


        List<Integer> item = new ArrayList<>();
        result.add(item);

        Arrays.sort(candidates);

        generate(0, candidates, item, result, 0, target);

        result.remove(item);

        return new ArrayList<>(result);
    }

    private void generate(int i, int[] nums, List<Integer> item, Set<List<Integer>> result, int sum, int target) {
        if (i >= nums.length || sum > target) {
            if(sum == target){
                result.add(item);
            }

            return;
        }

        List newItem = new ArrayList(item);

        newItem.add(nums[i]);
        sum+=nums[i];
        if(target == sum && !result.contains(item)){
            result.add(newItem);
        }

        generate(i + 1, nums, newItem, result, sum, target);

        List reNewItem = new ArrayList(newItem);
        reNewItem.remove(reNewItem.size() - 1);
        sum -= nums[i];

        generate(i + 1, nums, reNewItem, result, sum, target);
    }
}
