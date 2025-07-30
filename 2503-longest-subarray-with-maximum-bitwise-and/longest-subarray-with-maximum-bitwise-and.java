class Solution {
    public int longestSubarray(int[] nums) {
      int max = Integer.MIN_VALUE; int maxco=0; int count=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]>max)  max=nums[i];
      }
      for(int i=0;i<nums.length;i++){
        if(nums[i]==max){
         count++;
         maxco=Math.max(maxco,count);
        }
        else{
            count=0;
        }
         
    }    return maxco;}
}