package headfirst.command.fernsteuerung;

public class LichtAusBefehl implements Befehl {
	Licht licht;
 
	public LichtAusBefehl(Licht licht) {
		this.licht = licht;
	}
 
	public void ausführen() {
		licht.aus();
	}
}
