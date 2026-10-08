class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // make the sorted order of each word as key in hashmap and add it to hashmap if
        // not present 

        HashMap<String , ArrayList<String>> map = new HashMap<>();

        for( String str : strs ){

            char arr[] = str.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            if( !map.containsKey(key)){
                map.put( key , new ArrayList<>());
            }

            map.get(key).add(str);
            
        }

        List<List<String>> ans = new ArrayList<>(map.values());
        
       return ans;
    }
}