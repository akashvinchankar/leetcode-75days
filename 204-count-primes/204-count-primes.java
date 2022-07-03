class Solution {

    public int countPrimes(int n) {
        if (n <= 2) return 0;

        boolean[] composites = new boolean[n]; // array intitalizes with false value default

        int limit = (int) Math.sqrt(n);
        for (int i = 2; i <= limit; i++) {
            if (composites[i] == false) {   // check if it is prime
                for (int j = i * i; j < n; j += i) {
                    composites[j] = true;   // mark the multiples of as true means they are composite 
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (composites[i] == false) {  // if the number is non composite / prime increment the count
                count++;
            }
        }
        return count;
    }
}
