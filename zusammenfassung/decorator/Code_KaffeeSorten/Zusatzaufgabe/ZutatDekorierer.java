package Kapitel.Kapitel3_DecoratorMuster.Code_KaffeeSorten.Zusatzaufgabe;

import Kapitel.Kapitel3_DecoratorMuster.Code_KaffeeSorten.Hauptaufgabe.*;

/**
 *
 * @author silas
 */
public abstract class ZutatDekorierer extends Getraenk {

    @Override
    public abstract String getBeschreibung();
    
    @Override
    public abstract Groesse getGroesse(); 
    
}
