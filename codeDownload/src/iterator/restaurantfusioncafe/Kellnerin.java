package headfirst.iterator.restaurantfusioncafe;

import java.util.Iterator;
  
public class Kellnerin {
	Speisekarte pfannkuchenhausSpeisekarte;
	Speisekarte restaurantSpeisekarte;
	Speisekarte cafeSpeisekarte;
 
	public Kellnerin(Speisekarte pfannkuchenhausSpeisekarte, Speisekarte restaurantSpeisekarte, Speisekarte cafeSpeisekarte) {
		this.pfannkuchenhausSpeisekarte = pfannkuchenhausSpeisekarte;
		this.restaurantSpeisekarte = restaurantSpeisekarte;
		this.cafeSpeisekarte = cafeSpeisekarte;
	}
 
	public void speisekarteAusgeben() {
		Iterator pfannkuchenIterator = pfannkuchenhausSpeisekarte.createIterator();
		Iterator restaurantIterator = restaurantSpeisekarte.createIterator();
		Iterator cafeIterator = cafeSpeisekarte.createIterator();

		System.out.println("SPEISEKARTE\n----\nFRÜHSTÜCK");
		speisekarteAusgeben(pfannkuchenIterator);
		System.out.println("\nMITTAGSESSEN");
		speisekarteAusgeben(restaurantIterator);
		System.out.println("\nABENDESSEN");
		speisekarteAusgeben(cafeIterator);
	}
 
	private void speisekarteAusgeben(Iterator iterator) {
		while (iterator.hasNext()) {
			Speise menuItem = (Speise)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPreis() + " -- ");
			System.out.println(menuItem.getBeschreibung());
		}
	}
 
	public void vegetarischeSpeisekarteAusgeben() {
		System.out.println("\nVEGETARISCHE SPEISEKARTE\n---------------");
		vegetarischeSpeisekarteAusgeben(pfannkuchenhausSpeisekarte.createIterator());
		vegetarischeSpeisekarteAusgeben(restaurantSpeisekarte.createIterator());
		vegetarischeSpeisekarteAusgeben(cafeSpeisekarte.createIterator());
	}
 
	public boolean isVegetarischeSpeise(String name) {
		Iterator pfannkuchenIterator = pfannkuchenhausSpeisekarte.createIterator();
		if (istVegetarisch(name, pfannkuchenIterator)) {
			return true;
		}
		Iterator restaurantIterator = restaurantSpeisekarte.createIterator();
		if (istVegetarisch(name, restaurantIterator)) {
			return true;
		}
		Iterator cafeIterator = cafeSpeisekarte.createIterator();
		if (istVegetarisch(name, cafeIterator)) {
			return true;
		}
		return false;
	}


	private void vegetarischeSpeisekarteAusgeben(Iterator iterator) {
		while (iterator.hasNext()) {
			Speise speise = (Speise)iterator.next();
			if (speise.isVegetarisch()) {
				System.out.print(speise.getName() + ", ");
				System.out.print(speise.getPreis() + " -- ");
				System.out.println(speise.getBeschreibung());
			}
		}
	}

	private boolean istVegetarisch(String name, Iterator iterator) {
		while (iterator.hasNext()) {
			Speise menuItem = (Speise)iterator.next();
			if (menuItem.getName().equals(name)) {
				if (menuItem.isVegetarisch()) {
					return true;
				}
			}
		}
		return false;
	}
}
//^^ KellnerinCafeHauptteil
//^^ KellnerinCafe
