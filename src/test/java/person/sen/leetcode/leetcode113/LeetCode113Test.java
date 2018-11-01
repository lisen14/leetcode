package person.sen.leetcode.leetcode113;

import org.junit.Test;
import person.sen.leetcode.model.TreeNode;

import java.util.List;

public class LeetCode113Test {

    private LeetCode113 leetCode113 = new LeetCode113();

    @Test
    public void pathSum() {
        TreeNode a = new TreeNode(5);
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(8);
        TreeNode d = new TreeNode(11);
        TreeNode e = new TreeNode(13);
        TreeNode f = new TreeNode(4);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(2);
        TreeNode x = new TreeNode(5);
        TreeNode y = new TreeNode(1);

        a.left = b;
        a.right = c;
        b.left = d;
        c.left = e;
        c.right = f;
        d.left = g;
        d.right = h;
        f.left = x;
        f.right = y;

        List<List<Integer>> result = leetCode113.pathSum(a, 22);
        for (List<Integer> item: result
             ) {
            for(Integer itemInner : item){
                System.out.print("[" + itemInner+"]");
            }
            System.out.println();
        }
    }
}
