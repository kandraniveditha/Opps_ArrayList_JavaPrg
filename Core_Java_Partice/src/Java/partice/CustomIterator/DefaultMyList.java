package Java.partice.CustomIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DefaultMyList implements MyList {

    // Other methods of DefaultMyList...

    // Implementation of Iterator for DefaultMyList
    private class IteratorImpl implements Iterator<Object> {
        private Node currentNode;  // Pointer to the current node
        private Node lastReturned; // Pointer to the last returned node
        private int nextIndex;     // Tracks the index of the next element

        public IteratorImpl() {
            this.currentNode = currentNode; // Start at the first node
            this.lastReturned = null;
            this.nextIndex = 0;
        }

        @Override
        public boolean hasNext() {
            // Returns true if there is a next element in the list
            return nextIndex < size() && currentNode != null;
        }

        @Override
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            lastReturned = currentNode;
            currentNode = currentNode.next;
            nextIndex++;
            return lastReturned.data; // Return the data of the last returned node
        }

        @Override
        public void remove() {
            if (lastReturned == null) {
                throw new IllegalStateException();
            }
            unlink(lastReturned); // Remove the last returned node
            lastReturned = null;  // Prevent multiple removes
            nextIndex--;
        }
    }

    @Override
    public Iterator<Object> iterator() {
        return new IteratorImpl(); // Return a new instance of the iterator
    }

    // The rest of the DefaultMyList class...

    public void unlink(Node lastReturned) {
		// TODO Auto-generated method stub
		
	}

	// Nested Node class (unchanged)
    private static class Node {
        Object data;
        Node next;
        Node previous;

        public Node(Node previous, Object data, Node next) {
            this.previous = previous;
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

	@Override
	public void add(Object e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(MyList c) {
		// TODO Auto-generated method stub
		return false;
	}
}
