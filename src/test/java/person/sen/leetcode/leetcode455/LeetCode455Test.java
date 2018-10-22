package person.sen.leetcode.leetcode455;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode455Test {

    private LeetCode455 leetCode455 = new LeetCode455();

    @Test
    public void findContentChildren() {
        int[] g = {5, 10, 2, 9, 15, 9};
        int[] s = {1, 3, 6, 8, 20};

        int result = leetCode455.findContentChildren(g, s);

        Assert.assertEquals(3, result);
    }
}
