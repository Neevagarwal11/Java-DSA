package Sorting.leetcode;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class LC56 {

    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(arr)));
    }


    static public int[][] merge(int[][] intervals) {

        if(intervals.length <=1){
            return intervals;
        }

        // Array sorted by their starting point
        Arrays.sort(intervals , Comparator.comparingInt(i -> i[0]));

        List<int[]> result = new ArrayList<>();

        int[] newInterval = intervals[0];
        result.add(newInterval);

        for(int[] interval : intervals){
            if(interval[0] <= newInterval[1]){
                newInterval[1] = Math.max(newInterval[1] , interval[1]);
            }else{
                newInterval = interval;
                result.add(newInterval);
            }

        }

        return result.toArray(new int [result.size()][]);

    }   
}
