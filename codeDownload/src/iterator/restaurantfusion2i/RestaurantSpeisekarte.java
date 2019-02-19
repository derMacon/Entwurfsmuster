package headfirst.iterator.restaurantfusion2i;

import java.util.Iterator;

public class RestaurantSpeisekarte implements Speisekarte {
	static final int MAX_ELEMENTE = 6;
	int anzahlElemente = 0;
	Speise[] speisen;
  
	public RestaurantSpeisekarte() {
		speisen = new Speise[MAX_ELEMENTE];
 
		speiseHinzufügen("Vegetarisches Sandwich",
				"(Falscher) Schinken mit Salat & Tomate auf Vollkornbrot", true, 2.99);
		speiseHinzufügen("Schinken-Sandwich",
				"Schinken mit Salat & Tomate auf Vollkornbrot", false, 2.99);
		speiseHinzufügen("Tagessuppe",
				"Tagessuppe, mit Kartoffelsalat als Beilage", false, 3.29);
		speiseHinzufügen("Hotdog",
				"Ein Hot-Dog mit Sauerkraut, Gewürzen, Zwiebeln und Käse",
				false, 3.05);
		speiseHinzufügen("Gedünstete Gemüse auf braunem Reis",
				"Verschiedene gedünstete Gemüse auf braunem Reis", true, 3.99);
		speiseHinzufügen("Pasta",
				"Spaghetti mit Marinara-Soße und einer Scheibe Ciabatta-Brot",
				true, 3.89);
	}
  
	public void speiseHinzufügen(String name, String beschreibung, 
	                     boolean vegetarisch, double preis) 
	{
		Speise speise = new Speise(name, beschreibung, vegetarisch, preis);
		if (anzahlElemente >= MAX_ELEMENTE) {
			System.err.println("Leider ist die Speisekarte voll! Kann Speise nicht hinzufügen");
		} else {
			speisen[anzahlElemente] = speise;
			anzahlElemente = anzahlElemente + 1;
		}
	}
 
	public Speise[] getSpeisen() {
		return speisen;
	}
  
	public Iterator createIterator() {
		return new RestaurantSpeisekartenIterator(speisen);
		//return new AlternatingDinerMenuIterator(menuItems);
	}
 
	// andere Speisekarten-Methoden kommen hier hin
}
