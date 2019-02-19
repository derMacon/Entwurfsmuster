package headfirst.command.fernsteuerung;

public class GaragenTorHochBefehl implements Befehl {
	GaragenTor garagenTor;

	public GaragenTorHochBefehl(GaragenTor garagenTor) {
		this.garagenTor = garagenTor;
	}

	public void ausführen() {
		garagenTor.hoch();
	}
}
