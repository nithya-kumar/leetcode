package medianfromdatastream;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFromDataStream {
	PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;
    
    /** initialize your data structure here. */
    public MedianFromDataStream() {
        maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        minHeap = new PriorityQueue<Integer>();
    }
    
    public void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());
        if (maxHeap.size() < minHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (double) (maxHeap.peek() + minHeap.peek())/2;
        } else {
            return maxHeap.peek();
        }
    }
}
