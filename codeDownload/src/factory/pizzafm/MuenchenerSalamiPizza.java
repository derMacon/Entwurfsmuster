package headfirst.factory.pizzafm;

public class MuenchenerSalamiPizza extends Pizza {

	public MuenchenerSalamiPizza() { 
		name = "Deftige Salami-Pizza im Münchener Stil";
		teig = "Teig mit extra dicker Kruste";
		soße = "Tomatensoße";
 
		beläge.add("Salami");
		beläge.add("Mozzarella");
	}
 
	void schneiden() {
		System.out.println("Schneide die Pizza in rechteckige Stücke");
	}
}
