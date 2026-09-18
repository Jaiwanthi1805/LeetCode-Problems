class Solution {
    public String reverseWords(String s) {

        String ans = "";
        String word = "";

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) != ' ') {
                word = s.charAt(i) + word;
            } 
            else {
                if (word.length() > 0) {
                    if (ans.length() > 0) {
                        ans = ans + " ";
                    }

                    ans = ans + word;
                    word = "";
                }
            }
        }
        if (word.length() > 0) {
            if (ans.length() > 0) {
                ans = ans + " ";
            }
            ans = ans + word;
        }
        return ans;
    }
}