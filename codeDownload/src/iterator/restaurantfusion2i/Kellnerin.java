package headfirst.iterator.restaurantfusion2i;

import java.util.Iterator;
  
 
public class Kellnerin {
	Speisekarte pfannkuchenhausSpeisekarte;
	Speisekarte restaurantSpeisekarte;
 
	public Kellnerin(Speisekarte pfannkuchenhausSpeisekarte, Speisekarte restaurantSpeisekarte) {
		this.pfannkuchenhausSpeisekarte = pfannkuchenhausSpeisekarte;
		this.restaurantSpeisekarte = restaurantSpeisekarte;
	}
 
	public void speisekarteAusgeben() {
		Iterator pfannkuchenIterator = pfannkuchenhausSpeisekarte.createIterator();
		Iterator restaurantIterator = restaurantSpeisekarte.createIterator();

		System.out.println("SPEISEKARTE\n----\nFRÜHSTÜCK");
		speisekarteAusgeben(pfannkuchenIterator);
		System.out.println("\nMITTAGSESSEN");
		speisekarteAusgeben(restaurantIterator);
	}
 
	private void speisekarteAusgeben(Iterator iterator) {
		while (iterator.hasNext()) {
			Speise speise = (Speise)iterator.next();
			System.out.print(speise.getName() + ", ");
			System.out.print(speise.getPreis() + " -- ");
			System.out.println(speise.getBeschreibung());
		}
	}
 
	public void vegetarischeSpeisekarteAusgeben() {
		System.out.println("\nVEGETARISCHE SPEISEKARTE\n----\nFRÜSTÜCK");
		vegetarischeSpeisekarteAusgeben(pfannkuchenhausSpeisekarte.createIterator());
		System.out.println("\nMITTAGSESSEN");
		vegetarischeSpeisekarteAusgeben(restaurantSpeisekarte.createIterator());
	}
 
	public boolean isVegetarischeSpeise(String name) {
		Iterator pfannkuchenIterator = pfannkuchenhausSpeisekarte.createIterator();
		if (isVegetarisch(name, pfannkuchenIterator)) {
			return true;
		}
		Iterator restaurantIterator = restaurantSpeisekarte.createIterator();
		if (isVegetarisch(name, restaurantIterator)) {
			return true;
		}
		return false;
	}


	private void vegetarischeSpeisekarteAusgeben(Iterator iterator) {
		while (iterator.hasNext()) {
			Speise speise = (Speise)iterator.next();
			if (speise.isVegetarisch()) {
				System.out.print(speise.getName());
				System.out.println("\t\t" + speise.getPreis());
				System.out.println("\t" + speise.getBeschreibung());
			}
		}
	}

	private boolean isVegetarisch(String name, Iterator iterator) {
		while (iterator.hasNext()) {
			Speise speise = (Speise)iterator.next();
			if (speise.getName().equals(name)) {
				if (speise.isVegetarisch()) {
					return true;
				}
			}
		}
		return false;
	}
}
