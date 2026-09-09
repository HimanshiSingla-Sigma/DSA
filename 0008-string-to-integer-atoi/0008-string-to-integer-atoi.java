class Solution {
    public int myAtoi(String s) {
        int ans = 0;
        int i = 0;
        int n = s.length();
        int sign = 1;

        while( i < n && s.charAt(i) == ' '){
            i++;
        }

        if( i < n && s.charAt(i) == '-'){
            sign = -1;
            i++;
        }else if( i < n && s.charAt(i) == '+'){
            sign = 1;
            i++;
        }

        while( i < n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            if( (ans > Integer.MAX_VALUE / 10) || ( ans == Integer.MAX_VALUE /10 && digit > 7 )){
                if( sign == -1){
                    return Integer.MIN_VALUE;
                }else{
                    return Integer.MAX_VALUE;
                }
            }
            ans = ans * 10 + digit;
            i++;
        }

        return ans*sign;
    }
}