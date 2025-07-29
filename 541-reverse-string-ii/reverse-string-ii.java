class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder st = new StringBuilder(s);

        for (int i = 0; i < st.length(); i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, st.length() - 1); 
            while (left < right) {
                char temp = st.charAt(left);
                st.setCharAt(left, st.charAt(right));
                st.setCharAt(right, temp);
                left++;
                right--;
            }
        }

        return st.toString();
    }
}
