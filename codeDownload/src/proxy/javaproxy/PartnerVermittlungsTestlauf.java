package headfirst.proxy.javaproxy;

import java.lang.reflect.*;
import java.util.*;

public class PartnerVermittlungsTestlauf {
	Hashtable datingDB = new Hashtable();
 	
	public static void main(String[] args) {
		PartnerVermittlungsTestlauf test = new PartnerVermittlungsTestlauf();
		test.laufen();
	}
 
	public PartnerVermittlungsTestlauf() {
		initialisiereDatenbank();
	}

	public void laufen() {
		PersonBean henri = getPersonAusDatenbank("Henri Javabean"); 
		
		PersonBean eigentümerProxy = getEigentümerProxy(henri);
		System.out.println("Name ist " + eigentümerProxy.getName());
		eigentümerProxy.setInteressen("Bowling, Schach");
		System.out.println("Interessen durch Eigentümer-Proxy gesetzt.");
		try {
			eigentümerProxy.setHotOrNotBewertung(10);
		} catch (Exception e) {
			System.out.println("Bewertung kann nicht durch Eigentümer-Proxy gesetzt werden.");
		}
		System.out.println("Bewertung ist " + eigentümerProxy.getHotOrNotBewertung());

		PersonBean nichtEigentümerProxy = getNichtEigentümerProxy(henri);
		System.out.println("Name ist " + nichtEigentümerProxy.getName());
		try {
			nichtEigentümerProxy.setInteressen("Bowling, Schach");
		} catch (Exception e) {
			System.out.println("Interessen können nicht durch Nicht-Eigentümer-Proxy gesetzt werden.");
		}
		nichtEigentümerProxy.setHotOrNotBewertung(3);
		System.out.println("Bewertung durch Nicht-Eigentümer-Proxy gesetzt.");
		System.out.println("Bewertung ist " + nichtEigentümerProxy.getHotOrNotBewertung());
	}

	PersonBean getEigentümerProxy(PersonBean person) {
 		
        return (PersonBean) Proxy.newProxyInstance( 
            	person.getClass().getClassLoader(),
            	person.getClass().getInterfaces(),
                new EigentuemerInvocationHandler(person));
	}

	PersonBean getNichtEigentümerProxy(PersonBean person) {
		
        return (PersonBean) Proxy.newProxyInstance(
            	person.getClass().getClassLoader(),
            	person.getClass().getInterfaces(),
                new NichtEigentuemerInvocationHandler(person));
	}

	PersonBean getPersonAusDatenbank(String name) {
		return (PersonBean)datingDB.get(name);
	}

	void initialisiereDatenbank() {
		PersonBean henri = new PersonBeanImpl();
		henri.setName("Henri Javabean");
		henri.setInteressen("Autos, Computer, Musik");
		henri.setHotOrNotBewertung(7);
		datingDB.put(henri.getName(), henri);

		PersonBean kelly = new PersonBeanImpl();
		kelly.setName("Kelly Klosure");
		kelly.setInteressen("ebay, Filme, Musik");
		kelly.setHotOrNotBewertung(6);
		datingDB.put(kelly.getName(), kelly);
	}
}
