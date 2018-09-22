package person.sen.leetcode.leetcode141;

import person.sen.leetcode.model.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode141 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();

        while(head!=null){
            if(set.add(head)){
                head = head.next;
            }else{
                return true;
            }
        }

        return false;
    }
}
