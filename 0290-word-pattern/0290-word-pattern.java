class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        char pat[] = pattern.toCharArray();
        String arr[] = s.split(" ");


        if (pat.length != arr.length) {
            return false;
        }

        for (int i = 0; i < pat.length; i++) {

            char a = pat[i];
            String b = arr[i];

            if( map1.containsKey(a) && !map1.get(a).equals(b) ){
                return false;
            }

            if( map2.containsKey(b) && map2.get(b) != a ){
                return false;
            }

            map1.put(a, b);
            map2.put(b,a);

        }

        return true;

    }
}