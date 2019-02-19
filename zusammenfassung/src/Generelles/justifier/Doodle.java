/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generelles.justifier;

import java.util.Scanner;

/**
 *
 * @author silas
 */
public class Doodle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter text that needs to be justified:");
        
        Justifier j = new Justifier(); 
        String userInput; 
        boolean isFinished; 
        do {
            Scanner sc = new Scanner(System.in);
            userInput = sc.next();
            isFinished = !"x".equals(userInput);
            if (!isFinished) {
                System.out.println(j.organize(userInput));
            }
        } while (isFinished);         
    }
    
}
