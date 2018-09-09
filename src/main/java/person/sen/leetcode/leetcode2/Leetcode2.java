package person.sen.leetcode.leetcode2;

public class Leetcode2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        boolean flag = false;

        ListNode number = new ListNode(0);

        ListNode result = number;

        ListNode mainNumber;
        ListNode subNumber;
        ListNode refCopy1 = l1;
        ListNode refCopy2 = l2;

        while (refCopy1.next != null && refCopy2.next != null) {
            refCopy1 = refCopy1.next;
            refCopy2 = refCopy2.next;
        }

        if (refCopy1.next == null) {
            mainNumber = l2;
            subNumber = l1;
        } else {
            mainNumber = l1;
            subNumber = l2;
        }

        while (mainNumber != null) {
            int value;
            if (subNumber != null) {
                value = flag ? (mainNumber.val + subNumber.val + 1) : (mainNumber.val + subNumber.val);
            } else {
                value = flag ? (mainNumber.val + 1) : mainNumber.val;
            }

            flag = value >= 10;

            if (flag) {
                number.val = value - 10;
            } else {
                number.val = value;
            }

            mainNumber = mainNumber.next;
            subNumber = subNumber == null ? null : subNumber.next;

            if (mainNumber != null) {
                number.next = new ListNode(0);
                number = number.next;
            } else if (flag) {
                number.next = new ListNode(1);
            }

        }
        return result;
    }
}
