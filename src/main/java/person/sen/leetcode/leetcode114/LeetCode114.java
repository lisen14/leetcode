package person.sen.leetcode.leetcode114;

import person.sen.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode114 {
    public void flatten(TreeNode root) {
        List<TreeNode> nodeList = new ArrayList();
        preOrder(root, nodeList);
        for (int i = 1; i < nodeList.size(); i++) {
            nodeList.get(i - 1).left = null;
            nodeList.get(i-1).right = nodeList.get(i);
        }

    }

    private void preOrder(TreeNode node, List<TreeNode> nodeList) {
        if (node == null) {
            return;
        }
        nodeList.add(node);
        preOrder(node.left, nodeList);
        preOrder(node.right, nodeList);
    }
}
