class Solution {
    public int arrangeCoins(int n) {
        int left = 0, right = n;
        int numRows = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long coinsNeeded = (long) mid * (mid + 1) / 2;

            if (coinsNeeded == n) {
                return mid; 
            } else if (coinsNeeded < n) {
                numRows = mid; 
                left = mid + 1;
            } else {
                right = mid - 1; 
            }
        }

        return numRows;
    }
}
