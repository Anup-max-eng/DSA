class Solution {
    public int lengthOfLongestSubstring(String s) {
         HashSet<Character> hash = new HashSet<>();

          int left=0; int result=0;
          for(int right=0;right<s.length();right++){
            while(hash.contains(s.charAt(right))){
                hash.remove(s.charAt(left));
                left++;
            }
            hash.add(s.charAt(right));
             result=Math.max(result,right-left+1);
          }
          return result;
    }
}