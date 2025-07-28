class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < colors.length; i++) {
            arr.add(colors[i]);
        }

        for (int i = 0; i < k - 1; i++) {
            arr.add(colors[i]);
        }

        int a = 1;
        int b = 0; 

        for (int i = 1; i < arr.size(); i++) {
            if (!arr.get(i).equals(arr.get(i - 1))) {
                a++;
                if (a == k) {
                    b++;
                    a--; 
                }
            } else {
                a = 1; 
            }
        }

        return b;
    }
}
