class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int left = 0;
        int right = m;

        while (left <= right) {

            int mid1 = (left + right) / 2;

            int mid2 = (m + n + 1) / 2 - mid1;

            int left1;
            int right1;
            int left2;
            int right2;

            if (mid1 == 0) {
                left1 = Integer.MIN_VALUE;
            } else {
                left1 = nums1[mid1 - 1];
            }

            if (mid1 == m) {
                right1 = Integer.MAX_VALUE;
            } else {
                right1 = nums1[mid1];
            }

            if (mid2 == 0) {
                left2 = Integer.MIN_VALUE;
            } else {
                left2 = nums2[mid2 - 1];
            }

            if (mid2 == n) {
                right2 = Integer.MAX_VALUE;
            } else {
                right2 = nums2[mid2];
            }

            if (left1 <= right2 && left2 <= right1) {

                if ((m + n) % 2 == 1) {
                    return Math.max(left1, left2);
                }

                return (Math.max(left1, left2)
                        + Math.min(right1, right2)) / 2.0;
            }

            if (left1 > right2) {
                right = mid1 - 1;
            }

            else {
                left = mid1 + 1;
            }
        }

        return 0;
    }
}