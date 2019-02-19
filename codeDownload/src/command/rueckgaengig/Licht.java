package headfirst.command.rueckgaengig;

public class Licht {
	String ort;
	int stufe;

	public Licht(String ort) {
		this.ort = ort;
	}

	public void ein() {
		stufe = 100;
		System.out.println("Licht ist an");
	}

	public void aus() {
		stufe = 0;
		System.out.println("Licht ist aus");
	}

	public void dimmen(int stufe) {
		this.stufe = stufe;
		if (stufe == 0) {
			aus();
		}
		else {
			System.out.println("Licht ist gedimmt auf " + stufe + "%");
		}
	}

	public int getStufe() {
		return stufe;
	}
}
