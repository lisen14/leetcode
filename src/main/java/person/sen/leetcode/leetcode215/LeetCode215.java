package person.sen.leetcode.leetcode215;

import java.util.PriorityQueue;
import java.util.Queue;

public class LeetCode215 {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue();

        for (int i : nums) {
            if (queue.size() == 0) {
                queue.add(i);
            } else {
                if (queue.size() == k) {
                    if (queue.peek() < i) {
                        queue.remove();
                        queue.add(i);
                    }
                } else {
                    queue.add(i);
                }
            }

        }

        return queue.poll();
    }
}
