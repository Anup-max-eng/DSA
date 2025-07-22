class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set=new HashSet<Integer>();
        int maxscore=0; int score=0;
        int j=0;
        for(int num:nums){
            while(set.contains(num)){
                set.remove(nums[j]);
                score=score-nums[j];
                j++;
            }
            {
            score=score+num;
            set.add(num);}
            maxscore=Math.max(maxscore,score);       
        
        }return maxscore;
}}