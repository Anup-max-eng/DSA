class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for (char val : s.toCharArray()) {
            if (val == '*') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(val);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}
