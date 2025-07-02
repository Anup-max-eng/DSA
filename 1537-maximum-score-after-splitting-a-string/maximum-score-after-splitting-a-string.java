class Solution {
    public int maxScore(String s) {
    int left =0; int right=0; int maxsum=0;
    if (s.length()==2 && s.charAt(0)=='0'  && s.charAt(1)=='0') return 1;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1'){
            right++;
        }
    }
    for(int i=0;i<s.length()-1;i++){
        if(s.charAt(i)=='0'){
            left++;
        }
        else {
            right--;
        }
        maxsum=Math.max(maxsum,left+right);
    }
        
    return maxsum;}
}






