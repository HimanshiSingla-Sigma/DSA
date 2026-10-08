class Solution {
    public int mySqrt(int x) {

        // binary search on answers 
        int low = 1;
        int high = x;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((long)mid * mid == x)
                return mid;
            else if ((long)mid * mid > x)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return high;
    }
}