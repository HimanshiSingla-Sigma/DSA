class Solution {
    public boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        
        for( char s : str.toCharArray()){
            if( s == '(' || s == '[' || s == '{'){
                stack.push(s);
            }else{
                if( stack.isEmpty()) return false;

                char ch = stack.pop();

                if( (s == ')' && ch != '(' ) || (s == '}' && ch != '{') || ( s == ']' && ch != '[')){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}