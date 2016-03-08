package algorithm.lintcode.easy;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        Interval prev = new Interval(-1, -1);
        Iterator<Interval> iterator = intervals.iterator();
        while (iterator.hasNext()) {
            Interval interval = iterator.next();
            if (interval.start <= prev.end) {
                if (interval.end > prev.end) {
                    prev.end = interval.end;
                }
                iterator.remove();
            } else {
                prev = interval;
            }
        }
        return intervals;
    }

    public class Interval {
        int start, end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}