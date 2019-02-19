package headfirst.iterator.restaurantfusion;

import java.util.ArrayList;

public class ArrayListIterator implements Iterator {
	ArrayList speisen;
	int position = 0;
 
	public ArrayListIterator(ArrayList speisen) {
		this.speisen = speisen;
	}
 
	public Object next() {
		Object object = speisen.get(position);
		position = position + 1;
		return object;
	}
 
	public boolean hasNext() {
		if (position >= speisen.size()) {
			return false;
		} else {
			return true;
		}
	}
}
