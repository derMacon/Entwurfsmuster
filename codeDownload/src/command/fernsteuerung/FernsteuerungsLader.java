package headfirst.command.fernsteuerung;

public class FernsteuerungsLader {
 
	public static void main(String[] args) {
		FernSteuerung fernSteuerung = new FernSteuerung();
 
		Licht wohzimmerBeleuchtung = new Licht("Wohnzimmer");
		Licht küchenBeleuchtung = new Licht("Küche");
		Ventilator ventilator= new Ventilator("Wohnzimmer");
		GaragenTor garagenTor = new GaragenTor("");
		StereoAnlage stereo = new StereoAnlage("Wohnzimmer");
  
		LichtAnBefehl wohnzimmerBeleuchtunAn = 
				new LichtAnBefehl(wohzimmerBeleuchtung);
		LichtAusBefehl wohnzimmerBeleuchtungAus = 
				new LichtAusBefehl(wohzimmerBeleuchtung);
		LichtAnBefehl küchenBeleuchtunAn = 
				new LichtAnBefehl(küchenBeleuchtung);
		LichtAusBefehl küchenBeleuchtungAus = 
				new LichtAusBefehl(küchenBeleuchtung);
  
		VentilatorAnBefehl ventilatorAn = 
				new VentilatorAnBefehl(ventilator);
		VentilatorAusBefehl ventilatorAus = 
				new VentilatorAusBefehl(ventilator);
 
		GaragenTorHochBefehl garagenTorHoch =
				new GaragenTorHochBefehl(garagenTor);
		GaragenTorRunterBefehl garagenTorRunter =
				new GaragenTorRunterBefehl(garagenTor);
 
		StereoAnlageAnMitCD stereoAnlageAnFürCD =
				new StereoAnlageAnMitCD(stereo);
		StereoAnlageAusBefehl  stereoAnlageAus =
				new StereoAnlageAusBefehl(stereo);
 
		fernSteuerung.setBefehl(0, wohnzimmerBeleuchtunAn, wohnzimmerBeleuchtungAus);
		fernSteuerung.setBefehl(1, küchenBeleuchtunAn, küchenBeleuchtungAus);
		fernSteuerung.setBefehl(2, ventilatorAn, ventilatorAus);
		fernSteuerung.setBefehl(3, stereoAnlageAnFürCD, stereoAnlageAus);
  
		System.out.println(fernSteuerung);
 
		fernSteuerung.anKnopfWurdeGedrückt(0);
		fernSteuerung.ausKnopfWurdeGedrückt(0);
		fernSteuerung.anKnopfWurdeGedrückt(1);
		fernSteuerung.ausKnopfWurdeGedrückt(1);
		fernSteuerung.anKnopfWurdeGedrückt(2);
		fernSteuerung.ausKnopfWurdeGedrückt(2);
		fernSteuerung.anKnopfWurdeGedrückt(3);
		fernSteuerung.ausKnopfWurdeGedrückt(3);
	}
}
