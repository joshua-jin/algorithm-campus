public class InsertInterval {

    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<>();
        boolean inserted = false;
        for (Interval interval : intervals) {
            if (newInterval.start > interval.end) {
                result.add(interval);
            } else {
                if (!inserted) {
                    result.add(newInterval);
                    inserted = true;
                }
                Interval last = result.get(result.size() - 1);
                if (interval.start > last.end) {
                    result.add(interval);
                } else {
                    result.remove(last);
                    result.add(new Interval(Math.min(interval.start, last.start), Math.max(interval.end, last.end)));
                }
            }
        }
        if (!inserted) {
            result.add(newInterval);
        }
        return result;
    }
}