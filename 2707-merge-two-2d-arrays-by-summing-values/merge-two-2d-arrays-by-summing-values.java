class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int[] pair : nums1) {
            map.put(pair[0], map.getOrDefault(pair[0], 0) + pair[1]);
        }

        for (int[] pair : nums2) {
            map.put(pair[0], map.getOrDefault(pair[0], 0) + pair[1]);
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

      
        List<int[]> result = new ArrayList<>();
        for (int key : keys) {
            result.add(new int[]{key, map.get(key)});
        }

        return result.toArray(new int[result.size()][]);
    }
}
