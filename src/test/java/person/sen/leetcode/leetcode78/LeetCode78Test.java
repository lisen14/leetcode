package person.sen.leetcode.leetcode78;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LeetCode78Test {

    private LeetCode78 leetCode78 =new LeetCode78();

    @Test
    public void subsets() {
        int[] nums = {1, 2, 3};

        List<List<Integer>> result = leetCode78.subsets(nums);


        Assert.assertEquals(8, result.size());

        for (List<Integer> item: result
             ) {
            System.out.println(Arrays.toString(item.toArray()));
        }
    }
}
