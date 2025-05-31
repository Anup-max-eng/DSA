class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int val : nums1) {
            set1.add(val);
        }

        for (int val : nums2) {
            set2.add(val);
        }

        List<Integer> onlyIn1 = new ArrayList<>();
        List<Integer> onlyIn2 = new ArrayList<>();

        for (int val : set1) {
            if (!set2.contains(val)) {
                onlyIn1.add(val);
            }
        }

        for (int val : set2) {
            if (!set1.contains(val)) {
                onlyIn2.add(val);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(onlyIn1);
        result.add(onlyIn2);

        return result;
    }
}