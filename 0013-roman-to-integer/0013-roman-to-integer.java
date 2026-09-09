class Solution {
    public int romanToInt(String s) {
        // agr current element ke baad vala usse bada hai to consider itself negative 
        // agr current element ke next vala usse barabar ya chota hai to consider khudko positive
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;

        for( int i = 0 ; i < s.length() - 1; i++){
            char a = s.charAt(i);
            char b = s.charAt(i+1);
            if( map.get(a) < map.get(b)){
                sum -= map.get(a);
            }else{
                sum += map.get(a);
            }
        }
        sum += map.get(s.charAt(s.length()- 1));

        return sum ;
    }
}