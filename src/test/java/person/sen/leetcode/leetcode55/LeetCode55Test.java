package person.sen.leetcode.leetcode55;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCode55Test {

    private LeetCode55 leetCode55 = new LeetCode55();

    @Test
    public void canJump() {
        int[] parameter1 = {2, 3, 1, 1, 4};
        int[] parameter2 = {3, 2, 1, 0, 4};

        Assert.assertEquals(true, leetCode55.canJump(parameter1));
        Assert.assertEquals(false, leetCode55.canJump(parameter2));
    }
}
