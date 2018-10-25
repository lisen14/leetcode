package person.sen.leetcode.leetcode78;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode78 {
    public List<List<Integer>> subsets(int[] nums) {
        Stack<List<Integer>> result = new Stack<>();

        List<Integer> item = new ArrayList<>();
        result.push(item);
        generate(0, nums, item, result);

        return new ArrayList<>(result);
    }

    private void generate(int i, int[] nums, List<Integer> item, Stack<List<Integer>> result) {
        if (i >= nums.length) {
            return;
        }
        List newItem = new ArrayList(item);
        newItem.add(nums[i]);
        result.push(newItem);
        generate(i + 1, nums, newItem, result);

        List reNewItem = new ArrayList(newItem);
        reNewItem.remove(reNewItem.size() - 1);
        generate(i + 1, nums, reNewItem, result);
    }
}
