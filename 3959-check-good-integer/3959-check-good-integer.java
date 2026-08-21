class Solution {
    public boolean checkGoodInteger(int n) {
       int sum = 0;

        while (n > 0) {
            int d = n % 10;
            sum += d * (d - 1);
            n /= 10;
        }

        return sum >= 50; 
    }
}