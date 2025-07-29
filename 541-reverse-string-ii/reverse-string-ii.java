class Solution {
    public String reverseStr(String s, int k) {

        StringBuilder st = new StringBuilder(s);          

        if (s.length() <= k) {
            int i = 0; 
            int j = st.length() - 1;
            while (i < j) {
                char temp = st.charAt(i);
                st.setCharAt(i, st.charAt(j));
                st.setCharAt(j, temp);
                i++; 
                j--;
            }
            return st.toString(); 
        }
        Boolean kalu=true;
        for(int i=0;i<st.length();i+=k){
            if(kalu){
        int left=i; int right;
        if(i+k<=st.length()) right=i+k-1;
        else right=st.length()-1;
         
         while (left < right) {
          char temp = st.charAt(left);
          st.setCharAt(left, st.charAt(right));
          st.setCharAt(right, temp);
          left++;
          right--;
         }
            }
          kalu=!kalu;}
       return st.toString();
        
    }
}
