package headfirst.composite.speisekarte;

import java.util.Iterator;
  
public class Kellnerin {
	SpeisekartenKomponente alleSpeisekarten;
 
	public Kellnerin(SpeisekartenKomponente alleSpeisekarten) {
		this.alleSpeisekarten = alleSpeisekarten;
	}
 
	public void speisekarteAusgeben() {
		alleSpeisekarten.ausgeben();
	}
}
