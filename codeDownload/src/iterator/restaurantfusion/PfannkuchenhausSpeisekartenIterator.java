package headfirst.iterator.restaurantfusion;

import java.util.ArrayList;

public class PfannkuchenhausSpeisekartenIterator implements Iterator {
	ArrayList elemente;
	int position = 0;
 
	public PfannkuchenhausSpeisekartenIterator(ArrayList elemente) {
		this.elemente = elemente;
	}
 
	public Object next() {
		Object objekt = elemente.get(position);
		position = position + 1;
		return objekt;
	}
 
	public boolean hasNext() {
		if (position >= elemente.size()) {
			return false;
		} else {
			return true;
		}
	}
}
