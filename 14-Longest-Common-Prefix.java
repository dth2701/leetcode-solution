class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        for (int length = 0; length < strs[0].length(); length++) {
            char c = strs[0].charAt(length);
            for (int i = 1; i < strs.length; i++) {
                if (length >= strs[i].length() || strs[i].charAt(length) != c)
                    return strs[0].substring(0, length);
            }
        }
        
        return strs[0];
    }
}
