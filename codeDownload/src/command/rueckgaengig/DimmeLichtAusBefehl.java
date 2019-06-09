package headfirst.command.rueckgaengig;

public class DimmeLichtAusBefehl implements Befehl {
	Licht licht;
	int vorherigeStufe;

	public DimmeLichtAusBefehl(Licht licht) {
		this.licht = licht;
		vorherigeStufe = 100;
	}

	public void ausführen() {
		vorherigeStufe = licht.getStufe();
		licht.aus();
	}

	public void rückgängig() {
		licht.dimmen(vorherigeStufe);
	}
}
