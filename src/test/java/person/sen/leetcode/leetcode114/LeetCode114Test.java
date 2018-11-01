package person.sen.leetcode.leetcode114;

import org.junit.Assert;
import org.junit.Test;
import person.sen.leetcode.model.TreeNode;

import static org.junit.Assert.*;

public class LeetCode114Test {

    @Test
    public void flatten() {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(5);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(6);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        LeetCode114 leetcode114 = new LeetCode114();

        leetcode114.flatten(a);

        TreeNode head = a;

        while (head != null) {
            if (head.left != null) {
                Assert.assertEquals(1, 2);
            }
            System.out.println(head.val);
            head = head.right;
        }
    }
}