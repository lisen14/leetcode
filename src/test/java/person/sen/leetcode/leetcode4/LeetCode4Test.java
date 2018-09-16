package person.sen.leetcode.leetcode4;

import org.junit.Assert;
import org.junit.Test;


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


    @Test
    public void testCase4() {
        int[] array2 = {5, 6, 7, 8};
        int[] array1 = {1, 2, 3, 4};

        Assert.assertEquals(4.5d, leetCode4.findMedianSortedArrays(array1, array2), 0.00001d);
    }

    @Test
    public void testCase5() {
        int[] array2 = {1, 3};
        int[] array1 = {2};

        Assert.assertEquals(2d, leetCode4.findMedianSortedArrays(array1, array2), 0.00001d);
    }
}