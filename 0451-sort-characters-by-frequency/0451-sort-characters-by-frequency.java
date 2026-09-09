class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) +1);
        }

        ArrayList<Character> chars = new ArrayList<>();
        for( Character c : map.keySet()){
            chars.add(c);
        }

        Collections.sort(chars , (a,b) -> {
            return map.get(b) - map.get(a);
        });

        StringBuilder ans = new StringBuilder();

        for( Character c : chars ){
            for(int i = 0 ; i < map.get(c); i++){
                ans.append(c);
            }
        }

        return ans.toString();
    }
}