package person.sen.leetcode.leetcode90;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LeetCode90Test {

    private LeetCode90 leetCode90 = new LeetCode90();

    @Test
    public void subsetsWithDup() {
        int[] nums = {2, 1, 2};

        List<List<Integer>> result = leetCode90.subsetsWithDup(nums);


        Assert.assertEquals(6, result.size());

        for (List<Integer> item : result
        ) {
            System.out.println(Arrays.toString(item.toArray()));
        }
    }
}
