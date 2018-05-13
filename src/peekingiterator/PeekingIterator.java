package peekingiterator;

import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer> {

	Iterator<Integer> iter = null;
    Integer next;
    
    public PeekingIterator(Iterator<Integer> iterator) {
	    iter = iterator;
        if (iter != null && iter.hasNext())
            next = iter.next();
	}
    
    // hasNext() and next() should behave the same as in the Iterator interface.
 	// Override them if needed.
	@Override
	public boolean hasNext() {
		return (next != null);
	}

	@Override
	public Integer next() {
		Integer temp = next;
        if (iter != null)
            next = iter.hasNext() ? iter.next() : null;
        else
            next = null;
        return temp;
	}
	
	// Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return next;
	}

}
