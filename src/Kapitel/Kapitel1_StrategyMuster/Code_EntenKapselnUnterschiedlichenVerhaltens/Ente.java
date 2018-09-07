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
public abstract class Ente {
    protected QuakVerhalten quakVerhalten; 
    protected FlugVerhalten flugVerhalten;

    public void setQuakVerhalten(QuakVerhalten quakVerhalten) {
        this.quakVerhalten = quakVerhalten;
    }

    public void setFlugVerhalten(FlugVerhalten flugVerhalten) {
        this.flugVerhalten = flugVerhalten;
    }
    
    public void tuQuaken() {
        quakVerhalten.quaken();
    }
    
    public void tuFliegen() {
        flugVerhalten.fliegen();
    }
    
}
