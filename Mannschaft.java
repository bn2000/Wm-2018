
/**
 * Beschreiben Sie hier die Klasse Mannschaft.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Mannschaft
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String spieler;
    private String trainer;
    private String name;
  

    /**
     * Konstruktor für Objekte der Klasse Mannschaft
     */
    public Mannschaft(String spieler,String trainer,String name)
    {
        this.spieler=spieler;
        this.trainer=trainer;cvvv
        this.name=name;
        
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public String gibSpieler()
    {
        return spieler;
        
    }
    
    public String gibTrainer()
    {
        return trainer;
        
    }
    
    public String gibName()
    {
        return name;
        
    }
    
}
