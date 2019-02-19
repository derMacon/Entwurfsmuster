package headfirst.iterator.restaurantfusion;

public class Kellnerin {
	PfannkuchenhausSpeisekarte pfannkuchenhausSpeisekarte;
	RestaurantSpeisekarte restaurantSpeisekarte;
 
	public Kellnerin(PfannkuchenhausSpeisekarte pfannkuchenhausSpeisekarte, RestaurantSpeisekarte restaurantSpeisekarte) {
		this.pfannkuchenhausSpeisekarte = pfannkuchenhausSpeisekarte;
		this.restaurantSpeisekarte = restaurantSpeisekarte;
	}
 
	public void speisekarteAusgeben() {
		Iterator pfannkuchenIterator = pfannkuchenhausSpeisekarte.erstelleIterator();
		Iterator restaurantIterator = restaurantSpeisekarte.erstelleIterator();

		System.out.println("SPEISEKARTE\n----\nFRÜHSTÜCK");
		speisekarteAusgeben(pfannkuchenIterator);
		System.out.println("\nABENDESSEN");
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
		vegetarischeSpeisekarteAusgeben(pfannkuchenhausSpeisekarte.erstelleIterator());
		vegetarischeSpeisekarteAusgeben(restaurantSpeisekarte.erstelleIterator());
	}
 
	public boolean isVegetarischeSpeise(String name) {
		Iterator frühstückIterator = pfannkuchenhausSpeisekarte.erstelleIterator();
		if (isVegetarisch(name, frühstückIterator)) {
			return true;
		}
		Iterator restaurantIterator = restaurantSpeisekarte.erstelleIterator();
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
