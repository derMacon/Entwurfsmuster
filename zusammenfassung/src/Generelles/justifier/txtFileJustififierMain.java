package Generelles.justifier;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author silas
 */
public class txtFileJustififierMain {

//    public static void main(String args[]) throws IOException {
//        txtFileJustifier j = new txtFileJustifier();
//        j.launchTxtJustifier(args);
//    }
    
    public static void main(String args[]) throws IOException {
        txtFileJustifier j = new txtFileJustifier();
        String input[] = new String[] {"F:\\Studium\\2.Semester\\ProgrammStrukturen2\\PS2Klausurvorbereitung\\PS2Klausurvorbereitung\\src\\Silas\\Generelles\\justifier\\TestFiles\\SS16Aufg2 - Kopie.txt"};
        j.launchTxtJustifier(input);
        System.out.println("Ende");
    }

}
