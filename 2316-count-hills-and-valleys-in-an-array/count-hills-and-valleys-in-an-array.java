
class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        int n = nums.length;

        // Traverse the array while skipping consecutive duplicates
        for (int i = 1; i < n - 1; i++) {
            // Skip if nums[i] == nums[i - 1]
            if (nums[i] == nums[i - 1]) continue;

            // Find the previous distinct value
            int prev = i - 1;
            while (prev >= 0 && nums[prev] == nums[i]) prev--;

            // Find the next distinct value
            int next = i + 1;
            while (next < n && nums[next] == nums[i]) next++;

            // Ensure valid bounds
            if (prev >= 0 && next < n) {
                if ((nums[i] > nums[prev] && nums[i] > nums[next]) || 
                    (nums[i] < nums[prev] && nums[i] < nums[next])) {
                    count++;
                }
            }
        }

        return count;
    }
}

