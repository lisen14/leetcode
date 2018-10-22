package person.sen.leetcode.leetcode402;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCode402Test {

    private LeetCode402 leetCode402 = new LeetCode402();

    @Test
    public void removeKdigits() {
        String parameter1 = "1432219";
        String parameter2 = "10200";
        String parameter3 = "10";

        String result1 = leetCode402.removeKdigits(parameter1, 3);
        Assert.assertEquals("1219", result1);

        String result2 = leetCode402.removeKdigits(parameter2, 1);
        Assert.assertEquals("200", result2);

        String result3 = leetCode402.removeKdigits(parameter3, 2);
        Assert.assertEquals("0", result3);



    }
}
