/**
 * Definition of Interval:
 * classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this->start = start;
 *         this->end = end;
 *     }
 */
class Solution {
public:
    /**
     * Insert newInterval into intervals.
     * @param intervals: Sorted interval list.
     * @param newInterval: new interval.
     * @return: A new interval list.
     */
    vector<Interval> insert(vector<Interval> &intervals, Interval newInterval) {
        vector<Interval> out;
        bool inserted = false;
        for (auto &i : intervals) {
            if (newInterval.start > i.end) {
                out.push_back(i);
            } else {
                if (!inserted) {
                    out.push_back(newInterval);
                    inserted = true;
                }
                
                if (i.start > out.back().end) {
                    out.push_back(i);
                } else {
                    out.back().start = min(out.back().start, i.start);
                    out.back().end = max(out.back().end, i.end);
                }
            }
        }
        if (!inserted) {
            out.push_back(newInterval);
        }
        return out;
    }
};
