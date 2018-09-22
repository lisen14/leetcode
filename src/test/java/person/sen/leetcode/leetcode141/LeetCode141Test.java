package person.sen.leetcode.leetcode141;

import org.junit.Assert;
import org.junit.Test;
import person.sen.leetcode.model.ListNode;
import person.sen.leetcode.util.ListUtil;

import static org.junit.Assert.*;

public class LeetCode141Test {
    private LeetCode141 leetCode141 = new LeetCode141();
    @Test
    public void testCase1(){
        ListNode head = ListUtil.buildLinkedListWithArray(new int[]{1,2,3});
        head.next.next.next = head;

        Assert.assertEquals(true, leetCode141.hasCycle(head));
    }

    @Test
    public void testCase2(){
        ListNode head = ListUtil.buildLinkedListWithArray(new int[]{1,2,3});
        //head.next.next.next = head;

        Assert.assertEquals(false, leetCode141.hasCycle(head));
    }

}