class Solution {
    public boolean rotateString(String s, String goal) {
        // brute force 
        // time complexity -> O(n2)
        // maximum number of times for which the string can be rotated is equal to its length
        // agr uske baad bhi rotate kia to cheezen repeate hongi
        // if( s.length() != goal.length()){
        //     return false;
        // }
        // for( int i = 0; i < s.length() ; i++){
        //     String rotated = "";
        //     for( int j = i ; j < s.length() ; j++){
        //         rotated += s.charAt(j);
        //     }

        //     for( int j = 0; j < i ; j++){
        //         rotated += s.charAt(j);
        //     }

        //     if( rotated.equals(goal)){
        //         return true;
        //     }
        // }
        // return false;

        // optimal solution
        // if you concatenate a string with itself , it will contain all rotations 
        // as substring in it 
        // time complexity -> O(n)
        // KMP -> to find a substring in a given string

        if( s.length() != goal.length()) return false;
        String str = s+s;
        if ( str.indexOf(goal) != -1) return true;
        return false;
    }
}