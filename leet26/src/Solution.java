class Solution {
    public int maxSubArray(int[] nums) {

        if(nums == null){
            return 0;
        }else if(nums.length == 1){
            return nums[0];
        }

        int result = nums[0], max = nums[0];

        for(int i = 1; i < nums.length; i++){
            result = Math.max(result + nums[i], nums[i]);
            max = Math.max(result, max);
        }

        return max;
    }
}