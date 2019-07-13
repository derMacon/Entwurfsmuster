package headfirst.command.einfachefernsteuerung;

public class GaragenTor {

	public GaragenTor() {
	}

	public void hoch() {
		System.out.println("Garagentor ist offen");
	}

	public void runter() {
		System.out.println("Garagetor ist geschlossen");
	}

	public void halt() {
		System.out.println("Garagentor wurde angehalten");
	}

	public void lichtEin() {
		System.out.println("Garagenbeleuchtung ist an");
	}

	public void lichtAus() {
		System.out.println("Garagenbeleuchtung ist aus");
	}
}
