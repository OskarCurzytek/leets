import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            if(map.keySet().contains(i)){
                map.remove(i);
            }else{
                map.put(i, 1);
            }
        }

        return map.keySet().stream().findFirst().orElse(0).intValue();
    }
}