package person.sen.leetcode.leetcode142;

import person.sen.leetcode.model.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode142 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();

        while(head!=null){
            if(set.add(head)){
                head = head.next;
            }else{
                return head;
            }
        }

        return null;
    }
}
