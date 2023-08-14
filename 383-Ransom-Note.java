class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Counting the frequency of each character in the magazine string
        for (char c : magazine.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Checking if the characters from ransomNote exist in the magazine string
        for (char c : ransomNote.toCharArray()) {
            // If a character in ransomNote doesn't exist in the hashmap or its count is zero, return false
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false;
            }

            // Decrease the count of the character in the hashmap
            charCount.put(c, charCount.get(c) - 1);
        }

        return true;
    }
}
