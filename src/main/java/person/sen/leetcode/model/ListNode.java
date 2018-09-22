package person.sen.leetcode.model;

import java.util.Objects;

/**
 * @author senli
 */
public class ListNode {
    public int val;
    public ListNode next;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListNode)) {
            return false;
        }
        ListNode listNode = (ListNode) o;
        return val == listNode.val &&
            Objects.equals(next, listNode.next);
    }


    public ListNode(int x) {
        val = x;
    }
}
