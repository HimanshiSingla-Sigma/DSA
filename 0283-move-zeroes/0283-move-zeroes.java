class Solution {
    public void moveZeroes(int[] nums) {
        // two pointer solution 
        // without extra space

        int i = 0 ;
        for( int j = 0 ; j < nums.length ; j++){
            if( nums[j] != 0){
                // swap the elements
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                // now i will point to the next place jhan pe non zero element would be placed
                i++;
            }
        }
    }
}