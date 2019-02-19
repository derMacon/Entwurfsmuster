package headfirst.observer.wetterobservable;
	
import java.util.Observable;
import java.util.Observer;
	
public class WetterDaten extends Observable {
	private float temperatur;
	private float feuchtigkeit;
	private float luftdruck;
	
	public WetterDaten() { }
	
	public void messwerteGeändert() {
		setChanged();
		notifyObservers();
	}
	
	public void setMesswerte(float temp, float feucht, float druck) {
		this.temperatur = temp;
		this.feuchtigkeit = feucht;
		this.luftdruck = druck;
		messwerteGeändert();
	}
	
	public float getTemperatur() {
		return temperatur;
	}
	
	public float getFeuchtigkeit() {
		return feuchtigkeit;
	}
	
	public float getLuftdruck() {
		return luftdruck;
	}
}
