class Solution {
    public boolean isIsomorphic(String s, String t) {
        //Base Case
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> stMap = new HashMap<>();
        HashMap<Character, Character> tsMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // Check if there is a mapping from sChar to a character other than tChar
            if (stMap.containsKey(sChar) && stMap.get(sChar) != tChar) {
                return false;
            }

            // Check if there is a mapping from tChar to a character other than sChar
            if (tsMap.containsKey(tChar) && tsMap.get(tChar) != sChar) {
                return false;
            }

            // Add the mapping from sChar to tChar and from tChar to sChar
            stMap.put(sChar, tChar);
            tsMap.put(tChar, sChar);
        }

        return true;
    }
}
