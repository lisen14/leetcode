package person.sen.leetcode.leetcode236;

import org.junit.Test;
import person.sen.leetcode.model.TreeNode;

import static org.junit.Assert.*;

public class LeetCode236Test {

    @Test
    public void lowestCommonAncestor() {
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(1);
        TreeNode d = new TreeNode(6);
        TreeNode e = new TreeNode(2);
        TreeNode f = new TreeNode(0);
        TreeNode x = new TreeNode(8);
        TreeNode y = new TreeNode(7);
        TreeNode z = new TreeNode(4);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = x;
        e.left = y;
        e.right = z;

        LeetCode236 leetCode236 = new LeetCode236();
        //TreeNode result = leetCode236.lowestCommonAncestor(a, b, f);
        //System.out.println(result.val);
        TreeNode result = leetCode236.lowestCommonAncestor(a, d, z);
        System.out.println(result.val);
        result = leetCode236.lowestCommonAncestor(a, b, y);
        System.out.println(result.val);
    }
}