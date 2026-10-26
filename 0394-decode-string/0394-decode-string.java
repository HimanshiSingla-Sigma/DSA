class Solution {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<StringBuilder> strings = new Stack<>();

        int num = 0;
        StringBuilder curr = new StringBuilder();
        
        for( char ch : s.toCharArray()){
            if( Character.isDigit(ch)){
                num = num * 10 + ch - '0';
            }else if( ch == '['){
                count.push(num);
                strings.push(curr);

                num = 0;
                curr = new StringBuilder();
            }else if( ch == ']'){
                StringBuilder prev = strings.pop();
                int k = count.pop();

                for( int i = 0 ; i < k ; i++){
                    prev.append(curr);
                }

                curr = prev;
            }else{
                curr.append(ch);
            }
        }

        return curr.toString();
    }
}