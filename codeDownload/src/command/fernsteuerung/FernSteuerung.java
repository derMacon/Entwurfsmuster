package headfirst.command.fernsteuerung;

import java.util.*;

//
// Das ist der Aufrufer
//
public class FernSteuerung {
	Befehl[] anBefehle;
	Befehl[] ausBefehle;
 
	public FernSteuerung() {
		anBefehle = new Befehl[7];
		ausBefehle = new Befehl[7];
 
		Befehl keinBefehl = new KeinBefehl();
		for (int i = 0; i < 7; i++) {
			anBefehle[i] = keinBefehl;
			ausBefehle[i] = keinBefehl;
		}
	}
  
	public void setBefehl(int platz, Befehl anBefehl, Befehl offCommand) {
		anBefehle[platz] = anBefehl;
		ausBefehle[platz] = offCommand;
	}
 
	public void anKnopfWurdeGedrückt(int platz) {
		anBefehle[platz].ausführen();
	}
 
	public void ausKnopfWurdeGedrückt(int platz) {
		ausBefehle[platz].ausführen();
	}
  
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Fernsteuerung -------\n");
		for (int i = 0; i < anBefehle.length; i++) {
			stringBuff.append("[Platz " + i + "] " + anBefehle[i].getClass().getName()
				+ "    " + ausBefehle[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
}
