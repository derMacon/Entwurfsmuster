package Kapitel.Kapitel2_ObserverMuster.Code_Wetterstation.Code_OhneStandardBibliothek;

/**
 * Subjekt soll vom WetterDaten Objekt implementiert werden. 
 * @author silas
 */
public interface Subjekt {
    public void registriereBeobachter(Beobachter b); 
    public void entferneBeobachter(Beobachter b); 
    public void benachrichtigeBeobachter(); 
}
