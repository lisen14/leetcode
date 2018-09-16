package person.sen.leetcode.leetcode92;

import org.junit.Assert;
import org.junit.Test;
import person.sen.leetcode.model.ListNode;
import person.sen.leetcode.util.ListUtil;

import static org.junit.Assert.*;

public class LeetCode92Test {

    LeetCode92 leetCode92 = new LeetCode92();

    @Test
    public void reverseBetween() {
        ListNode parametetHead1 = ListUtil.buildLinkedListWithArray(new int[]{1,2,3,4,5});
        ListNode parametetHead2 = ListUtil.buildLinkedListWithArray(new int[]{1,2,3,4,5});
        ListNode parametetHead3 = ListUtil.buildLinkedListWithArray(new int[]{1,2,3,4,5});
        ListNode expectHead1 = ListUtil.buildLinkedListWithArray(new int[]{1,4,3,2,5});
        ListNode expectHead2 = ListUtil.buildLinkedListWithArray(new int[]{4,3,2,1,5});
        ListNode expectHead3 = ListUtil.buildLinkedListWithArray(new int[]{1,2,5,4,3});

        ListNode result1 = leetCode92.reverseBetween(parametetHead1, 2 , 4);
        ListNode result2 = leetCode92.reverseBetween(parametetHead2, 1 , 4);
        ListNode result3 = leetCode92.reverseBetween(parametetHead3, 3 , 5);

        Assert.assertEquals(expectHead1, result1);
        Assert.assertEquals(expectHead2, result2);
        Assert.assertEquals(expectHead3, result3);

    }
}
