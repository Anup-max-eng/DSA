class Solution {
    public int minimumLength(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j && s.charAt(i) == s.charAt(j)) {
            char match = s.charAt(i);

            while (i <= j && s.charAt(i) == match) {
                i++;
            }

            while (j >= i && s.charAt(j) == match) {
                j--;
            }
        }

        return j - i + 1;
    }
}
