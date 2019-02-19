/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel.Kapitel1_StrategyMuster.Code_EntenKapselnUnterschiedlichenVerhaltens;

/**
 *
 * @author silas
 */
public class MiniEntenSimulator {
    public static void main(String[] args) {
        Ente mallard = new StockEnte();
        mallard.tuQuaken();
        mallard.tuFliegen();
        
        Ente modell = new ModellEnte();
        modell.tuFliegen();
        modell.setFlugVerhalten(new FliegtRaketenGetrieben());
        modell.tuFliegen();
    }
}
