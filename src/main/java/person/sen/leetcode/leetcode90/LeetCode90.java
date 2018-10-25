package person.sen.leetcode.leetcode90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class LeetCode90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();


        List<Integer> item = new ArrayList<>();
        result.add(item);

        Arrays.sort(nums);

        generate(0, nums, item, result);

        return new ArrayList<>(result);
    }

    private void generate(int i, int[] nums, List<Integer> item, Set<List<Integer>> result) {
        if (i >= nums.length) {
            return;
        }
        List newItem = new ArrayList(item);
        newItem.add(nums[i]);
        result.add(newItem);
        generate(i + 1, nums, newItem, result);

        List reNewItem = new ArrayList(newItem);
        reNewItem.remove(reNewItem.size() - 1);
        generate(i + 1, nums, reNewItem, result);
    }

}
