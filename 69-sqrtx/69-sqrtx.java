class Solution {
    public int mySqrt(int x) {
        
        if(x == 0) {
            return 0;
        }
        
        int s = 1;
        int e = x;
        
        while(s <= e) {
            int mid = s + (e - s) / 2;
            if(x / mid > mid) {
                s = mid + 1;
            } else if(x / mid < mid){
                e = mid - 1;
            } else {
                return mid;
            }
        }
        return s - 1;
    }
}