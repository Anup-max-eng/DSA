
class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int totalLength = n + k - 1;
        int a = 1, b = 0;

        for (int i = 1; i < totalLength; i++) {
            int curr = colors[i % n];
            int prev = colors[(i - 1) % n];

            if (curr != prev) {
                a++;
                if (a == k) {
                    b++;
                    a--;
                }
            } else {
                a = 1;
            }
        }

        return b;
    }
}
