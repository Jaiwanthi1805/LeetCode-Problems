class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        Stack<String> stack = new Stack<>();

        for (String part : parts) {
            if (part.equals(".") || part.equals("")) {
                continue;
            } else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(part);
            }
        }

        String result = "";

        for (String s : stack) {
            result += "/" + s;
        }

        if (result.equals("")) {
            return "/";
        }

        return result;
    }
}