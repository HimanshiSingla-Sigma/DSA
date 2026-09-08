class Solution {
    public int[] rearrangeArray(int[] nums) {
        // brute force
        // create two separate arrays one for positive and one for negative 
        int n = nums.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for( int i = 0 ; i < nums.length ; i++){
            if( nums[i] > 0 ){
                pos.add(nums[i]);
            }else{
                neg.add(nums[i]);
            }
        }

        int index = 0;
        for( int i = 0 ; i < pos.size() ; i++){
            nums[index++] = pos.get(i);
            nums[index++] = neg.get(i);
        }

        return nums;
    }
}