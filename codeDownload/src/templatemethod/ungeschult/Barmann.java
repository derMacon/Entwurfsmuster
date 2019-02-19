package headfirst.templatemethod.ungeschult;

public class Barmann {
 
	public static void main(String[] args) {
		Tee tea = new Tee();
		Kaffee coffee = new Kaffee();
		System.out.println("Mache Tee...");
		tea.zubereitungsRezept();
		System.out.println("Mache Kaffee...");
		coffee.zubereitungsRezept();
	}
}
