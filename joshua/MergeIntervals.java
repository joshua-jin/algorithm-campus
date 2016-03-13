package com.lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Joshua
 * Date:     3/8/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/merge-intervals/">合并区间</a>
 */
public class MergeIntervals {
      public class Interval {
          int start, end;

          Interval(int start, int end) {
              this.start = start;
              this.end = end;
          }
      }

    /**
     * @param intervals: Sorted interval list.
     * @return: A new sorted interval list.
     */
    public List<Interval> merge(List<Interval> intervals) {
        // write your code here
        Boolean isMerged = Boolean.TRUE;
        while (isMerged) {
            isMerged = mergeInterval(intervals);
        }
        return sort(intervals);
    }

    private Boolean mergeInterval(List<Interval> intervals) {
        Boolean isMerged = Boolean.FALSE;

        for (int i = 0; i < intervals.size(); i++) {
            Interval current = intervals.get(i);
            for (int j = i + 1; j < intervals.size(); j++) {
                Interval next = intervals.get(j);

                if ((current.start >= next.start && current.start <= next.end)
                        || (next.start >= current.start && next.start <= current.end)) {
                    Interval newInterval = new Interval(Math.min(current.start, next.start),
                                                        Math.max(current.end, next.end));
                    intervals.remove(j);
                    intervals.remove(i);
                    intervals.add(newInterval);
                    isMerged = Boolean.TRUE;
                    break;
                }
            }
            if (isMerged) {
                break;
            }
        }

        return isMerged;
    }

    private List<Interval> sort(List<Interval> intervals) {
        List<Interval> sorted = new ArrayList<Interval>();

        while (!intervals.isEmpty()) {
            int minStart = intervals.get(0).start;
            int minIndex = 0;
            for (int i = 0; i < intervals.size(); i++) {
                Interval current = intervals.get(i);
                if (current.start <= minStart) {
                    minStart = current.start;
                    minIndex = i;
                }
            }
            sorted.add(intervals.get(minIndex));
            intervals.remove(minIndex);
        }
        return sorted;
    }
}
