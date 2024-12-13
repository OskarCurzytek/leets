import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if(nums.length == 1){
            List<Integer> singleList = new ArrayList<>();
            singleList.add(nums[0]);
            result.add(singleList);
            return result;
        }

        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            int[] restNums = new int[nums.length - 1];
            int idx = 0;

            for(int j = 0; j < nums.length; j++){
                if(j != i){
                    restNums[idx] = nums[j];
                    idx++;
                }
            }

            List<List<Integer>> perms = permute(restNums);
            for(List<Integer> p : perms){
                p.add(n);
            }

            result.addAll(perms);
        }

        return result;
    }
}