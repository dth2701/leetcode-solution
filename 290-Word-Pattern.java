class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        HashMap<Character, String> charToStringMap = new HashMap<>();
        HashMap<String, Character> stringToCharMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            String currentWord = words[i];

            // Check if there is a mapping from currentChar to a word other than currentWord
            if (charToStringMap.containsKey(currentChar) && !charToStringMap.get(currentChar).equals(currentWord)) {
                return false;
            }

            // Check if there is a mapping from currentWord to a character other than currentChar
            if (stringToCharMap.containsKey(currentWord) && stringToCharMap.get(currentWord) != currentChar) {
                return false;
            }

            // Add the mapping from currentChar to currentWord and from currentWord to currentChar
            charToStringMap.put(currentChar, currentWord);
            stringToCharMap.put(currentWord, currentChar);
        }

        return true;
    }
}
