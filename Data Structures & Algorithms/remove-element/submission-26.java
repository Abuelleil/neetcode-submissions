class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0, n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[--n];  // Swap with last, shrink n
            } else {
                i++;
            }
        }
        return n;  // n is the COUNT of valid elements
    }
}