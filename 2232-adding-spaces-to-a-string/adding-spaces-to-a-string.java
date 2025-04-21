class Solution {
    public String addSpaces(String s, int[] spaces) {
       StringBuilder t=new StringBuilder();
       int temp=0;
       for(int i=0;i<s.length();i++){
        if(temp<spaces.length && i==spaces[temp]){
         t.append(' ');
        temp++;
       }
       t.append(s.charAt(i));
    }    
      return t.toString();   }
   }
