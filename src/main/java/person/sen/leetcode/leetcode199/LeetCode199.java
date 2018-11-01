package person.sen.leetcode.leetcode199;

import person.sen.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class LeetCode199 {
    class Pair {
        public TreeNode left;
        public int right;

        public Pair(TreeNode left, int right) {
            this.left = left;
            this.right = right;
        }

    }


    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> view = new ArrayList<>();
        Queue<Pair> Q = new LinkedList<>();

        if (root != null) {
            Q.add(new Pair(root, 0));
        }

        while (!Q.isEmpty()) {
            TreeNode node = Q.peek().left;
            int depth = Q.peek().right;

            Q.poll();

            if (view.size() == depth) {
                view.add(node.val);
            } else {
                view.set(depth, node.val);
            }
            if (node.left != null) {
                Q.add(new Pair(node.left, depth + 1));
            }
            if (node.right != null) {
                Q.add(new Pair(node.right, depth + 1));
            }
        }

        return view;
    }
}
