package person.sen.leetcode.leetcode1;

import org.junit.Assert;
import org.junit.Test;
import person.sen.leetcode.leetcode1.Leetcode1;

public class Leetcode1Test {

    private Leetcode1 leetcode1 = new Leetcode1();

    @Test
    public void twoSum() throws Exception {
        //test case
        int[] parameter1 = {3, 2, 4};
        int[] result1 = leetcode1.twoSum(parameter1, 6);


        int[] parameter2 = {3, 3};
        int[] result2 = leetcode1.twoSum(parameter2, 6);

        int[] parameter3 = {2, 5, 5, 11};
        int[] result3 = leetcode1.twoSum(parameter3, 10);

        int[] parameter4 = {0, 5, 5, 0};
        int[] result4 = leetcode1.twoSum(parameter4, 0);

        int[] parameter5 = {-3, 4, 3, 90};
        int[] result5 = leetcode1.twoSum(parameter5, 0);

        Assert.assertArrayEquals(new int[]{1, 2}, result1);
        Assert.assertArrayEquals(new int[]{0, 1}, result2);
        Assert.assertArrayEquals(new int[]{1, 2}, result3);
        Assert.assertArrayEquals(new int[]{0, 3}, result4);
        Assert.assertArrayEquals(new int[]{0, 2}, result5);

    }
}
