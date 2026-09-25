class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] arr = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {

            if (nums1[i] < nums2[j]) {
                arr[k] = nums1[i];
                i++;
            } 
            else {
                arr[k] = nums2[j];
                j++;
            }

            k++;
        }

        while (i < m) {
            arr[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n) {
            arr[k] = nums2[j];
            j++;
            k++;
        }
        int length = arr.length;

        if (length % 2 == 1) {

            return arr[length / 2];
        }
        else {

            int first = arr[length / 2 - 1];
            int second = arr[length / 2];

            return (first + second) / 2.0;
        }
    }
}