package meetingroomproblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MeetingRoomProblem {

	public static void main(String[] args) {
		List<Meeting> meetings = new ArrayList<Meeting>();
		meetings.add(new Meeting(830, 930));
		meetings.add(new Meeting(1145, 1245));
		meetings.add(new Meeting(1030, 1130));
		int minRoom = findMinRoom(meetings);
		System.out.println(minRoom);
	}

	private static int findMinRoom(List<Meeting> meetings) {
		List<Integer> startTime = new ArrayList<Integer>();
		List<Integer> endTime = new ArrayList<Integer>();
		int numRoom = 1, minRoom = 1;
		for (Meeting meeting : meetings)
		{
			startTime.add(meeting.startTime);
			endTime.add(meeting.endTime);
		}
		Collections.sort(startTime);
		Collections.sort(endTime);
		int i = 1, j = 0;
		while (i < meetings.size() && j < meetings.size()) {
			if (startTime.get(i) < endTime.get(j)) {
				numRoom ++;
				i ++;
				if (numRoom > minRoom)
					minRoom = numRoom;
			} else {
				numRoom --;
				j ++;
			}
		}
		return minRoom;
	}

}
