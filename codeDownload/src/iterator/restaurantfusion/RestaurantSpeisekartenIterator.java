package headfirst.iterator.restaurantfusion;

public class RestaurantSpeisekartenIterator implements Iterator {
	Speise[] elemente;
	int position = 0;
 
	public RestaurantSpeisekartenIterator(Speise[] elemente) {
		this.elemente = elemente;
	}
 
	public Object next() {
		Speise speise = elemente[position];
		position = position + 1;
		return speise;
	}
 
	public boolean hasNext() {
		if (position >= elemente.length || elemente[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}
