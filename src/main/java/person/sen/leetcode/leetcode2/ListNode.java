package person.sen.leetcode.leetcode2;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListNode)) return false;

        ListNode listNode = (ListNode) o;

        if (val != listNode.val) return false;
        return next != null ? next.equals(listNode.next) : listNode.next == null;
    }

    @Override
    public int hashCode() {
        int result = val;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){
        String result = this.val + " ->";

        ListNode node = this;

        while(node.next != null){
            result+=node.next.val + " ->";
            node = node.next;
        }

        return result;
    }
}
