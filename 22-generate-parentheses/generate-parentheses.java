class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();

        Stack<String> strStack = new Stack<>();
        Stack<Integer> openStack = new Stack<>();
        Stack<Integer> closeStack = new Stack<>();

        strStack.push("");
        openStack.push(0);
        closeStack.push(0);

        while (!strStack.isEmpty()) {

            String str = strStack.pop();
            int open = openStack.pop();
            int close = closeStack.pop();

            if (str.length() == 2 * n) {
                result.add(str);
                continue;
            }

            if (open < n) {
                strStack.push(str + "(");
                openStack.push(open + 1);
                closeStack.push(close);
            }

            if (close < open) {
                strStack.push(str + ")");
                openStack.push(open);
                closeStack.push(close + 1);
            }
        }

        return result;
    }
}