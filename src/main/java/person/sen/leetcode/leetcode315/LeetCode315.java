package person.sen.leetcode.leetcode315;

import java.util.ArrayList;
import java.util.List;

public class LeetCode315 {
    class Pair {
        public int left;
        public int right;

        public Pair(int left, int right) {
            this.left = left;
            this.right = right;

        }

        @Override
        public String toString() {
            return "(" + this.left + " , " + this.right + ")";
        }
    }


    public List<Integer> countSmaller(int[] nums) {
        List<Pair> vec = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            vec.add(new Pair(nums[i], i));
            count.add(0);
        }

        mergeSort(vec, count);
        return count;
    }

    private void mergeSort(List<Pair> vec, List<Integer> count) {
        if (vec.size() < 2) {
            return;
        }
        int mid = vec.size() / 2;
        List<Pair> subVec1 = new ArrayList<>();
        List<Pair> subVec2 = new ArrayList<>();
        for (int i = 0; i < mid; i++) {
            subVec1.add(vec.get(i));
        }
        for (int i = mid; i < vec.size(); i++) {
            subVec2.add(vec.get(i));
        }
        mergeSort(subVec1, count);
        mergeSort(subVec2, count);
        vec.clear();
        mergeSortTwoVec(subVec1, subVec2, vec, count);
    }

    private void mergeSortTwoVec(List<Pair> subVec1, List<Pair> subVec2, List<Pair> vec, List<Integer> count) {
        int i = 0;
        int j = 0;
        while (i < subVec1.size() && j < subVec2.size()) {
            if (subVec1.get(i).left <= subVec2.get(j).left) {
                int temp = count.get(subVec1.get(i).right);
                temp += j;
                count.set(subVec1.get(i).right, temp);
                vec.add(subVec1.get(i));
                i++;
            } else {
                vec.add(subVec2.get(j));
                j++;
            }
        }
        for (; i < subVec1.size(); i++) {
            int temp = count.get(subVec1.get(i).right);
            temp += j;
            count.set(subVec1.get(i).right, temp);
            vec.add(subVec1.get(i));
        }
        for (; j < subVec2.size(); j++) {
            vec.add(subVec2.get(j));
        }
    }
}
