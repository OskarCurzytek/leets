import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> frequencies = new HashMap<>();
        int number = 0, max = Integer.MIN_VALUE;

        for(int num : nums){
            if(frequencies.keySet().contains(num)){
                frequencies.put(num, frequencies.get(num) + 1);
            }else{
                frequencies.put(num, 1);
            }

            if(frequencies.get(num) > max){
                max = frequencies.get(num);
                number = num;
            }
        }

        return number;
    }
}