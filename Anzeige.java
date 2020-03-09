
/**
 * Beschreiben Sie hier die Klasse Anzeige.
 * 
 * @author Lukas Breuer
 * @version 09.03.2020
 */
public class Anzeige
{   
    private int stelle1;
    private int stelle2;
    int ver;
    
    private SegmentAnzeige stelleZ;
    private SegmentAnzeige stelleE;

    
    public Anzeige(int ver) {
        this.ver = ver;
        stelleZ = new SegmentAnzeige(0 + ver);
        stelleE = new SegmentAnzeige(SegmentAnzeige.getSegmentBreite() + SegmentAnzeige.getBreite() + ver);
    }
    
    
    public void wertAnzeigen(int wert) {
        wertDerStelle(wert);
        stelleZ.anzeigen(stelle1);
        stelleE.anzeigen(stelle2);
    }

    public void wertDerStelle(int nummer) {
        stelle1 = (nummer / 10) % 10;
        stelle2 = nummer % 10;
    }
    
    
}
