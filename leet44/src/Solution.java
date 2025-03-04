import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> seen = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(seen.keySet().contains(nums[i]) && i - seen.get(nums[i]) <= k){
                return true;
            }else{
                seen.put(nums[i], i);
            }
        }

        return false;

    }
}