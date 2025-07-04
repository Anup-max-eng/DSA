class Solution {
     private HashSet<Character> set;
  
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
       set= new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        for(int i=0;i<words.length;i++){
            if(check(words[i])){
                count++;
            }
        }
   return count; }
     private boolean check(String word){
      for(int j=0;j<word.length();j++ ){
        if(!set.contains(word.charAt(j)))
        return false;
     
      }
      return true;
    }

}