package person.sen.leetcode.leetcode295;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MedianFinderTest {

    MedianFinder medianFinder = new MedianFinder();

    @Test
    public void findMedian() {
        int[] parameter = {1, 3, 5, 4, 6, 2};
        for (int num :
            parameter) {
            medianFinder.addNum(num);
        }

        Assert.assertEquals(3.5d, medianFinder.findMedian(), 0.000000000001);
    }
}
