package headfirst.command.party;

import java.util.*;

//
// This is the invoker
//
public class FernSteuerung {
	Befehl[] anBefehle;
	Befehl[] ausBefehle;
	Befehl rückgängigBefehl;
 
	public FernSteuerung() {
		anBefehle = new Befehl[7];
		ausBefehle = new Befehl[7];
 
		Befehl keinBefehl = new KeinBefehl();
		for(int i=0;i<7;i++) {
			anBefehle[i] = keinBefehl;
			ausBefehle[i] = keinBefehl;
		}
		rückgängigBefehl = keinBefehl;
	}
  
	public void setBefehl(int slot, Befehl einBefehl, Befehl ausBefehl) {
		anBefehle[slot] = einBefehl;
		ausBefehle[slot] = ausBefehl;
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
