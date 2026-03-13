
import java.util.*;

class overlapping{

    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int count = 0;
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] < end) {
                count++;
            } else {
                end = intervals[i][1];
            }
        }

        return count;
    }

    public static void main(String[] args) {

        overlapping obj = new overlapping();

        int[][] intervals = {
            {1,2},
            {2,3},
            {3,4},
            {1,3}
        };

        int result = obj.eraseOverlapIntervals(intervals);

        System.out.println("Minimum intervals to remove: " + result);
    }
}