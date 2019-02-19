package headfirst.factory.pizzaaf;

public interface PizzaZutatenFabrik {
 
	public Salami erstelleSalami();
	public Teig erstelleTeig();
	public Sosse erstelleSoße();
	public Kaese erstelleKäse();
	public Gemuese[] erstelleGemüse();
	public Thunfisch erstelleThunfisch();
	public Krabben erstelleKrabben();
 
}
