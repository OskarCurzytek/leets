import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {

        if(intervals.length <= 1){
            return intervals;
        }

        Arrays.sort(intervals, (x, y) -> Integer.compare(x[0], y[0]));

        List<int[]> result = new ArrayList<>();
        int[] interval = intervals[0];
        result.add(interval);

        for(int[] i : intervals){
            if(i[0] <= interval[1]){
                interval[1] = Math.max(interval[1], i[1]);
            }else{
                interval = i;
                result.add(interval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}