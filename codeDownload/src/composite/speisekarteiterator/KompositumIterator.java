package headfirst.composite.speisekarteiterator;

 
import java.util.*;
  
public class KompositumIterator implements Iterator {
	Stack stack = new Stack();
   
	public KompositumIterator(Iterator iterator) {
		stack.push(iterator);
	}
   
	public Object next() {
		if (hasNext()) {
			Iterator iterator = (Iterator) stack.peek();
			SpeisekartenKomponente komponente = (SpeisekartenKomponente) iterator.next();
			if (komponente instanceof Speisekarte) {
				stack.push(komponente.erstelleIterator());
			} 
			return komponente;
		} else {
			return null;
		}
	}
  
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			Iterator iterator = (Iterator) stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}
   
	public void remove() {
		throw new UnsupportedOperationException();
	}
}


