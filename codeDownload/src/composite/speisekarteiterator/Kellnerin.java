package headfirst.composite.speisekarteiterator;

import java.util.Iterator;
  
public class Kellnerin {
	SpeisekartenKomponente alleSpeisekarten;
 
	public Kellnerin(SpeisekartenKomponente alleSpeisekarten) {
		this.alleSpeisekarten = alleSpeisekarten;
	}
 
	public void speisekarteAusgeben() {
		alleSpeisekarten.ausgeben();
	}
	
	public void vegetarischeSpeisekarteAusgeben() {
		Iterator iterator = alleSpeisekarten.erstelleIterator();

		System.out.println("\nVEGETARISCHE SPEISEKARTE\n----");
		while (iterator.hasNext()) {
			SpeisekartenKomponente speisekartenKomponente = 
					(SpeisekartenKomponente)iterator.next();
			try {
				if (speisekartenKomponente.isVegetarisch()) {
					speisekartenKomponente.ausgeben();
				}
			} catch (UnsupportedOperationException e) {}
		}
	}
	
}
