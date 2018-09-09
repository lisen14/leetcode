package person.sen.leetcode.leetcode3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author senli
 */
public class LeetCode3 {
    public int lengthOfLongestSubstring(String s) {

        char[] chars = s.toCharArray();

        if (chars.length <= 1) {
            return chars.length;
        }

        int head = 0;
        int tail = 0;

        int result = 1;

        while (tail < chars.length) {
            if (isUnique(chars, head, tail)) {
                if (tail - head >= result) {
                    result = tail - head + 1;
                }
                tail++;
            } else {
                if (tail - head == 1) {
                    tail++;
                } else {

                    head++;
                }
            }
        }

        return result;
    }

    private boolean isUnique(char[] chars, int head, int tail) {
        Set<Character> temp = new HashSet<Character>();
        for (int i = head; i <= tail; i++) {
            temp.add(chars[i]);
        }
        return temp.size() == tail - head + 1;
    }
}
