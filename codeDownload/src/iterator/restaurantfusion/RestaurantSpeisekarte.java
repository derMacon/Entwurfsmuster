package headfirst.iterator.restaurantfusion;

public class RestaurantSpeisekarte implements Speisekarte {
	static final int MAX_SPEISEN = 6;
	int anzahlVonSpeisen = 0;
	Speise[] speisen;
  
	public RestaurantSpeisekarte() {
		speisen = new Speise[MAX_SPEISEN];
 
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
		if (anzahlVonSpeisen >= MAX_SPEISEN) {
			System.err.println("Leider ist die Speisekarte schon voll!  Kann Speise nicht hinzufügen");
		} else {
			speisen[anzahlVonSpeisen] = speise;
			anzahlVonSpeisen = anzahlVonSpeisen + 1;
		}
	}
 
	public Speise[] getSpeisen() {
		return speisen;
	}
  
	public Iterator erstelleIterator() {
		return new RestaurantSpeisekartenIterator(speisen);
	}
 
	// hier weitere Methoden
}
