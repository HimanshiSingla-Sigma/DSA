class Solution {
    public int lengthOfLongestSubstring(String s) {
        // sliding window + hashset 
        // sliding window -> right pointer to increase the length of the substring with all unique characters 
        // if duplicate character is encountered then move left pointer ahead and remove that element at charAt(left) from set 

        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        int right = 0;

        while( right < s.length()){
            
            while( set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLength = Math.max( maxLength , right - left + 1);
            right++;
        }

        return maxLength;
    }

}