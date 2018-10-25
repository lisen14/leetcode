package person.sen.leetcode.leetcode22;

import java.util.ArrayList;
import java.util.List;

public class LeetCode22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate("", n, n, result);
        return result;
    }

    private void generate(String s, int left, int right, List<String> result) {
        if (left == 0 && right == 0) {
            result.add(s);
            return;
        }

        if (left > 0) {
            generate(s + "(", left - 1, right, result);
        }
        if (left < right) {
            generate(s + ")", left, right-1, result);
        }
    }
}
