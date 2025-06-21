class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        HashMap<Integer, Integer> hsmp = new HashMap<>();

        for (int j = 0; j < nums.length; j++) {
            if (prefix[j] == k) {
                count++;
            }

            int val = prefix[j] - k;
            if (hsmp.containsKey(val)) {
                count += hsmp.get(val);
            }

            hsmp.put(prefix[j], hsmp.getOrDefault(prefix[j], 0) + 1);
        }

        return count;
    }
}
