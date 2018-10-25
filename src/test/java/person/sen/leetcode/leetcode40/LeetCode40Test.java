package person.sen.leetcode.leetcode40;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LeetCode40Test {

    private LeetCode40 leetCode40 = new LeetCode40();

    @Test
    public void combinationSum2() {
        int[] nums = {10, 1, 2, 7, 6,1,5};

        List<List<Integer>> result = leetCode40.combinationSum2(nums, 8);

        for (List<Integer> item: result
        ) {
            System.out.println(Arrays.toString(item.toArray()));
        }

        Assert.assertEquals(4, result.size());


    }


    @Test
    public void combinationSum2_1() {
        int[] nums = {2,5,2,1,2};

        List<List<Integer>> result = leetCode40.combinationSum2(nums, 5);

        for (List<Integer> item: result
        ) {
            System.out.println(Arrays.toString(item.toArray()));
        }

        Assert.assertEquals(2, result.size());


    }
}
