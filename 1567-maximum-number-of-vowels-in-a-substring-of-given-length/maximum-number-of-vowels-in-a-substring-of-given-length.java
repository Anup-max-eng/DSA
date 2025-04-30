class Solution {
    public int maxVowels(String s, int k) {
       int len=0; int maxlen=0;
       for(int i=0;i<k;i++){
        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
            len++;
        }
       }
       maxlen=len;
       
 for(int i=k;i<s.length();i++){
        //i have to remove the element at s.chatAt(k-i);
        //i have to add element at s.charAt(i);
         if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
            len++;
       } 
if(s.charAt(i - k)=='a'||s.charAt(i - k)=='e'||s.charAt(i - k)=='i'||s.charAt(i - k)=='o'||s.charAt(i - k)=='u'){
    len--;
}
         maxlen = Math.max(maxlen, len);
    }
    return maxlen;
}}