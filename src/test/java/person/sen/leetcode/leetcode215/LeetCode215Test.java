package person.sen.leetcode.leetcode215;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCode215Test {

    LeetCode215 leetCode215 = new LeetCode215();

    @Test
    public void testFindKthLargest() {
        int[] testCase = {3, 4, 5622, 8, 7, 1, 2, 4, 5};


        int result = leetCode215.findKthLargest(testCase, 2);
        Assert.assertEquals(8, result);
        result = leetCode215.findKthLargest(testCase, 1);
        Assert.assertEquals(5622, result);
        result = leetCode215.findKthLargest(testCase, 3);
        Assert.assertEquals(7, result);
        result = leetCode215.findKthLargest(testCase, 4);
        Assert.assertEquals(5, result);
        result = leetCode215.findKthLargest(testCase, 5);
        Assert.assertEquals(4, result);
        result = leetCode215.findKthLargest(testCase, 6);
        Assert.assertEquals(4, result);
        result = leetCode215.findKthLargest(testCase, 7);
        Assert.assertEquals(3, result);


    }


}
