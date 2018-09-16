package person.sen.leetcode.leetcode4;

/**
 * @author senli
 */
public class LeetCode4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int flag1 = 0;
        int flag2 = 0;

        int target1 = 0;
        int target2 = 0;

        if (nums1.length + nums2.length == 0) {
            return 0d;
        }

        //decide the target position
        if ((nums1.length + nums2.length) % 2 == 0) {
            target1 = (nums1.length + nums2.length) / 2 - 1;
            target2 = (nums1.length + nums2.length) / 2;
        } else {
            target1 = (nums1.length + nums2.length - 1) / 2;
            target2 = (nums1.length + nums2.length - 1) / 2;
        }

        while (flag1 <= nums1.length || flag2 <= nums2.length) {
            if (flag1 + flag2 == target1 && flag1 + flag2 == target2) {
                return Math.max(nums1[flag1 == nums1.length ? flag1 - 1 : flag1],
                        nums2[flag2 == nums2.length ? flag2 - 1 : flag2]);
            }
            if (flag1 + flag2 == target1 && flag1 + flag2 + 1 == target2) {
                int number1 = Math.min(nums1[flag1], nums2[flag2]);
                number1 = Math.max(
                        number1,
                        Math.max(
                                flag1 == 0 ? 0 : nums1[flag1 - 1],
                                flag2 == 0 ? 0 : nums2[flag2 - 1])
                );

                int number2 = Math.max(Math.max(nums1[flag1], nums2[flag2]),
                        Math.min(nums1[flag1 >= nums1.length - 1 ? flag1 : flag1 + 1],
                                nums2[flag2 >= nums2.length - 1 ? flag2 : flag2 + 1]
                        )
                );
                if (number2 == number1) {
                    number2 = Math.max(nums1[flag1 + 1], nums2[flag2 + 1]);
                }

                return (number1 + number2) / 2d;
            }

            if (nums1[flag1] >= nums2[flag2]) {
                if (flag2 == nums2.length) {
                    flag1++;
                } else {
                    flag2++;
                }
            } else {
                if (flag1 == nums1.length) {
                    flag2++;
                } else {
                    flag1++;
                }
            }
        }
        return 0d;
    }
}
