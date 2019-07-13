package headfirst.command.fernsteuerung;

public class Whirlpool {
	boolean an;
	int temperatur;

	public Whirlpool() {
	}

	public void an() {
		an = true;
	}

	public void aus() {
		an = false;
	}

	public void sprudelnAn() {
		if (an) {
			System.out.println("Whirlpool sprudelt!");
		}
	}

	public void sprudelnAus() {
		if (an) {
			System.out.println("Whirlpool sprudelt nicht");
		}
	}

	public void strahlerAn() {
		if (an) {
			System.out.println("Whirlpool-Strahler sind an");
		}
	}

	public void strahlerAus() {
		if (an) {
			System.out.println("Whirlpool-Strahler sind aus");
		}
	}

	public void setTemperatur(int temperatur) {
		this.temperatur = temperatur;
	}

	public void heiß() {
		temperatur = 40;
		System.out.println("Whirlpool wird auf dampfende 40 Grad erhitzt");
	}

	public void kalt() {
		temperatur = 36;
		System.out.println("Whirlpool wird auf 36 Grad abgekühlt");
	}

}
