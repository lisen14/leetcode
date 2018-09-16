package person.sen.leetcode.leetcode206;

import person.sen.leetcode.model.ListNode;

/**
 * @author senli
 */
public class LeetCode206 {
    public ListNode reverseList(ListNode head) {

        ListNode newHead = null;

        while(head != null){
            ListNode tempItem = head.next;
            head.next = newHead;
            newHead = head;
            head = tempItem;
        }

        return newHead;
    }
}
