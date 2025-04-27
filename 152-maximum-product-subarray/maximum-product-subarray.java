class Solution {
    public int maxProduct(int[] nums) {
        int sum =Integer.MIN_VALUE;
        int prefix=1; int sufix=1;
        for(int i=0;i<nums.length;i++){
            if(prefix==0) prefix=1;
            if(sufix==0) sufix=1;
            prefix=prefix*nums[i];
            sufix=sufix*nums[nums.length-i-1];
          sum=Math.max(sum,Math.max(prefix,sufix));
        }
        
     
     return sum; 
    }
}