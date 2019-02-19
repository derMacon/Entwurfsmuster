package headfirst.combining.observer;

public interface QuakBeobachtungsSubjekt {
	public void registriereBeobachter(Beobachter beobachter);
	public void benachrichtigeBeobachtende();
}
