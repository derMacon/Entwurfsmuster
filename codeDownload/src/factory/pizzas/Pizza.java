package headfirst.factory.pizzas;

import java.util.ArrayList;

abstract public class Pizza {
	String name;
	String teig;
	String soﬂe;
	ArrayList bel‰ge = new ArrayList();

	public String getName() {
		return name;
	}

	public void vorbereiten() {
		System.out.println("Bereite " + name);
	}

	public void backen() {
		System.out.println("Backe " + name);
	}

	public void schneiden() {
		System.out.println("Schneide " + name);
	}

	public void einpacken() {
		System.out.println("Verpacke " + name);
	}

	public String toString() {
		// Code zum Anzeigen des Pizza-Namens und der Zutaten
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(teig + "\n");
		display.append(soﬂe + "\n");
		for (int i = 0; i < bel‰ge.size(); i++) {
			display.append((String )bel‰ge.get(i) + "\n");
		}
		return display.toString();
	}
}

