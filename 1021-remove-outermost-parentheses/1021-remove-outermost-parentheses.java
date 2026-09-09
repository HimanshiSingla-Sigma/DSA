class Solution {
    // count is 0 when we are at the starting of the string and
    // when we are the at the end of valid parenthesis string 
    // that means number of opening brackets are equal to the number of closing brackets 
    // increase count by 1 if opening bracket
    // decrease count by 1 if clsoing bracket
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder ans = new StringBuilder();
        for( char c : s.toCharArray()){
            if( c == '('){
                if( count > 0){
                    ans.append(c);
                }
                count++;
            }else{
                count--;
                if( count > 0){
                    ans.append(c);
                }
            }
        }

        return ans.toString();
    }
}