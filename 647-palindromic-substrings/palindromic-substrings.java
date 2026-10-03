class Solution {
    public int countSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

                int left = i;
                int right = j;
                int found = 1;

                while (left < right) {

                    if (s.charAt(left) != s.charAt(right)) {
                        found = 0;
                        break;
                    }
                    left++;
                    right--;
                }
                if (found == 1) {
                    count++;
                }
            }
        }
        return count;
    }
}