package headfirst.iterator.restaurantfusioncafe;

import java.util.*;

public class CafeSpeisekarte implements Speisekarte {
	Hashtable speisen = new Hashtable();
  
	public CafeSpeisekarte() {
		speiseHinzufügen("Vegetarischer Burger mit Pommes",
			"Vegetarischer Burger aus Vollkornbrötchen, Salat, Tomaten mit Pommes",
			true, 3.99);
		speiseHinzufügen("Tagessuppe",
			"Ein Teller Suppe des Tages mit Beilagensalat",
			false, 3.69);
		speiseHinzufügen("Burrito",
			"Großer Burrito mit Bohnen, Mais und Soße",
			true, 4.29);
	}
 
	public void speiseHinzufügen(String name, String beschreibung, 
	                     boolean vegetarisch, double preis) 
	{
		Speise speise = new Speise(name, beschreibung, vegetarisch, preis);
		speisen.put(speise.getName(), speise);
	}
 
	public Hashtable getSpeisen() {
		return speisen;
	}
  
	public Iterator createIterator() {
		return speisen.values().iterator();
	}
}
