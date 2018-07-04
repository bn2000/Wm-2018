
public class Spiel
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int datum;
    private String ort;
    private int heimtore;
    private int gasttore;
    private Mannschaft heimmannschaft;
    private Mannschaft gastmannschaft; 
    

    /**
     * Konstruktor für Objekte der Klasse Spiel
     */
    public Spiel(int datum,int heimtore,int gasttore)
    {
        // Instanzvariable initialisieren
        this.datum=datum;
        this.ort=ort;
        this.heimtore=heimtore;
        this.gasttore=gasttore;
        this.heimmannschaft=heimmannschaft;
        this.gastmannschaft=gastmannschaft; Selam Aleykum
        
    }
    
    public Mannschaft gibHeimmannschaft()
    {
        return heimmannschaft;
    }
    
    public Mannschaft gibGastmannschaft()
    {
        return gastmannschaft;
    }
    
    public int gibDatum()
    {
        return datum;
    }
    
    public String gibOrt()
    {
        return ort;
    }
    
    public int gibHeimtore()
    {
        return heimtore;
    }
    
    public int gibGasttore()
    {
        return gasttore;
    }
    
}