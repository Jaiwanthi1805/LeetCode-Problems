class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        String[] parts = path.split("/");

        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];

            if (part.equals("") || part.equals(".")) {
                continue;
            } 
            else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } 
            else {
                stack.push(part);
            }
        }

        String result = "";

        for (int i = 0; i < stack.size(); i++) {
            result = result + "/" + stack.get(i);
        }

        if (result.equals("")) {
            return "/";
        }

        return result;
    }
}