package headfirst.composite.speisekarteiterator;

import java.util.Iterator;
import java.util.ArrayList;

public class Speisekarte extends SpeisekartenKomponente {
	ArrayList speisekartenKomponenten = new ArrayList();
	String name;
	String beschreibung;
  
	public Speisekarte(String name, String beschreibung) {
		this.name = name;
		this.beschreibung = beschreibung;
	}
 
	public void hinzufügen(SpeisekartenKomponente speisekartenKomponente) {
		speisekartenKomponenten.add(speisekartenKomponente);
	}
 
	public void entfernen(SpeisekartenKomponente speisekartenKomponente) {
		speisekartenKomponenten.remove(speisekartenKomponente);
	}
 
	public SpeisekartenKomponente getKind(int i) {
		return (SpeisekartenKomponente)speisekartenKomponenten.get(i);
	}
 
	public String getName() {
		return name;
	}
 
	public String getBeschreibung() {
		return beschreibung;
	}
 
	public Iterator erstelleIterator() {
		return new KompositumIterator(speisekartenKomponenten.iterator());
	}

	public void ausgeben() {
		System.out.print("\n" + getName());
		System.out.println(", " + getBeschreibung());
		System.out.println("---------------------");
  
		Iterator iterator = speisekartenKomponenten.iterator();
		while (iterator.hasNext()) {
			SpeisekartenKomponente speisekartenKomponente = 
				(SpeisekartenKomponente)iterator.next();
			speisekartenKomponente.ausgeben();
		}
	}
}
