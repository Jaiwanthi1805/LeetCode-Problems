class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];

        int left = 0;
        int max = 0;
        int result = 0;

        for (int right = 0; right < s.length(); right++) {

            count[s.charAt(right) - 'A']++;

            if (count[s.charAt(right) - 'A'] > max) {
                max = count[s.charAt(right) - 'A'];
            }
            while ((right - left + 1) - max > k) {

                count[s.charAt(left) - 'A']--;

                left++;
            }
            if (right - left + 1 > result) {
                result = right - left + 1;
            }
        }
        return result;
    }
}