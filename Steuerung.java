
/**
 * Steuert die Zähler und später die Anzeigen
 *
 * @author Lukas Breuer
 * @version 02.03.20
 */
public class Steuerung
{
    private Zaehler sekunden = new Zaehler(60);
    private Zaehler minuten = new Zaehler(60);
    private Zaehler stunden = new Zaehler(24);

    public Steuerung() {
        umschlagen();
    }

    private void umschlagen() {
        for(int i = 1; i > 0; i++) {
            sekunden.formattierung();
            minuten.formattierung();
            stunden.formattierung();
            System.out.println(stunden.getZeitString() + ":" + minuten.getZeitString() + ":" + sekunden.getZeitString());
            sekunden.zaehlen();
            if(sekunden.getZeitWert() == 0) {
                minuten.zaehlen();
                            if(minuten.getZeitWert() == 0) {
                    stunden.zaehlen();
                }
            }

        }

    }
    
}
