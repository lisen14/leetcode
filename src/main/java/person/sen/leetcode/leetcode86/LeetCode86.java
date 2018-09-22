package person.sen.leetcode.leetcode86;

import person.sen.leetcode.model.ListNode;

public class LeetCode86 {
    public ListNode partition(ListNode head, int x) {
        ListNode resultHead;

        ListNode lowerHead = null;
        ListNode higherHead = null;

        while (head != null) {
            if (head.val < x) {
                if (lowerHead == null) {
                    lowerHead = copyNode(head);
                } else {
                    addToListTail(lowerHead, head);
                }
            } else {
                if (higherHead == null) {
                    higherHead = copyNode(head);
                } else {
                    addToListTail(higherHead, head);
                }
            }
            head = head.next;
        }

        //connect lowerHead to higherHead
        if (lowerHead == null) {
            resultHead = higherHead;
        } else {
            resultHead = lowerHead;
            while (lowerHead.next != null) {
                if (lowerHead.next != null) {
                    lowerHead = lowerHead.next;
                }
            }
            lowerHead.next = higherHead;
        }

        return resultHead;
    }

    private ListNode copyNode(ListNode target) {
        ListNode result = new ListNode(target.val);
        return result;
    }

    private void addToListTail(ListNode head, ListNode target) {
        if (head == null) {
            head = copyNode(target);
        }
        while (head.next != null) {
            head = head.next;
        }
        head.next = copyNode(target);
    }
}
