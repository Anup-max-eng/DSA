class Solution {
    public int maxSubArray(int[] nums) {
        int current =0; int sum=Integer.MIN_VALUE;
      for(int val:nums){
         current +=val;
        sum=Math.max(current,sum);
        if (current<0) current=0;
        
        
     }  
     return sum; }
}