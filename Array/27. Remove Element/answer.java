/*
 * Use double pointer one slow and one fast
 *
 */


class Solution {
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        int temp;
        int count = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
            else {
                count++;

            }
        }
        return nums.length - count;
    }
}