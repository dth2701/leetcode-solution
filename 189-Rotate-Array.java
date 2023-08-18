class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // in case k > n
        int[] temp = new int[k];
        // Copy the last k elements to temp
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        // Shift nums to the right by k positions
        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        // Copy temp to the beginning of nums
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}
