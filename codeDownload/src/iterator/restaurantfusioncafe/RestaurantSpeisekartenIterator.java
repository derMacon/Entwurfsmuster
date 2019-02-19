package headfirst.iterator.restaurantfusioncafe;
 
import java.util.Iterator;
  
public class RestaurantSpeisekartenIterator implements Iterator {
	Speise[] liste;
	int position = 0;
 
	public RestaurantSpeisekartenIterator(Speise[] liste) {
		this.liste = liste;
	}
 
	public Object next() {
		Speise menuItem = liste[position];
		position = position + 1;
		return menuItem;
	}
 
	public boolean hasNext() {
		if (position >= liste.length || liste[position] == null) {
			return false;
		} else {
			return true;
		}
	}
  
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException
				("Es kann kein Element entfernt werden, bevor Sie nicht mindestens einmal next() aufgerufen haben");
		}
		if (liste[position-1] != null) {
			for (int i = position-1; i < (liste.length-1); i++) {
				liste[i] = liste[i+1];
			}
			liste[liste.length-1] = null;
		}
	}
}
