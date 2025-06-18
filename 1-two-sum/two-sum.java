class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> hsmp=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int kam=target-nums[i];
        if(hsmp.containsKey(kam)){
            return new int[]{hsmp.get(kam),i};
        }
        hsmp.put(nums[i],i);
    }
     
    return new int[]{};
    }
}