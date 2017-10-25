package topkfrequent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {

	public static void main(String[] args) {
		int[] nums = {3,3,2,2,1,1};
		int k = 3;
		List <Integer> result = new ArrayList<Integer>();
		result = topKFrequent(nums, k);
		System.out.println(result);

	}
	
	public static List<Integer> topKFrequent(int[] nums, int k) {
		/*List<Integer>[] bucket = new List[nums.length + 1];
		Map <Integer, Integer> map = new HashMap<Integer, Integer>();
        List <Integer> list = new ArrayList<Integer>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int key: map.keySet()) {
        	int count = map.get(key);
        	if (bucket[count] == null)
        		bucket[count] = new ArrayList<>();
        	bucket[count].add(key);
        }
        
        for (int i = bucket.length - 1; i >= 0 && list.size() < k; i --) {
        	if (bucket[i] != null)
        		list.addAll(bucket[i]);
        }
        
        return list;
    }*/
		Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
           
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = 
                         new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            maxHeap.add(entry);
        }
        
        List<Integer> res = new ArrayList<>();
        while(res.size()<k){
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            res.add(entry.getKey());
        }
        return res;
    }

}
