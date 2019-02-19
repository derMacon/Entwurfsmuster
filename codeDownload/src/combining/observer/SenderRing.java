package headfirst.combining.observer;

import java.util.Iterator;
import java.util.ArrayList;

public class SenderRing implements QuakBeobachtungsSubjekt {
	ArrayList beobachtende = new ArrayList();
	QuakBeobachtungsSubjekt ente;
 
	public SenderRing(QuakBeobachtungsSubjekt ente) {
		this.ente = ente;
	}
  
	public void registriereBeobachter(Beobachter beobachter) {
		beobachtende.add(beobachter);
	}
  
	public void benachrichtigeBeobachtende() {
		Iterator iterator = beobachtende.iterator();
		while (iterator.hasNext()) {
			Beobachter beobachter = (Beobachter)iterator.next();
			beobachter.aktualisieren(ente);
		}
	}
 
	public Iterator getBeobachtende() {
		return beobachtende.iterator();
	}
}
