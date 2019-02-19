package headfirst.factory.pizzaaf;

public class BerlinerPizzaZutatenFabrik implements PizzaZutatenFabrik {
 
	public Teig erstelleTeig() {
		return new TeigMitDuennerKruste();
	}
 
	public Sosse erstelleSoße() {
		return new MarinaraSosse();
	}
 
	public Kaese erstelleKäse() {
		return new Parmesan();
	}
	
	public Salami erstelleSalami() {
		return new SpanischeSalami();
	}
	public Gemuese[] erstelleGemüse() {
		Gemuese gemüse[] = { new Knoblauch(), new Zwiebeln(), new Pilze(), new Paprika() };
		return gemüse;
	}
 
	public Thunfisch erstelleThunfisch() {
		return new ThunfischStuecke();
	}

	public Krabben erstelleKrabben() {
		return new FrischeKrabben();
	}
}
