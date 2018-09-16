package person.sen.leetcode.leetcode92;

import person.sen.leetcode.model.ListNode;

/**
 * @author senli
 */
public class LeetCode92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode beforeM = head;
        ListNode afterN = head;
        if (m == 1) {
            beforeM = null;
        } else {
            for (int i = 2; i < m; i++) {
                beforeM = beforeM.next;
            }
        }

        for (int i = 1; i <= n; i++) {
            afterN = afterN.next;
        }

        int j = m;

        ListNode tempHead = null;
        ListNode tempNewHead = null;

        if (beforeM == null) {
            tempHead = head;
        } else {
            tempHead = beforeM.next;
        }

        while (j <= n) {
            ListNode temp = tempHead.next;
            if (j == m) {
                tempHead.next = afterN;
            } else {
                tempHead.next = tempNewHead;
            }

            tempNewHead = tempHead;
            tempHead = temp;
            j++;
        }

        if (beforeM == null) {
            head = tempNewHead;
        } else {
            beforeM.next = tempNewHead;
        }


        return head;
    }
}
