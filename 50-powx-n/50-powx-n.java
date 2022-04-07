class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n == 1) return x;
        
        double res = 0;
        double num = myPow(x, Math.abs(n/2));
        if(n % 2 == 0) res = num * num;
        else res = num * num * x;
        
        if(n < 0) return 1/res;
        return res;
    }
}
