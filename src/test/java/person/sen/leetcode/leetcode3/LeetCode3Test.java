package person.sen.leetcode.leetcode3;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode3Test {
    private LeetCode3 leetCode3 = new LeetCode3();

    @Test
    public void testSolution() {
        String case1 = "a";
        String case2 = "abcd";
        String case3 = "abbbbc";
        String case4 = "aaaaaa";
        String case5 = "abcdeabcdefg";

        Assert.assertEquals(1, this.leetCode3.lengthOfLongestSubstring(case1));
        Assert.assertEquals(4, this.leetCode3.lengthOfLongestSubstring(case2));
        Assert.assertEquals(2, this.leetCode3.lengthOfLongestSubstring(case3));
        Assert.assertEquals(1, this.leetCode3.lengthOfLongestSubstring(case4));
        Assert.assertEquals(7, this.leetCode3.lengthOfLongestSubstring(case5));
    }


}
