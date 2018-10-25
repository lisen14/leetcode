package person.sen.leetcode.leetcode452;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class LeetCode452 {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }

        Arrays.sort(points, Comparator.comparingInt(o -> o[0]));

        int shootNum = 1;
        //int shootBegin = points[0][0];
        int shootEnd = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] <= shootEnd) {
                //shootBegin = points[i][0];
                if(shootEnd > points[i][1]){
                    shootEnd = points[i][1];
                }
            }else{
                shootNum++;
                //shootBegin = points[i][0];
                shootEnd = points[i][1];
            }
        }

        return shootNum;
    }
}
