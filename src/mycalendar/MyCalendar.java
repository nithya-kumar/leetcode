package mycalendar;
/*
 * https://leetcode.com/problems/my-calendar-i/description/
 */
import java.util.TreeMap;

public class MyCalendar {
	TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
    
    public MyCalendar() {
        
    }
    
    public boolean book(int start, int end) {
        Integer floorKey = treeMap.floorKey(start);
        if (floorKey != null && treeMap.get(floorKey) > start) {
            return false;
        }
        Integer ceilingKey = treeMap.ceilingKey(start);
        if (ceilingKey != null && ceilingKey < end) {
            return false;
        }
        treeMap.put(start, end);
        return true;
    }
    
    /* public boolean book(int start, int end) {
        for (Booking b : booking) {
            if ((start >= b.start && start < b.end) || (end > b.start && end <= b.end) || (start <= b.start && end > b.end)) {
				//Math.max(b.start, start) < Math.min(b.end, end)
                return false;
            }
        }
        Booking newBooking = new Booking(start, end);
        booking.add(newBooking);
        return true;
    }
    */
}
