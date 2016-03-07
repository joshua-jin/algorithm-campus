/**
 * Definition of Interval:
 * classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this->start = start;
 *         this->end = end;
 *     }
 */
bool sortfunc(const Interval &a, const Interval &b) { return a.start < b.start; }
class Solution {
public:
    /**
     * @param intervals: interval list.
     * @return: A new interval list.
     */
    vector<Interval> merge(vector<Interval> &intervals) {
        sort(intervals.begin(), intervals.end(), &sortfunc);
        
        vector<Interval> out;
        for (Interval &l : intervals) {
            if (out.empty()) {
                out.push_back(l);
            } else {
                if (l.start > out.back().end) {
                    out.push_back(l);
                } else if (l.end > out.back().end) {
                    out.back().end = l.end;
                }
            }
        }
        return out;
    }
};
