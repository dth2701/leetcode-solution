class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; //Tracking the position to place the next non-matching value.
        for (int i = 0; i < nums.length; i++) {
        if (nums[i] != val) {
            nums[k++] = nums[i]; // copy the non-matching value to the new position
        }
    }
    return k;
    }
}
