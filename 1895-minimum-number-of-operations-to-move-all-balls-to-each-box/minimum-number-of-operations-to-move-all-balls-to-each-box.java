class Solution {
    public int[] minOperations(String boxes) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < boxes.length(); i++) {
            int num = 0;
            for (int j = 0; j < boxes.length(); j++) {
                if (boxes.charAt(j) == '1' && i != j) {
                    num += Math.abs(i - j);
                }
            }
            arr.add(num);
        }
        
        int[] result = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }
        
        return result;
    }
}
