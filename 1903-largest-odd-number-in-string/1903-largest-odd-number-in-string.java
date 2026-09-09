class Solution {
    // start from the last 
    // if from the last the digit is even -> skip and move ahead 
    // is digit is odd that means it is the largest odd number possible as odd me hume sirf 
    // last digit se hi matlb hota hai 
    // so return 0 to i+1;
    // if for loop se return nhi hua to return ""
    public String largestOddNumber(String num) {
        int n = num.length();
        for( int i = n-1; i >= 0 ; i--){
            if( (num.charAt(i) - '0') % 2 != 0 ){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}