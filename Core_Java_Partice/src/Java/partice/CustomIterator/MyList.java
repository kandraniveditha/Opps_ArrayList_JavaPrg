package Java.partice.CustomIterator;

public interface MyList extends Iterable<Object> {
	
	 void add(Object e);
	
	 void clear();
	 
	 boolean remove(Object o); 
	
	 Object[] toArray(); 
	
	 int size();
	
	 boolean contains(Object o); // returns true if this list contains the specified element.
	
	 boolean containsAll(MyList c); // returns true if this list contains all of the elements of the specified list
	}
