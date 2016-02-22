package com.lintcode;

import java.util.ArrayList;

/**
 * @author : Joshua
 * Date:     2/20/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/insert-interval/">插入区间</a>
 */
public class InsertInterval {

      public class Interval {
          int start, end;
          Interval(int start, int end) {
              this.start = start;
              this.end = end;
          }
    }

    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<Interval>();
        // write your code here
        for (Interval iv : intervals) {
            if (newInterval == null) {
                result.add(iv);
            }
            else {
                if (newInterval.end < iv.start) {
                    result.add(newInterval);
                    result.add(iv);
                    newInterval = null;
                    continue;
                }

                if (iv.end < newInterval.start) {
                    result.add(iv);
                    continue;
                }

                newInterval = new Interval(Math.min(newInterval.start, iv.start),
                                           Math.max(newInterval.end, iv.end));
            }
        }
        if (newInterval != null) {
            result.add(newInterval);
        }
        return result;
    }


}
