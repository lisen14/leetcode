package person.sen.leetcode.leetcode160;

import org.junit.Assert;
import org.junit.Test;
import person.sen.leetcode.model.ListNode;
import person.sen.leetcode.util.ListUtil;

import static org.junit.Assert.*;

public class LeetCode160Test {
    private LeetCode160 leetcode160 = new LeetCode160();

    @Test
    public void getIntersectionNodeCase1() {
        ListNode nodeA = ListUtil.buildLinkedListWithArray(new int[]{1, 2, 3, 4, 5});
        ListNode nodeB = new ListNode(1);
        nodeB.next = nodeA.next;

        ListNode result = leetcode160.getIntersectionNode(nodeA, nodeB);

        Assert.assertEquals(true, result == nodeB.next);
    }

    @Test
    public void getIntersectionNodeCase2() {
        ListNode nodeA = ListUtil.buildLinkedListWithArray(new int[]{1, 2, 3, 4, 5});
        ListNode nodeB = new ListNode(99);
        nodeB.next = new ListNode(98);
        nodeB.next.next = nodeA;

        ListNode result = leetcode160.getIntersectionNode(nodeB, nodeA);

        Assert.assertEquals(true, result == nodeA);
    }

    @Test
    public void getIntersectionNodeCase3() {
        ListNode nodeA = ListUtil.buildLinkedListWithArray(new int[]{1, 2, 3, 4, 5});
        ListNode nodeB = new ListNode(99);
        nodeB.next = new ListNode(98);
        nodeB.next.next = new ListNode(97);

        ListNode result = leetcode160.getIntersectionNode(nodeA, nodeB);

        Assert.assertEquals(null, result);
    }

     @Test
    public void getIntersectionNodeCase4() {
        ListNode nodeA = ListUtil.buildLinkedListWithArray(new int[]{1, 2, 3, 4, 5});
        ListNode nodeB = null;

        ListNode result = leetcode160.getIntersectionNode(nodeA, nodeB);

        Assert.assertEquals(null, result);
    }

    @Test
    public void getIntersectionNodeCase5() {
        ListNode nodeA = ListUtil.buildLinkedListWithArray(new int[]{2,3} );
        ListNode nodeB = nodeA.next;

        ListNode result = leetcode160.getIntersectionNode(nodeA, nodeB);

        Assert.assertEquals(true, result == nodeA.next);
    }

    @Test
    public void getIntersectionNodeCase6() {
        ListNode nodeA = ListUtil.buildLinkedListWithArray(new int[]{1,2,3} );
        ListNode nodeB = new ListNode(99);
        nodeB.next = new ListNode(98);
        nodeB.next = nodeA.next.next;

        ListNode result = leetcode160.getIntersectionNode(nodeA, nodeB);

        Assert.assertEquals(true, result == nodeA.next.next);
    }
}