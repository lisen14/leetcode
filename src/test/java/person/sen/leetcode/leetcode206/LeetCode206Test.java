package person.sen.leetcode.leetcode206;

import org.junit.Assert;
import org.junit.Test;
import person.sen.leetcode.model.ListNode;
import person.sen.leetcode.util.ListUtil;

public class LeetCode206Test {

    LeetCode206 leetCode206 = new LeetCode206();

    @Test
    public void testCase1() {
        ListNode parameterHead =  ListUtil.buildLinkedListWithArray(new int[]{1,2,3,4,5});
        ListNode expectHead =  ListUtil.buildLinkedListWithArray(new int[]{5,4,3,2,1});

        ListNode resultHead = leetCode206.reverseList(parameterHead);
        Assert.assertEquals(expectHead, resultHead);
    }

    @Test
    public void testCase2() {
        ListNode parameterHead =  ListUtil.buildLinkedListWithArray(new int[]{1});
        ListNode expectHead =  ListUtil.buildLinkedListWithArray(new int[]{1});

        ListNode resultHead = leetCode206.reverseList(parameterHead);
        Assert.assertEquals(expectHead, resultHead);
    }

    @Test
    public void testCase3() {
        ListNode parameterHead =  ListUtil.buildLinkedListWithArray(new int[]{});
        ListNode expectHead =  ListUtil.buildLinkedListWithArray(new int[]{});

        ListNode resultHead = leetCode206.reverseList(parameterHead);
        Assert.assertEquals(expectHead, resultHead);
    }


    @Test
    public void testbuildLinkedListWithArray(){
        ListNode head = ListUtil.buildLinkedListWithArray(new int[]{1,2,3,4,5});
        ListNode expectHead = new ListNode(1);
        expectHead.next = new ListNode(2);
        expectHead.next.next = new ListNode(3);
        expectHead.next.next.next = new ListNode(4);
        expectHead.next.next.next.next = new ListNode(5);
        Assert.assertEquals(expectHead, head);
    }

}
