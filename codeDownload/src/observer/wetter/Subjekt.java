package headfirst.observer.wetter;

public interface Subjekt {
	public void registriereBeobachter(Beobachter o);
	public void entferneBeobachter(Beobachter o);
	public void benachrichtigeBeobachter();
}
