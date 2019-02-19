package headfirst.templatemethod.sortieren;

import java.util.ArrayList;
import java.util.Arrays;

public class EntenSortierenTestlauf {

	public static void main(String[] args) {
		Ente[] enten = { 
						new Ente("Daffy", 8), 
						new Ente("Tick", 2),
						new Ente("Howard", 7),
						new Ente("Trick", 2),
						new Ente("Donald", 10), 
						new Ente("Track", 2)
		 };

		System.out.println("Vor dem Sortieren:");
		anzeigen(enten);

		Arrays.sort(enten);
 
		System.out.println("\nNach dem Sortieren:");
		anzeigen(enten);
	}

	public static void anzeigen(Ente[] enten) {
		for (int i = 0; i < enten.length; i++) {
			System.out.println(enten[i]);
		}
	}
}
