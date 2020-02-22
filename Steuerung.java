
/**
 * Steuert die Zähler und später die Anzeigen
 *
 * @author Lukas Breuer
 * @version 22.02.20
 */
public class Steuerung
{
    private static Zaehler sekZaehler = new Zaehler(60);
    //private static Zaehler minZaehler = new Zaehler(60);
    //private static Zaehler hZaehler = new Zaehler(24);
    
    public static void main(String[] args) {
       if(sekZaehler.getZeitWert() == sekZaehler.getZaehlenBis()) {
           Zaehler minZaehler = new Zaehler(60);
       }
    }
}
