class Solution {
    public int[] sortedSquares(int[] nums) {
       int n=nums.length;
       int arr[]=new int[n];
       int left=0; int right=n-1; int index=n-1;
       while(left<=right){
        int leftmost=nums[left]*nums[left];
        int rightmost=nums[right]*nums[right];
        if(leftmost>rightmost){
            arr[index--]=leftmost;
            left++;
        }
        else{
            arr[index--]=rightmost;
            right--;
        }
       } 
return arr;    }
}