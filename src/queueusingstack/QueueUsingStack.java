package queueusingstack;

public class QueueUsingStack {
	class MyQueue {
	    
		Stack<Integer> mainStack = new Stack<Integer>();

		/** Initialize your data structure here. */
		public MyQueue() {
		}
	    
		/** Push element x to the back of queue. */
		public void push(int x) {
	    	Stack<Integer> sideStack = new Stack<Integer>();
	    	if (mainStack.isEmpty())
	        	mainStack.push(x);
	    	else {
	        	while (!mainStack.isEmpty()) {
	            	sideStack.push(mainStack.pop());
	        	}
	        	mainStack.push(x);
	        	while (!sideStack.isEmpty()) {
	            	mainStack.push(sideStack.pop());
	        	}
	    	}   	 
		}
	    
		/** Removes the element from in front of queue and returns that element. */
		public int pop() {
	    	if (mainStack.isEmpty())
	        	return -1;
	    	return mainStack.pop();
		}
	    
		/** Get the front element. */
		public int peek() {
	    	if (mainStack.isEmpty())
	        	return -1;
	    	return mainStack.peek();
		}
	    
		/** Returns whether the queue is empty. */
		public boolean empty() {
	    	return mainStack.isEmpty();
		}
	}
}
