class Solution {
    public boolean rotateString(String s, String goal) {
        // brute force 
        // maximum number of times for which the string can be rotated is equal to its length
        // agr uske baad bhi rotate kia to cheezen repeate hongi
        for( int i = 0; i < s.length() ; i++){
            String rotated = "";
            for( int j = i ; j < s.length() ; j++){
                rotated += s.charAt(j);
            }

            for( int j = 0; j < i ; j++){
                rotated += s.charAt(j);
            }

            if( rotated.equals(goal)){
                return true;
            }
        }
        return false;
    }
}