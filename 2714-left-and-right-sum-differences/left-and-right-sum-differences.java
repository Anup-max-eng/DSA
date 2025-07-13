class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftsum = new int[n];
        int[] rightsum = new int[n];
        int[] result = new int[n];

        int prev = 0;
        for (int i = 0; i < n; i++) {
            leftsum[i] = prev;
            prev += nums[i];  
        }

        prev = 0;
        for (int i = n - 1; i >= 0; i--) {
            rightsum[i] = prev;
            prev += nums[i];  
        }
        for (int i = 0; i < n; i++) {
            result[i] = Math.abs(leftsum[i] - rightsum[i]);
        }

        return result;
    }
}
