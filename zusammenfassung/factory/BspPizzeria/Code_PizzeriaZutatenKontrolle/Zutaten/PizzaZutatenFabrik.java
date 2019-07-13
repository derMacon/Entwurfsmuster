package Kapitel.Kapitel4_FactoryMuster.BspPizzeria.Code_PizzeriaZutatenKontrolle.Zutaten;

/**
 *
 * @author silas
 */
public interface PizzaZutatenFabrik {
    public Teig erstelleTeig(); 
    public Sosse erstelleSosse(); 
    public Kaese erstelleKaese(); 
    public Salami erstelleSalemi(); 
    public Gemuese[] erstelleGemuese(); 
    public Thunfisch erstelleThunfisch(); 
    public Krabben erstelleKraben(); 
}
