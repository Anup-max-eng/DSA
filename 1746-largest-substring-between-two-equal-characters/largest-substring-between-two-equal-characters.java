class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxLen=-1;
     for(int i=0;i<s.length();i++){
        for(int j=i+1;j<s.length();j++){
            if(s.charAt(i)==s.charAt(j)){
                maxLen = Math.max(maxLen, j - i - 1);
                    
            
            }
           
        }
     } 
  return maxLen;  }
}