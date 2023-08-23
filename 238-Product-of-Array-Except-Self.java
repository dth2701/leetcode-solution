class Solution {
    public int[] productExceptSelf(int[] nums) {
    int n = nums.length;

    // Create left and right arrays
    int[] left = new int[n];
    int[] right = new int[n];
    int[] result = new int[n];

    // Leftmost value of left array is always 1
    left[0] = 1;
    for (int i = 1; i < n; i++) {
        left[i] = nums[i - 1] * left[i - 1];
    }

    // Rightmost value of right array is always 1
    right[n - 1] = 1;
    for (int i = n - 2; i >= 0; i--) {
        right[i] = nums[i + 1] * right[i + 1];
    }

    // Multiply values of left and right arrays to get the result
    for (int i = 0; i < n; i++) {
        result[i] = left[i] * right[i];
    }
    
    return result;        
    }
}
