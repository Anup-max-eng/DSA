class Solution {
    public int maximumLength(int[] nums) {
    int odd = 0, even = 0;

    for (int num : nums) {
        if (num % 2 == 0) even++;
        else odd++;
    }

    int altCount = 1;          
    int last = nums[0];       

    for (int i = 1; i < nums.length; i++) {
        if ((last + nums[i]) % 2 == 1) {  
            altCount++;
            last = nums[i];              
        }
    }

    return Math.max(Math.max(odd, even), altCount);
}

    }
