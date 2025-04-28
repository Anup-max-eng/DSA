class Solution {
    public int maxArea(int[] height) {
       int maxWater=0;
        int lp=0; int rp=height.length-1;
        while(lp<rp){
            int wdt=rp-lp;
            int ht=Math.min(height[lp],height[rp]);
            int curr=wdt*ht;
            maxWater=Math.max(maxWater,curr);
            if(height[lp]<height[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }

            
        
       
       return maxWater;
    }
}