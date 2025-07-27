class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        List<Integer> arr = new ArrayList<>();
        arr.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                arr.add(nums[i]);
            }
        }

        for (int i = 1; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i - 1) && arr.get(i) > arr.get(i + 1)) {
                count++; 
            } else if (arr.get(i) < arr.get(i - 1) && arr.get(i) < arr.get(i + 1)) {
                count++; 
            }
        }

        return count;
    }
}
