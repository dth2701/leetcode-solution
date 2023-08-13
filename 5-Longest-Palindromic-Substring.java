class Solution {
    public String longestPalindrome(String s) {
        //Check empty string
        if (s == null || s.length() < 1) return "";

        int start = 0; 
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            // If the new palindrome length is greater than the previous longest one, start and end are updated to represent the new indices.
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }
    // This private helper method takes the string and two indices, left and right, and checks if the characters at these positions are the same.
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

}
