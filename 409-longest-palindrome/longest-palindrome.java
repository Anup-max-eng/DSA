class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==0) return 0;
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int length = 0; int temp=0;
        boolean oddFound = false;

        for (int val : freqMap.values()) {
            if (val % 2 == 0) {
                length += val;
            } else {
                length += val - 1; 
                
            }
        

        if (val%2==1) {
            if(temp<=0) temp++;
        } } 
        return length+temp;}
}