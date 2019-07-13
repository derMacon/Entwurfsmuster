package headfirst.adapter.enten;

public class TruthahnAdapter implements Ente {
	Truthahn truthahn;
 
	public TruthahnAdapter(Truthahn truthahn) {
		this.truthahn = truthahn;
	}
    
	public void quaken() {
		truthahn.kollern();
	}
  
	public void fliegen() {
		for(int i=0; i < 5; i++) {
			truthahn.fliegen();
		}
	}
}
