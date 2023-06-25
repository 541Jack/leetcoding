class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int front = 0;
        int back = nums.length - 1;
        int index = back;
        int tempf;
        int tempb;

        while(front != back) {
            tempf = nums[front];
            tempb = nums[back];
            if (tempf < 0) {
                tempf = tempf * -1;
            }
            if (tempb < 0) {
                tempb = tempb * -1;
            }
            if(tempb > tempf) {
                ans[index] = tempb * tempb;
                back--;
            }
            else {
                ans[index] = tempf * tempf;
                front++;
            }
            index--;
        }
        tempb = nums[front];
        ans[index] =  tempb* tempb;
        return ans;

    }
}
