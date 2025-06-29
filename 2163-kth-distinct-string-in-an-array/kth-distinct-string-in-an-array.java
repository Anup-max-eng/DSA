class Solution {
    public String kthDistinct(String[] arr, int k) {
        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();
        
    
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : arr) {
            if (map.get(s) == 1) {
                count++;
                if (count == k) {
                    return s;
                }
            }
        }

        return "";
    }
}
