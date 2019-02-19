package headfirst.iterator.restaurantfusion;

import java.util.ArrayList;

public class PfannkuchenhausSpeisekarte implements Speisekarte {
	ArrayList speisen;
 
	public PfannkuchenhausSpeisekarte() {
		speisen = new ArrayList();
    
		speiseHinzufügen("Pfannkuchen-Frühstück Spezial", 
			"Pfannkuchen mit Rührei und Toast", 
			true,
			2.99);
 
		speiseHinzufügen("Pfannkuchen-Früstück Normal", 
			"Pfannkuchen mit Spiegelei und Wurst", 
			false,
			2.99);
 
		speiseHinzufügen("Blaubeer-Pfannkuchen",
			"Pfannkuchen mit frischen Blaubeeren",
			true,
			3.49);
 
		speiseHinzufügen("Waffeln",
			"Waffeln mit Blaubeeren oder Erdbeeren",
			true,
			3.59);
	}

	public void speiseHinzufügen(String name, String beschreibung,
	                    boolean vegetarisch, double preis)
	{
		Speise speise = new Speise(name, beschreibung, vegetarisch, preis);
		speisen.add(speise);
	}
 
	public ArrayList getSpeisen() {
		return speisen;
	}
  
	public Iterator erstelleIterator() {
		return new PfannkuchenhausSpeisekartenIterator(speisen);
	}
  
	public String toString() {
		return "Pfannkuchenhaus Objekthausen - Speisekarte";
	}

	// hier weitere Speisekartenmethoden
}
