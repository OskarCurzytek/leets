class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int j = height.length - 1;
        int i = 0;
        int volume = 0;
        if(height.length == 0){
            return 0;
        }
        while(i != j){

            volume = (j - i) * Math.min(height[i], height[j]);

            if(volume > max){
                max = volume;
            }

            if(height[i] <= height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}