package headfirst.factory.pizzafm;

public class MuenchenerThunfischPizza extends Pizza {
	public MuenchenerThunfischPizza() {
		name = "Thunfisch-Pizza Münchener Art";
		teig = "Teig mit extra dicker Kruste";
		soße = "Tomatensoße";
 
		beläge.add("Mozzarella");
		beläge.add("Schwarze Oliven");
		beläge.add("Thunfisch");
		beläge.add("Kapern");
	}
 
	void schneiden() {
		System.out.println("Schneide Pizza in rechteckige Stücke");
	}
}
