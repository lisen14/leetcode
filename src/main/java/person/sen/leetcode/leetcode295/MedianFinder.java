package person.sen.leetcode.leetcode295;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author senli
 */
public class MedianFinder {

    private Queue<Integer> bigQueue = null;
    private Queue<Integer> smallQueue = null;

    /**
     * initialize your data structure here.
     */
    public MedianFinder() {
        bigQueue = new PriorityQueue<>(Comparator.reverseOrder());
        smallQueue = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (bigQueue.size() == 0 && smallQueue.size() == 0) {
            bigQueue.add(num);
            return;
        }
        if (bigQueue.size() == smallQueue.size() + 1) {
            if (num < bigQueue.peek()) {
                int topOfBig = bigQueue.poll();
                smallQueue.add(topOfBig);
                bigQueue.add(num);
            } else {
                smallQueue.add(num);
            }
            return;
        }
        if (smallQueue.size() == bigQueue.size() + 1) {
            if (num > smallQueue.peek()) {
                int topOfSmall = smallQueue.poll();
                bigQueue.add(topOfSmall);
                smallQueue.add(num);
            } else {
                bigQueue.add(num);
            }
            return;
        }
        if (bigQueue.size() == smallQueue.size()) {
            if (num > smallQueue.peek()) {
                smallQueue.add(num);
            } else {
                bigQueue.add(num);
            }
            return;
        }
    }

    public double findMedian() {
        if (bigQueue.size() > smallQueue.size()) {
            return bigQueue.peek();
        }
        if (smallQueue.size() > bigQueue.size()) {
            return smallQueue.peek();
        }
        if (smallQueue.size() == bigQueue.size()) {
            return (smallQueue.peek() + bigQueue.peek()) / 2d;
        }
        return 0;
    }
}
