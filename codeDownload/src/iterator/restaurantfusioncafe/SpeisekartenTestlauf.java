package headfirst.iterator.restaurantfusioncafe;

import java.util.*;

public class SpeisekartenTestlauf {
	public static void main(String args[]) {
		PfannkuchenhausSpeisekarte pfannkuchenhausSpeisekarte = new PfannkuchenhausSpeisekarte();
		RestaurantSpeisekarte restaurantSpeisekarte = new RestaurantSpeisekarte();
		CafeSpeisekarte cafeSpeisekarte = new CafeSpeisekarte();
 
		Kellnerin kellnerin = new Kellnerin(pfannkuchenhausSpeisekarte, restaurantSpeisekarte, cafeSpeisekarte);
 
		System.out.println("\nDer Kunde fragt, 'Ist der Hotdog vegetarisch?");
		System.out.print("Die Kellnerin antwortet: ");
		if (kellnerin.isVegetarischeSpeise("Hotdog")) {
			System.out.println("Ja");
		} else {
			System.out.println("Nein");
		}
		System.out.println("\nDer Kunde fragt, 'Sind die Waffeln vegetarisch?'");
		System.out.print("Die Kellnerin antwortet: ");
		if (kellnerin.isVegetarischeSpeise("Waffeln")) {
			System.out.println("Ja");
		} else {
			System.out.println("Nein");
		}

	}
}
