class Solution {
    public List<Integer> findMissingElements(int[] nums) {
    List<Integer> list = new ArrayList<>();
     List<Integer> list2 = new ArrayList<>();

     int max=nums[0]; int min=nums[0]; 
     for(int i=0;i<nums.length;i++){
        if(nums[i]<min) min=nums[i];
        if(nums[i]>max) max=nums[i];
        list2.add(nums[i]);
        
     } 
    
     for(int i=min+1;i<max;i++){
       if (!list2.contains(i)) list.add(i);
     }
   


   return list; }
}