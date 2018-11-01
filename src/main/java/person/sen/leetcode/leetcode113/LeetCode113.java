package person.sen.leetcode.leetcode113;

import person.sen.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode113 {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        int path_value = 0;

        preOrder(root, path_value, sum, path, result);

        return result;
    }

    private void preOrder(TreeNode root, int path_value, int sum, List<Integer> path, List<List<Integer>> result) {
        if (root == null) {
            return;
        }

        path_value += root.val;

        path.add(root.val);

        if (root.left == null && root.right == null && path_value == sum) {
            result.add(new ArrayList<>(path));
        }

        preOrder(root.left, path_value, sum, path, result);
        preOrder(root.right, path_value, sum, path, result);

        path_value -= root.val;

        path.remove(path.size() - 1);
    }
}
