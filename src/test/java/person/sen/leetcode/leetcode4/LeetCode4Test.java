package person.sen.leetcode.leetcode4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCode4Test {
    private LeetCode4 leetCode4 = new LeetCode4();

    @Test
    public void testCase1() {
        int[] array1 = {1, 2};
        int[] array2 = {3, 4};

        Assert.assertEquals(2.5d, leetCode4.findMedianSortedArrays(array1, array2), 0.00001d);
    }

    @Test
    public void testCase2() {
        int[] array1 = {1, 2};
        int[] array2 = {3, 4, 5};

        Assert.assertEquals(3d, leetCode4.findMedianSortedArrays(array1, array2), 0.00001d);
    }

    @Test
    public void testCase3() {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {3, 4, 5, 6};

        Assert.assertEquals(3.5d, leetCode4.findMedianSortedArrays(array1, array2), 0.00001d);
    }


}