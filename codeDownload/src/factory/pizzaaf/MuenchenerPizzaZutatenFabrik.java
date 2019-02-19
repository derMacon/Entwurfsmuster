package headfirst.factory.pizzaaf;

public class MuenchenerPizzaZutatenFabrik 
	implements PizzaZutatenFabrik 
{

	public Teig erstelleTeig() {
		return new TeigMitDickerKruste();
	}

	public Sosse erstelleSoße() {
		return new Tomatensosse();
	}

	public Kaese erstelleKäse() {
		return new Mozzarella();
	}

	public Salami erstelleSalami() {
		return new ItalienischeSalami();
	}
	
	public Gemuese[] erstelleGemüse() {
		Gemuese gemüse[] = { new SchwarzeOliven(), 
		                      new Spinat(), 
		                      new Aubergine() };
		return gemüse;
	}

	public Thunfisch erstelleThunfisch() {
		return new ThunfischStuecke();
	}

	public Krabben erstelleKrabben() {
		return new GefroreneKrabben();
	}
}
