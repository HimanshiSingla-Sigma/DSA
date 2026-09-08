class Solution {
    public int longestConsecutive(int[] nums) {
        // sort the array 
        // and then count the elements which are consecutive and find the max length
        // long maxCount = 1;
        // long count = 1;
        // if( nums.length == 0) return 0;
        // Arrays.sort(nums);
        // for( int i = 1 ; i < nums.length ; i++){
        //     if( nums[i] == (long)nums[i-1] + 1){
        //         count++;
        //         maxCount = Math.max(count, maxCount);
        //     }else if( nums[i] == nums[i-1]){
        //         continue;
        //     }else{
        //         count = 1;
        //     }
        // }

        // return (int)maxCount;

        // optimal solution using hashset 
        // for every element we will check ki ye kisi sequence ka starting point hai ya nhi 
        // by checking if element - 1 is there in the hashset or not 
        // if element - 1 is not there in the hashset 
        // to element is the starting point and we will check ki set ke ander consecutive elements ka count kitna hai 
        // then find the maximum length 
        HashSet<Integer> set = new HashSet<>();
        if( nums.length == 0) return 0;
        int maxLen = 1;
        int len = 1;
        for( int num : nums){
            set.add( num );
        }

        for( int num : set){
            // this means the element is the starting point of a sequence
            if( !set.contains(num-1)){
                int current = num;
                len = 1;
                while( set.contains(current+1)){
                    current++;
                    len++;
                }
            }
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}