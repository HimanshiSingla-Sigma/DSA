class Solution {
    public int[] sortedSquares(int[] nums) {

        // the array can also contain negative values 
        // therefore the highest value of square can either come from the rightmost value or the left most value 

        // use two pointers for this 
        // the two pointers will be left and right 
        // their squares will be compared and if square of left is greater 
        // place the value in the result at the end and move the left pointer
        // and same for right 

        int[] result = new int[nums.length];
        int k = result.length - 1;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            long leftSquare = (long) nums[left] * nums[left];
            long rightSquare = (long) nums[right] * nums[right];

            if (leftSquare >= rightSquare) {
                result[k] = (int)leftSquare;
                k--;
                left++;
            } else {
                result[k] = (int)rightSquare;
                k--;
                right--;
            }
        }

        return result;
    }
}