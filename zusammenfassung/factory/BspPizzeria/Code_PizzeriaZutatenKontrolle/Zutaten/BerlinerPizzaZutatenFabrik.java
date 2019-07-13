package Kapitel.Kapitel4_FactoryMuster.BspPizzeria.Code_PizzeriaZutatenKontrolle.Zutaten;

/**
 *
 * @author silas
 */
public class BerlinerPizzaZutatenFabrik implements PizzaZutatenFabrik {
    
    public Teig erstellTeig() {
        return new TeigMitDuennerKruste();
    }
    
    public Sosse erstelleSosse() {
        return new MarinaraSosse(); 
    }
    
    public Kaese erstelleKaese() {
        return new Parmesan();
    }
    
    public Salami erstelleSalami() {
        return new SpanischeSalami(); 
    }
    
    public Gemuese[] erstelleGemuese() {
        Gemuese gemuese[] = {new Knoblauch(), new Zwiebeln(), new Pilze(), new Paprika()};
        return gemuese;
    }
    
    public Thunfisch erstelleThunfisch() {
        return new Thunfischstuecke(); 
    }

    public Krabben erstelleKrabben() {
        return new FrischeKrabben(); 
    }

    @Override
    public Teig erstelleTeig() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Salami erstelleSalemi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Krabben erstelleKraben() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
