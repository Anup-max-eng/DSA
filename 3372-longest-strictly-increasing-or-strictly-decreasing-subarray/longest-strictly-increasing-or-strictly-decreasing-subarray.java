class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int incresing = 1;
        int decresing = 1;
        int maxLen = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                decresing++;
                incresing = 1;
            } else if (nums[i] > nums[i - 1]) {
                incresing++;
                decresing = 1;
            } else {
                incresing = 1;
                decresing = 1;
            }
            maxLen = Math.max(maxLen, Math.max(incresing, decresing));
        }

        return maxLen;
    }}
