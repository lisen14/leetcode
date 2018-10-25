package person.sen.leetcode.leetcode22;

import org.junit.Test;
import person.sen.leetcode.leetcode4.LeetCode4;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LeetCode22Test {

    private LeetCode22 leetCode22 = new LeetCode22();

    @Test
    public void generateParenthesis() {
        List<String> result = leetCode22.generateParenthesis(3);

        for (String item: result
        ) {
            System.out.println(item);
        }
    }
}
