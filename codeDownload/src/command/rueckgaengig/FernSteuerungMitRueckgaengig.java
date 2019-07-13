package headfirst.command.rueckgaengig;

import java.util.*;

//
// Das ist der Aufrufer
//
public class FernSteuerungMitRueckgaengig {
	Befehl[] anBefehle;
	Befehl[] ausBefehle;
	Befehl rückgängigBefehl;
 
	public FernSteuerungMitRueckgaengig() {
		anBefehle = new Befehl[7];
		ausBefehle = new Befehl[7];
 
		Befehl keinBefehl = new KeinBefehl();
		for(int i=0;i<7;i++) {
			anBefehle[i] = keinBefehl;
			ausBefehle[i] = keinBefehl;
		}
		rückgängigBefehl = keinBefehl;
	}
  
	public void setBefehl(int platz, Befehl anBefehl, Befehl einBefehl) {
		anBefehle[platz] = anBefehl;
		ausBefehle[platz] = einBefehl;
	}
 
	public void anKnopfWurdeGedrückt(int platz) {
		anBefehle[platz].ausführen();
		rückgängigBefehl = anBefehle[platz];
	}
 
	public void ausKnopfWurdeGedrückt(int platz) {
		ausBefehle[platz].ausführen();
		rückgängigBefehl = ausBefehle[platz];
	}
 
	public void rückgängigKnopfWurdeGedrückt() {
		rückgängigBefehl.rückgängig();
	}
  
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Fernsteuerung -------\n");
		for (int i = 0; i < anBefehle.length; i++) {
			stringBuff.append("[Platz " + i + "] " + anBefehle[i].getClass().getName()
				+ "    " + ausBefehle[i].getClass().getName() + "\n");
		}
		stringBuff.append("[Rückgängig] " + rückgängigBefehl.getClass().getName() + "\n");
		return stringBuff.toString();
	}
}
