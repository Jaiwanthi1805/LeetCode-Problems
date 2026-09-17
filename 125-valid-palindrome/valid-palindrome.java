class Solution {
    public boolean isPalindrome(String s) {

        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                str = str + Character.toLowerCase(ch);
            }
        }

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != reverse.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}