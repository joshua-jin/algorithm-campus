package algorithm.lintcode.easy;

import java.util.ArrayList;

public class InsertInterval {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<Interval>();
        // write your code here
        int i = 0;
        while (i < intervals.size()) {
            if (intervals.get(i).end < newInterval.start) {
                result.add(intervals.get(i));
                i++;
            } else {
                break;
            }
        }
        if (i < intervals.size() && intervals.get(i).start < newInterval.start) {
            newInterval.start = intervals.get(i).start;
        }
        result.add(newInterval);
        while (i < intervals.size()) {
            if (intervals.get(i).start > newInterval.end) {
                result.add(intervals.get(i));
            } else if (intervals.get(i).end > newInterval.end) {
                newInterval.end = intervals.get(i).end;
            }
            i++;
        }
        return result;
    }

    public class Interval {
        int start, end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
