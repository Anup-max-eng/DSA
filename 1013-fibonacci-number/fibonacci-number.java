class Solution {
    public int fib(int n) {
       return solve(n);

    }
    int solve(int n){
        if(n==0) return 0;
        else if(n==1) return 1;
        int val1=solve(n-1);
        int val2=solve(n-2);
        return val1+val2;
    }
}