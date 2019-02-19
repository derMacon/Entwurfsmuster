package headfirst.combining.observer;

import java.util.Iterator;
import java.util.ArrayList;

public class Schar implements Quakfaehig {
	ArrayList quakende = new ArrayList();
  
	public void hinzufügen(Quakfaehig quaker) {
		quakende.add(quaker);
	}
  
	public void quaken() {
		Iterator iterator = quakende.iterator();
		while (iterator.hasNext()) {
			Quakfaehig quaker = (Quakfaehig)iterator.next();
			quaker.quaken();
		}
	}
   
	public void registriereBeobachter(Beobachter beobachter) {
		Iterator iterator = quakende.iterator();
		while (iterator.hasNext()) {
			Quakfaehig quaker = (Quakfaehig)iterator.next();
			quaker.registriereBeobachter(beobachter);
		}
	}
  
	public void benachrichtigeBeobachtende() { }
  
	public String toString() {
		return "Entenschar";
	}
}
