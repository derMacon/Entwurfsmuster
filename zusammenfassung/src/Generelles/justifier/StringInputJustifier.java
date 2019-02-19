/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generelles.justifier;

/**
 *
 * @author silas
 */
public class StringInputJustifier {
    
    
    public static void main(String args[]) {
        String input = "Wenn dies direkt in die Klasse geschrieben wird ist diese sehr schlecht wartbar, denn die Klassen \n" +
"sind sehr schlecht wartbar. Die Loesung hierbei, das Strategy-Muster. Man versucht aehnliche \n" +
"Algrothmen wie z.B. das Flug- oder Quakverhalten in eine Gruppe/Familie von Algorithmen \n" +
"zusammenzufassen (zu kapseln). Dies geschieht mithilfe verschiedener Interfaces z.B. \n" +
"Quakverhalten / Flugverhalten. Die Mutterklasse besitzt entsprechende Felder von den Typen \n" +
"Quak-/Flugverhalten. Diese werden entsprechend gesetzt und in den jeweiligen Methoden aufgerufen. \n" +
"Die aufrufenden erbenden Klassen implementieren das entsprechende Interface und koennen so das \n" +
"gewuenschte Verhalten implementieren. Hierbei gestaltet sich die Wartung des Codes deutlich \n" +
"einfacher.";
        
        
        Justifier j = new Justifier(); 
        j.organize(input);
    }
    
    
    
}
