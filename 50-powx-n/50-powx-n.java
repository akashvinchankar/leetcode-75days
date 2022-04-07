class Solution {
    public double myPow(double x, int n) {
        long l = n;
        if (n == 0) {
            return 1d;
        }
        if (l < 0) {
            x = 1/x;
            l = -l;
        }
        
        double half = myPow(x, (int)(l/2));
        
        if(l%2 == 0) {
            return half*half;
        }
        return half*half*x;
    }
}