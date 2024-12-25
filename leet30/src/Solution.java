class Solution {
    public boolean canJump(int[] nums) {

        int moves = 0;

        for(int i = 0; i < nums.length; i++){

            if(moves < 0){
                return false;
            }else if(nums[i] > moves){
                moves = nums[i];
            }

            moves--;


        }

        return true;
    }
}