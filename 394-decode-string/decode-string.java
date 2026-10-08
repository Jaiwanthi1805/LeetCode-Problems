class Solution {

    int index = 0;

    public String decodeString(String s) {
        String result = "";

        while (index < s.length() && s.charAt(index) != ']') {
            char ch = s.charAt(index);

            if (ch >= 'a' && ch <= 'z') {
                result = result + ch;
                index++;
            }
            else if (ch >= '0' && ch <= '9') {
                int k = 0;

                while (index < s.length() && s.charAt(index) >= '0' && s.charAt(index) <= '9') {
                    k = k * 10 + (s.charAt(index) - '0');
                    index++;
                }
                index++;
                String temp = decodeString(s);
                index++;

                for (int i = 0; i < k; i++) {
                    result = result + temp;
                }
            }
        }
        return result;
    }
}