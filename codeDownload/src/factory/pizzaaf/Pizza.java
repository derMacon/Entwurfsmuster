package headfirst.factory.pizzaaf;

public abstract class Pizza {
	String name;

	Teig teig;
	Sosse soße;
	Gemuese gemüse[];
	Salami salami;
	Kaese käse;
	Thunfisch thunfisch;
	Krabben krabben;

	abstract void vorbereiten();

	void backen() {
		System.out.println("Backe 25 Minuten bei 350");
	}
 
	void schneiden() {
		System.out.println("Schneide die Pizza diagonal in Stücke");
	}
  
	void verpacken() {
		System.out.println("Packe die Pizza in die offizielle Pizzeria-Schachtel");
	}
 
	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public String toString() {
		StringBuffer ergebnis = new StringBuffer();
		ergebnis.append("---- " + name + " ----\n");
		if (teig != null) {
			ergebnis.append(teig);
			ergebnis.append("\n");
		}
		if (soße != null) {
			ergebnis.append(soße);
			ergebnis.append("\n");
		}
		if (käse != null) {
			ergebnis.append(käse);
			ergebnis.append("\n");
		}
		if (salami != null) {
			ergebnis.append(salami);
			ergebnis.append("\n");
		}
		if (gemüse != null) {
			for (int i = 0; i < gemüse.length; i++) {
				ergebnis.append(gemüse[i]);
				if (i < gemüse.length-1) {
					ergebnis.append(", ");
				}
			}
			ergebnis.append("\n");
		}
		if (krabben != null) {
			ergebnis.append(krabben);
			ergebnis.append("\n");
		}
		if (thunfisch != null) {
			ergebnis.append(thunfisch);
			ergebnis.append("\n");
		}
		return ergebnis.toString();
	}
}
