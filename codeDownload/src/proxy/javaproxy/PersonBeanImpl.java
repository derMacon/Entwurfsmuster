package headfirst.proxy.javaproxy;

public class PersonBeanImpl implements PersonBean {
	String name;
	String geschlecht;
	String interessen;
	int bewertung;
	int bewertungsAnzahl = 0;
  
	public String getName() {
		return name;	
	} 
  
	public String getGeschlecht() {
		return geschlecht;
	}
  
	public String getInteressen() {
		return interessen;
	}
   
	public int getHotOrNotBewertung() {
		if (bewertungsAnzahl == 0) return 0;
		return (bewertung/bewertungsAnzahl);
	}
  
 
	public void setName(String name) {
		this.name = name;
	}
 
	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	} 
  
	public void setInteressen(String interessen) {
		this.interessen = interessen;
	} 
  
	public void setHotOrNotBewertung(int bewertung) {
		this.bewertung += bewertung;	
		bewertungsAnzahl++;
	}
}
