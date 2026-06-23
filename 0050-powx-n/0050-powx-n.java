class Solution {
    public double myPow(double x, int n) {
        long N= n;

        if(N < 0){
            x= 1/x;
            N=-N;
        }

        return  PowerX(x,N); 
    }

    public double PowerX(double x, long n){
        if (n==0){
            return 1;
        }

        double half = PowerX(x, n/2);
        if(n%2 == 0) return half*half;

        return half*half*x;
    }
}