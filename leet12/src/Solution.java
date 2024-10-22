import java.util.stream.IntStream;

class Solution {
    public int searchInsert(int[] nums, int target) {

        int res = nums.length;

        if(IntStream.of(nums).anyMatch(x -> x == target)){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == target){
                    return i;
                }
            }
        }else{
            for(int i = 0; i < nums.length; i++){
                if(nums[i] > target){
                    return i;
                }
            }
        }

        return res;
    }
}