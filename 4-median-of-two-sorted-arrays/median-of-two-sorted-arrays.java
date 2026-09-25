class Solution {

    public double findMedianSortedArrays(int[] a, int[] b) {

        int m = a.length;
        int n = b.length;

        int[] c = new int[m + n];

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {

            if (a[i] < b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }

        while (i < m)
            c[k++] = a[i++];

        while (j < n)
            c[k++] = b[j++];

        int len = c.length;

        if (len % 2 == 1)
            return c[len / 2];

        return (c[len / 2 - 1] + c[len / 2]) / 2.0;
    }
}