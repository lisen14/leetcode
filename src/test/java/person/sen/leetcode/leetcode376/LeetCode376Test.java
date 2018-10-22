package person.sen.leetcode.leetcode376;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCode376Test {

    private LeetCode376 leetCode376 = new LeetCode376();

    @Test
    public void wiggleMaxLength() {
        int[] parameter = {1, 17, 5, 10, 13, 15, 10, 5, 16, 8};

        int result = leetCode376.wiggleMaxLength(parameter);

        Assert.assertEquals(7, result);


    }
}
