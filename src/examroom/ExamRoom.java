package examroom;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * https://leetcode.com/problems/exam-room/description/
 */
public class ExamRoom {
	TreeSet<Integer> seatFill = new TreeSet<Integer>();
    int N;

    public ExamRoom(int N) {
        this.N = N;
    }
    
    public int seat() {
        if (seatFill.size() == 0) {
            seatFill.add(0);
            return 0;
        }
        if (seatFill.size() == 1) {
            if (seatFill.first() > N/2) {
                seatFill.add(0);
                return 0;
            }
            seatFill.add(N - 1);
            return N - 1;
        }
        Iterator<Integer> itr = seatFill.iterator();
        int left = itr.next();
        int maxDiff = -1;
        int position = 0;
        
        if (left > 0) {
            position = 0;
            maxDiff = left;
        }
        while (itr.hasNext()) {
            int right = itr.next();
            int diff = (right - left)/2;
            if (diff > maxDiff) {
                maxDiff = diff;
                position = left + diff;
            }
            left = right;
        }
        if (N - 1 - left > maxDiff) {
            position = N - 1;
        }
        seatFill.add(position);
        return position;
    }
    
    public void leave(int p) {
        seatFill.remove(p);
    }
}
