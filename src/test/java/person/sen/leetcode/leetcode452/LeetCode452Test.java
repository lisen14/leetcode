package person.sen.leetcode.leetcode452;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCode452Test {

    private LeetCode452 leetCode452 = new LeetCode452();

    @Test
    public void findMinArrowShots() {
        int[][] parameter = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};

        int result = leetCode452.findMinArrowShots(parameter);

        Assert.assertEquals(2, result);

    }
}
