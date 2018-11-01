package person.sen.leetcode.leetcode315;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LeetCode315Test {

    private LeetCode315 leetCode315 = new LeetCode315();

    @Test
    public void countSmaller() {
        int[] parameter = {5, -7, 9, 1, 3, 5, -2, 1};
        List<Integer> result = leetCode315.countSmaller(parameter);
        for (Integer i :
            result) {
            System.out.println("["+i+"]");
        }

    }
}
