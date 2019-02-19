package headfirst.combining.decorator;

public class GansAdapter implements Quakfaehig {
	Gans gans;
 
	public GansAdapter(Gans gans) {
		this.gans = gans;
	}
  
	public void quaken() {
		gans.schnattern();
	}
 
	public String toString() {
		return "sich als Ente ausgebende Gans";
	}
}
