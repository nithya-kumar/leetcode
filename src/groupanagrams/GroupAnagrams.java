package groupanagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String ss = new String(c);
            if (!map.containsKey(ss)) {
                map.put(ss, new ArrayList<String>());
            }
            map.get(ss).add(s);
        }
        return new ArrayList(map.values());
    }
}
