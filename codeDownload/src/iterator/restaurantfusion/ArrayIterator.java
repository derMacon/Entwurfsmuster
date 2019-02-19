package headfirst.iterator.restaurantfusion;

public class ArrayIterator implements Iterator {
	Speise[] speisen;
	int position = 0;
 
	public ArrayIterator(Speise[] speisen) {
		this.speisen = speisen;
	}
 
	public Object next() {
		Speise speise = speisen[position];
		position = position + 1;
		return speise;
	}
 
	public boolean hasNext() {
		if (position >= speisen.length || speisen[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}
