package headfirst.command.einfachefernsteuerung;

import java.util.*;

//
// Das ist der Aufrufe
//
public class EinfacheFernSteuerung {
	Befehl platz;
 
	public EinfacheFernSteuerung() {}
 
	public void setBefehl(Befehl befehl) {
		platz = befehl;
	}
 
	public void knopfWurdeGedrückt() {
		platz.ausführen();
	}
}
