package person.sen.leetcode.util;

import person.sen.leetcode.model.ListNode;

public class ListUtil {
    public static ListNode buildLinkedListWithArray(int[] array) {
        ListNode head = null;
        ListNode item = null;
        ListNode lastItem = null;
        for (int i = 0; i < array.length; i++) {
            item = new ListNode(array[i]);
            if(i == 0){
                head = item;
            } else {
                lastItem.next = item;
            }
            lastItem = item;

        }

        return head;
    }
}
