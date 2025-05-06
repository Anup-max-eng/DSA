class Solution {
    public int splitArray(int[] nums, int k) {
        int sum=0; int ans =-1; int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int st=0; int end=sum;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(isAllowed(nums,n,k,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
    return ans;}
    private boolean isAllowed(int arr[],int n,int k,int allowed){
      int sub=1; int allocation=0;
      for(int i=0;i<n;i++){
        if(arr[i]>allowed) return false;
        if(allocation+arr[i]<=allowed) {allocation+=arr[i];}
        else{sub++; allocation=arr[i];}
      }
    return sub>k? false:true;}
}