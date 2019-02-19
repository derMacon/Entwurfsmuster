package headfirst.factory.pizzafm;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String teig;
	String soße;
	ArrayList beläge = new ArrayList();
 
	void vorbereiten() {
		System.out.println("Bereite " + name);
		System.out.println("Werfe Teig ...");
		System.out.println("Füge Soße hinzu...");
		System.out.println("Füge Beläge hinzu: ");
		for (int i = 0; i < beläge.size(); i++) {
			System.out.println("   " + beläge.get(i));
		}
	}
  
	void backen() {
		System.out.println("Backe 25 Minuten bei 350");
	}
 
	void schneiden() {
		System.out.println("Schneide die Pizza diagonal in Stücke");
	}
  
	void verpacken() {
		System.out.println("Packe die Pizza in die offizielle Pizzeria-Schachtel");
	}
 
	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer anzeige = new StringBuffer();
		anzeige.append("---- " + name + " ----\n");
		anzeige.append(teig + "\n");
		anzeige.append(soße + "\n");
		for (int i = 0; i < beläge.size(); i++) {
			anzeige.append((String )beläge.get(i) + "\n");
		}
		return anzeige.toString();
	}
}

 
 
