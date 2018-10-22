package person.sen.leetcode.leetcode402;

import java.util.Stack;

public class LeetCode402 {
    public String removeKdigits(String num, int k) {
        Stack<Integer> numStack = new Stack<>();
        StringBuffer result = new StringBuffer();

        char[] chars = num.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int number = Integer.valueOf(chars[i] + "");
            while (numStack.size() > 0 && numStack.peek() > number && k > 0) {
                numStack.pop();
                k--;
            }
            if (numStack.size() != 0 || number != 0) {
                numStack.push(number);
            }

        }
        while (numStack.size() > 0 && k > 0) {
            numStack.pop();
            k--;
        }
        for (Integer numberResult : numStack) {
            result.append(numberResult);
        }

        return result.toString().equals("") ? "0" : result.toString();
    }
}
