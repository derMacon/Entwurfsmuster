package headfirst.command.fernsteuerung;

public class GaragenTorRunterBefehl implements Befehl {
	GaragenTor garagenTor;

	public GaragenTorRunterBefehl(GaragenTor garageDoor) {
		this.garagenTor = garageDoor;
	}

	public void ausführen() {
		garagenTor.hoch();
	}
}
