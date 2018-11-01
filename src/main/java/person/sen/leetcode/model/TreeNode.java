package person.sen.leetcode.model;

import java.io.Serializable;

public class TreeNode implements Serializable {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return val + "";
    }
}
