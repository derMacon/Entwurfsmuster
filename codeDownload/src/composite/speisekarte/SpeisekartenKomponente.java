package headfirst.composite.speisekarte;

import java.util.*;

public abstract class SpeisekartenKomponente {
   
	public void hinzufügen(SpeisekartenKomponente speisekartenKomponente) {
		throw new UnsupportedOperationException();
	}
	public void entfernen(SpeisekartenKomponente speisekartenKomponente) {
		throw new UnsupportedOperationException();
	}
	public SpeisekartenKomponente getKind(int i) {
		throw new UnsupportedOperationException();
	}
  
	public String getName() {
		throw new UnsupportedOperationException();
	}
	public String getBeschreibung() {
		throw new UnsupportedOperationException();
	}
	public double getPreis() {
		throw new UnsupportedOperationException();
	}
	public boolean isVegetarisch() {
		throw new UnsupportedOperationException();
	}
  
	public void ausgeben() {
		throw new UnsupportedOperationException();
	}
}
