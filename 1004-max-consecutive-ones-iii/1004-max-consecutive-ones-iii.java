class Solution {
    public int longestOnes(int[] nums, int k) {
        // same approach as longest subarray of 1's after deleting one element 
        int zeroFlip = 0;
        int maxLength = 0;
        int left = 0;
        
        for( int right = 0 ; right < nums.length ; right++){
            if(nums[right] == 0){
                zeroFlip++;
            } 

            while( zeroFlip > k){
                if( nums[left] == 0){
                    zeroFlip--;
                }
                left++;
            }

            maxLength = Math.max( maxLength , right - left + 1);
        }

        return maxLength;
    }
}