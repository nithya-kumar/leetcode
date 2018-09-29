package arrays;
/*
 * https://leetcode.com/problems/merge-intervals/description/
 */
public class MergeIntervals {
	public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() == 0) {
            return new ArrayList<Interval>();
        }
        Collections.sort(intervals, new startComparator());
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        List<Interval> result = new ArrayList<Interval>();
        for (int i = 1; i < intervals.size(); i ++) {
            if (intervals.get(i).start <= end) {
                end = Math.max(end, intervals.get(i).end);
            } else {
                Interval interval = new Interval(start, end);
                result.add(interval);
                start = intervals.get(i).start;
                end = intervals.get(i).end;
            }
        }
        Interval interval = new Interval(start, end);
        result.add(interval);
        return result;
    }
    
    private static class startComparator implements Comparator<Interval> {
        public int compare(Interval i1, Interval i2) {
            return i1.start - i2.start;
        }
    }
}
