class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int val;
        int idx;

        while (high >= low) { // contains == because [high == low] might contain target value
            idx = (high + low) / 2;
            val = nums[idx];
            if (val == target) {
                return idx;
            }
            //not target, move depending on num
            else if (val > target) {
                //move high
                high = idx - 1;
            }
            else {
                low = idx + 1; //
            }
        }
        return -1;
    }
}
