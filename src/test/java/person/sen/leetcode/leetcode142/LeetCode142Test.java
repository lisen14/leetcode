package person.sen.leetcode.leetcode142;

import org.junit.Assert;
import org.junit.Test;
import person.sen.leetcode.model.ListNode;
import person.sen.leetcode.util.ListUtil;

import java.util.List;

import static org.junit.Assert.*;

public class LeetCode142Test {

    LeetCode142 leetCode142 = new LeetCode142();

    @Test
    public void testCase1() {
        ListNode head = ListUtil.buildLinkedListWithArray(new int[]{1, 2, 3, 4, 5, 6});
        head.next.next.next.next.next.next = head.next.next;

        ListNode result = leetCode142.detectCycle(head);

        Assert.assertEquals(head.next.next, result);
    }

    @Test
    public void testCase2() {
        ListNode head = ListUtil.buildLinkedListWithArray(new int[]{1, 2, 3, 4, 5, 6});

        ListNode result = leetCode142.detectCycle(head);

        Assert.assertEquals(null, result);
    }

}