package headfirst.command.party;

public class MakroBefehl implements Befehl {
	Befehl[] befehle;
 
	public MakroBefehl(Befehl[] befehle) {
		this.befehle = befehle;
	}
 
	public void ausführen() {
		for (int i = 0; i < befehle.length; i++) {
			befehle[i].ausführen();
		}
	}
 
	public void rückgängig() {
		for (int i = 0; i < befehle.length; i++) {
			befehle[i].rückgängig();
		}
	}
}

