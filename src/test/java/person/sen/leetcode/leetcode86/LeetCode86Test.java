package person.sen.leetcode.leetcode86;

import org.junit.Assert;
import org.junit.Test;
import person.sen.leetcode.model.ListNode;
import person.sen.leetcode.util.ListUtil;

import static org.junit.Assert.*;

public class LeetCode86Test {

    LeetCode86 leetCode86 = new LeetCode86();

    @Test
    public void testCase1() {
        ListNode head = ListUtil.buildLinkedListWithArray(new int[]{1, 4, 3, 2, 5, 2});
        ListNode expectHead = ListUtil.buildLinkedListWithArray(new int[]{1, 2, 2, 4, 3, 5});

        ListNode result = leetCode86.partition(head, 3);

        Assert.assertEquals(expectHead, result);
    }

}