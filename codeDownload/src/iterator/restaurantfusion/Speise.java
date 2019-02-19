package headfirst.iterator.restaurantfusion;

public class Speise {
	String name;
	String beschreibung;
	boolean vegetarisch;
	double preis;
 
	public Speise(String name, 
	                String beschreibung, 
	                boolean vegetarisch, 
	                double preis) 
	{
		this.name = name;
		this.beschreibung = beschreibung;
		this.vegetarisch = vegetarisch;
		this.preis = preis;
	}
  
	public String getName() {
		return name;
	}
  
	public String getBeschreibung() {
		return beschreibung;
	}
  
	public double getPreis() {
		return preis;
	}
  
	public boolean isVegetarisch() {
		return vegetarisch;
	}
	public String toString() {
		return (name + ", " + preis + " EUR \n   " + beschreibung);
	}
}
