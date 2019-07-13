package headfirst.command.party;

public class FernsteuerungsLader {

	public static void main(String[] args) {

		FernSteuerung fernSteuerung = new FernSteuerung();

		Licht licht = new Licht("Wohnzimmer");
		Fernseher fernseher = new Fernseher("Wohnzimmer");
		StereoAnlage stereo = new StereoAnlage("Wohnzimmer");
		Whirlpool whirlpool = new Whirlpool();
 
		LichtAusBefehl lichtAn = new LichtAusBefehl(licht);
		StereoAnlageEinBefehl stereoAn = new StereoAnlageEinBefehl(stereo);
		FernseherAnBefehl fernseherAn = new FernseherAnBefehl(fernseher);
		WhirlpoolAnBefehl whirlpoolAn = new WhirlpoolAnBefehl(whirlpool);
		LichtAusBefehl lichtAus = new LichtAusBefehl(licht);
		StereoAnlageAusBefehl stereoAus = new StereoAnlageAusBefehl(stereo);
		FernseherAusBefehl fernseherAus = new FernseherAusBefehl(fernseher);
		WhirlpoolAusBefehl whirlpoolAus = new WhirlpoolAusBefehl(whirlpool);

		Befehl[] partyAn = { lichtAn, stereoAn, fernseherAn, whirlpoolAn};
		Befehl[] partyAus = { lichtAus, stereoAus, fernseherAus, whirlpoolAus};
  
		MakroBefehl partyAnMakro = new MakroBefehl(partyAn);
		MakroBefehl partyAusMakro = new MakroBefehl(partyAus);
 
		fernSteuerung.setBefehl(0, partyAnMakro, partyAusMakro);
  
		System.out.println(fernSteuerung);
		System.out.println("--- Schalte Makro ein---");
		fernSteuerung.anKnopfWurdeGedrückt(0);
		System.out.println("--- Schalte Makro aus---");
		fernSteuerung.ausKnopfWurdeGedrückt(0);
	}
}
