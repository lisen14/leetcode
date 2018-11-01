package person.sen.leetcode.leetcode199;

import org.junit.Assert;
import org.junit.Test;
import person.sen.leetcode.leetcode114.LeetCode114;
import person.sen.leetcode.model.TreeNode;

import java.util.List;

import static org.junit.Assert.*;

public class LeetCode199Test {

    @Test
    public void rightSideView() {
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

        LeetCode199 leetCode199 = new LeetCode199();

        List<Integer> result = leetCode199.rightSideView(a);

        for(Integer item : result){
            System.out.println(item);
        }
    }
}