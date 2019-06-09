package headfirst.command.einfachefernsteuerung;

public class FernsteuerungTestlauf {
	public static void main(String[] args) {
		EinfacheFernSteuerung fernsteuerung = new EinfacheFernSteuerung();
		Licht licht = new Licht();
		GaragenTor garagenTor = new GaragenTor();
		LichtAnBefehl lichtEin = new LichtAnBefehl(licht);
		GaragenTorOeffnenBefehl garageÖffnen = 
		    new GaragenTorOeffnenBefehl(garagenTor);
 
		fernsteuerung.setBefehl(lichtEin);
		fernsteuerung.knopfWurdeGedrückt();
		fernsteuerung.setBefehl(garageÖffnen);
		fernsteuerung.knopfWurdeGedrückt();
    }
}
