class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int val:nums){
            if(set.contains(val)) {
                return val ;
            }
            else {
                set.add(val);
            }
        }
    return -1;}
}