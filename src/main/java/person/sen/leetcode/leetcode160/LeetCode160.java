package person.sen.leetcode.leetcode160;

import person.sen.leetcode.model.ListNode;

import java.util.List;

public class LeetCode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == headB) {
            return headA;
        }

        if (headA == null || headB == null) {
            return null;
        }

        int lengthA = 1;
        int lengthB = 1;

        ListNode headATemp = headA;
        ListNode headBTemp = headB;

        while (headATemp.next != null) {
            lengthA++;
            headATemp = headATemp.next;
        }

        while (headBTemp.next != null) {
            lengthB++;
            headBTemp = headBTemp.next;
        }

        int difference = Math.abs(lengthA - lengthB);

        if (lengthA > lengthB) {
            ListNode tempA = headA;
            while (difference > 0) {
                tempA = tempA.next;
                difference--;
            }
            return findIntersectionNode(tempA, headB);
        } else {
            ListNode tempB = headB;
            while (difference > 0) {
                tempB = tempB.next;
                difference--;
            }
            return findIntersectionNode(tempB, headA);
        }

    }

    private ListNode findIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == headB) {
            return headA;
        }
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            } else {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }
}
