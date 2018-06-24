package friendsofappropriateage;

import java.util.HashMap;
import java.util.Map;

/*
 * https://leetcode.com/problems/friends-of-appropriate-ages/description/
 */
public class FriendsOfAppropriateAge {
	public int numFriendRequests(int[] ages) {
        int count = 0;
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for (int age : ages) {
            countMap.put(age, countMap.getOrDefault(age, 0) + 1);
        }
        for (Integer a : countMap.keySet()) {
            for (Integer b : countMap.keySet()) {
                if (request (a, b)) {
                    count += countMap.get(a) * (countMap.get(b) - (a == b ? 1 : 0));
                }
            }
        }
        return count;
    }
    
    public boolean request(int a, int b) {
        return !(b <= 0.5 * a + 7 || b > a || (b > 100 && a < 100));
    }
}
