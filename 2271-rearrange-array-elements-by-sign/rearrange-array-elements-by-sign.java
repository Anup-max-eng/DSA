class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length / 2];
        int[] neg = new int[nums.length / 2];
        int k = 0, j = 0;

        // Separate positive and negative numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pos[k++] = nums[i];
            } else {
                neg[j++] = nums[i];
            }
        }

        int[] result = new int[nums.length];
        int p = 0, n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[i] = pos[p++];
            } else {
                result[i] = neg[n++];
            }
        }

        return result;
    }
}
