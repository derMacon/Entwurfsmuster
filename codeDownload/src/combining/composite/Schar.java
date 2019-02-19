	package headfirst.combining.composite;

import java.util.Iterator;
import java.util.ArrayList;

public class Schar implements Quakfaehig {
	ArrayList quakende = new ArrayList();
 
	public void hinzufügen(Quakfaehig quacker) {
		quakende.add(quacker);
	}
 
	public void quaken() {
		Iterator iterator = quakende.iterator();
		while (iterator.hasNext()) {
			Quakfaehig quaker = (Quakfaehig)iterator.next();
			quaker.quaken();
		}
	}
 
	public String toString() {
		return "Schar von Quakern";
	}
}
