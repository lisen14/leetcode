package person.sen.leetcode.leetcode236;

import person.sen.leetcode.model.TreeNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeetCode236 {

    List<TreeNode> nodePPath = new ArrayList<>();
    List<TreeNode> nodeQPath = new ArrayList<>();


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        return left != null ? left : right;
    }
}
