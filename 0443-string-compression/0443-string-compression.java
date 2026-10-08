class Solution {
    public int compress(char[] chars) {

        int write = 0;
        int i = 0;
        
        while( i < chars.length ){
            char current = chars[i];
            int count = 0;

            while( i < chars.length && current == chars[i]){
                count++;
                i++;
            }

            chars[write++] = current;

            if( count > 1){
                String num = String.valueOf(count);
                for( char digit : num.toCharArray()){
                    chars[write++] = digit;
                }
            }
        }

        return write;
    }
}