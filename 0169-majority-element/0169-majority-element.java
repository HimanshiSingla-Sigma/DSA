class Solution {
    public int majorityElement(int[] nums) {
        // brute force 
        // count the occurence of each element 
        // find the element that appears more than n/2 times 
        // for( int i = 0 ; i < nums.length ; i++){
        //     int count = 0;
        //     for( int j = 0 ; j < nums.length ; i++){
        //         if( nums[i] == nums[j]){
        //             count++;
        //         }
        //     }
        //     if( count > nums.length/2){
        //         return nums[i];
        //     }
        // }
        // return -1;

        // optimal -> using hashmap 
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for( int i = 0 ; i < nums.length ; i++){
        //     map.put( nums[i] , map.getOrDefault(nums[i], 0) + 1);
        //     if( map.get(nums[i]) > nums.length / 2){
        //         return nums[i];
        //     }
        // }
        // return -1;

        // moore's voting algorithm
        int count = 0;
        int element = nums[0];
        for( int i = 0 ; i < nums.length ; i++){
    
            if( count == 0){
                element = nums[i];
            }

            if( nums[i] == element){
                count++;
            }else{
                count--;
            }
        }
        if( count > 0){
            int actualCount = 0;
            for( int i = 0 ; i < nums.length ; i++){
                if( nums[i] == element){
                    actualCount++;
                }
            }
            if( actualCount > nums.length/2) return element;
        }

        return -1;
    }
}