class Solution {
    // breadth-first search
    public int jump(int[] nums) {
        if (nums == null || nums.length < 2) return 0;

        int jumps = 0;
        int currentLevelEnd = 0;
        int nextLevelEnd = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            // Try to update the nextLevelEnd using current index.
            nextLevelEnd = Math.max(nextLevelEnd, i + nums[i]);

            // If we've reached the end of the current level.
            if (i == currentLevelEnd) {
                jumps++; // Move to the next level.
                currentLevelEnd = nextLevelEnd;

                if (currentLevelEnd >= nums.length - 1) {
                    return jumps;
                }
            }
        }
        return jumps;
    }
}
