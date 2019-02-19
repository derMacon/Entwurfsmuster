package headfirst.iterator.uebergang;
import java.util.*;
  
     
public class Kellnerin {
	ArrayList speisekarten;
     
  
	public Kellnerin(ArrayList speisekarten) {
		this.speisekarten = speisekarten;
	}
   
	public void printMenu() {
		Iterator speisekartenIterator = speisekarten.iterator();
		while(speisekartenIterator.hasNext()) {
			Speisekarte speisekarte = (Speisekarte)speisekartenIterator.next();
			speisekarteAusgeben(speisekarte.createIterator());
		}
	}
   
	void speisekarteAusgeben(Iterator iterator) {
		while (iterator.hasNext()) {
			Speise speise = (Speise)iterator.next();
			System.out.print(speise.getName() + ", ");
			System.out.print(speise.getPreis() + " -- ");
			System.out.println(speise.getBeschreibung());
		}
	}
}  
