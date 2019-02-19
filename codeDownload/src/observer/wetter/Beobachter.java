package headfirst.observer.wetter;

public interface Beobachter {
	public void aktualisieren(float temp, float feucht, float druck);
}
