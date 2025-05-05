class Solution {
    public int minOperations(String s) {
        StringBuilder t = new StringBuilder(s);
        StringBuilder k = new StringBuilder(s);
        int temp1 = 0, temp2 = 0;

        for (int i = 0; i < t.length(); i++) {
            if (i % 2 == 0) t.setCharAt(i, '0');
            else t.setCharAt(i, '1');
        }

        for (int i = 0; i < k.length(); i++) {
            if (i % 2 == 0) k.setCharAt(i, '1');
            else k.setCharAt(i, '0');
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) temp1++;
            if (s.charAt(i) != k.charAt(i)) temp2++;
        }

        return Math.min(temp1, temp2);
    }
}
