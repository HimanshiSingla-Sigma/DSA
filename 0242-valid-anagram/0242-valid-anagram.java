class Solution {
    public boolean isAnagram(String s, String t) {
        // sorting -> time complexity -> o(nlogn)
        // char[] s1 = s.toCharArray();
        // char[] t1 = t.toCharArray();

        // Arrays.sort(s1);
        // Arrays.sort(t1);
        
        // return Arrays.equals(s1,t1);

        // optimal approch => time complexity -> o(n)
        if( s.length() != t.length()) return false;

        int[] freq = new int[26];

        for( int i = 0 ; i < s.length() ; i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for( int i : freq){
            if( i != 0) return false;
        }

        return true;
    }
}