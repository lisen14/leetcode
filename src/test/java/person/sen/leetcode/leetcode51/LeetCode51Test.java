package person.sen.leetcode.leetcode51;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LeetCode51Test {

    private LeetCode51 leetCode51 = new LeetCode51();

    @Test
    public void solveNQueens() {
        List<List<String>> result = leetCode51.solveNQueens(9);
        for(List<String> item : result){
            for(String item2 : item){
                System.out.println(item2);
            }
            System.out.println("**************************");
        }
    }
}
