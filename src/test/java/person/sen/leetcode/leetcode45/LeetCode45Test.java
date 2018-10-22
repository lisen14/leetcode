package person.sen.leetcode.leetcode45;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCode45Test {

    private LeetCode45 leetCode45 = new LeetCode45();

    @Test
    public void jump() {
        int[] parameter = {2, 3, 1, 1, 4};

        int result = leetCode45.jump(parameter);

        Assert.assertEquals(2, result);
    }
}
