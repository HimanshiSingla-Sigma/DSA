class Solution {
    public int longestConsecutive(int[] nums) {
        // sort the array 
        // and then count the elements which are consecutive and find the max length
        long maxCount = 1;
        long count = 1;
        if( nums.length == 0) return 0;
        Arrays.sort(nums);
        for( int i = 1 ; i < nums.length ; i++){
            if( nums[i] == (long)nums[i-1] + 1){
                count++;
                maxCount = Math.max(count, maxCount);
            }else if( nums[i] == nums[i-1]){
                continue;
            }else{
                count = 1;
            }
        }

        return (int)maxCount;
    }
}