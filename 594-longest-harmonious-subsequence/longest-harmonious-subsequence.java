class Solution {
    public int findLHS(int[] nums) {
    Arrays.sort(nums);
    int maxlen=0;
    for(int i=0;i<nums.length;i++){
    int j=i+1;
    while(j<nums.length){
        if(nums[j]-nums[i]==1){
            maxlen=Math.max(maxlen,j-i+1);

        }
  j++;  }

    }
    return maxlen;
    }
}