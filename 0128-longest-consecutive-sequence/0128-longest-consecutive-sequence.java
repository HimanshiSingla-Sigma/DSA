class Solution {
    public int longestConsecutive(int[] nums) {
        // use hashset 

        if( nums.length == 0) return 0;

        int maxLength = 1;
        HashSet<Integer> set = new HashSet<>();
        for( int num :  nums){
            set.add(num);
        }

        for( int num : set){

            int current = num;
            int count = 1;

            if( !set.contains( current-1) ){
                while(set.contains(current+1)){
                    count++;
                    current = current + 1;
                }

                maxLength = Math.max( maxLength, count);

            }
        }

        return maxLength;
        
    }
}