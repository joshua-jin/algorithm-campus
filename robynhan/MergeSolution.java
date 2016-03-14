package org.robynhan.week8;

import org.robynhan.Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeSolution {
    public List<Interval> merge(List<Interval> intervals) {
        // write your code here
        if (intervals == null || intervals.size() == 0) {
            return intervals;
        }
        int N = intervals.size();

        // sort
        Interval[] intervalArray = intervals.toArray(new Interval[N]);
        Arrays.sort(intervalArray, new Comparator<Interval>() {
            @Override
            public int compare(Interval interval1, Interval interval2) {
                return interval1.start - interval2.start;
            }
        });

        // merge
        ArrayList<Interval> result = new ArrayList<>();
        Interval mover = intervalArray[0];
        for (int i = 1; i < N; ++i) {
            if (mover.end < intervalArray[i].start) {
                result.add(mover);
                mover = intervalArray[i];
            } else {
                mover.end = Math.max(mover.end, intervalArray[i].end);
            }
        }
        result.add(mover);
        return result;
    }
}
