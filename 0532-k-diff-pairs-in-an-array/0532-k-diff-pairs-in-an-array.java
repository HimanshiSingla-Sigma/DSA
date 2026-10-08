class Solution {
    class Pair{
        int first;
        int second;
        public Pair(int first , int second){
            this.first = first;
            this.second = second;
        }

        @Override 
        public boolean equals(Object o){
            Pair p = (Pair) o;
            return this.first == p.first && this.second == p.second;
        }

        @Override
        public int hashCode(){
            return Objects.hash(first, second);
        }
    }
    public int findPairs(int[] nums, int k) {

        // first find the frequency of all the characters
        // as if k = 0 , that means the diff = 0 and hence we need two same numbers 

        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Pair> set = new HashSet<>();

        for( int num : nums){
            map.put( num , map.getOrDefault(num, 0) + 1);
        }

        for( int key : map.keySet()){
            if( k == 0){
                if( map.get(key) >= 2){
                    set.add(new Pair(key, key));
                }
            }else{
                if( map.containsKey(key+k)){
                    set.add(new Pair(key, key+k));
                }
            }
        }

        return set.size();
    }
}