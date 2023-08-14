class Solution {
    public int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0; // edge case

    int k = 1;
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[i - 1]) {
            nums[k++] = nums[i]; // copy the next unique value to the new position
        }
    }
    return k; // k represents the number of unique elements
    }
}
