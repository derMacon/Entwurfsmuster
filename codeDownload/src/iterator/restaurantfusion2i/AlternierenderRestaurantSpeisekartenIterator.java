package headfirst.iterator.restaurantfusion2i;

import java.util.Iterator;
import java.util.Calendar;

public class AlternierenderRestaurantSpeisekartenIterator implements Iterator {
	Speise[] elemente;
	int position;

	public AlternierenderRestaurantSpeisekartenIterator(Speise[] elemente) {
		this.elemente = elemente;
		Calendar jetzt = Calendar.getInstance();
		position = jetzt.DAY_OF_WEEK % 2;
	}
	public Object next() {
		Speise speise = elemente[position];
		position = position + 2;
		return speise;
	}
	public boolean hasNext() {
		if (position >= elemente.length || elemente[position] == null) {
			return false;
		} else {
			return true;
		}
	}
	public void remove() {
		throw new UnsupportedOperationException(
			"Der alternierende Iterator für die Restaurant-Speisekarte bietet keine Unterstützung für remove()");
	}
}
