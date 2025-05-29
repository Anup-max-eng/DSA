class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
 
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        if (set.size() < 3) {
            int max = Integer.MIN_VALUE;
            for (int num : set) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }

       
        for (int j = 0; j < 2; j++) {
            int max = Integer.MIN_VALUE;
            for (int num : set) {
                if (num > max) {
                    max = num;
                }
            }
            set.remove(max);
        }

        int thirdMax = Integer.MIN_VALUE;
        for (int num : set) {
            if (num > thirdMax) {
                thirdMax = num;
            }
        }

        return thirdMax;
    }
}