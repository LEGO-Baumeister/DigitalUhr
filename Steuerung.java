
/**
 * Steuert die Zähler und später die Anzeigen
 *
 * @author Lukas Breuer
 * @version 09.03.20
 */
public class Steuerung
{
    private Zaehler sekunden = new Zaehler(60);
    private Zaehler minuten = new Zaehler(60);
    private Zaehler stunden = new Zaehler(24);
    private Anzeige stundenA = new Anzeige(0);
    private Anzeige minutenA = new Anzeige(400);
    private Anzeige sekundenA = new Anzeige(800);

    public Steuerung() {
        umschlagen();
    }

    private void umschlagen() {
        for(int i = 1; i > 0; i++) {
            simpleAnzeige();
            siebenSegmentAnzeige();
            sekunden.zaehlen();
            if(sekunden.getZeitWert() == 0) {
                minuten.zaehlen();
                if(minuten.getZeitWert() == 0) {
                    stunden.zaehlen();
                }
            }

        }

    }

    private void siebenSegmentAnzeige() {
        sekundenA.wertAnzeigen(sekunden.getZeitWert());
        minutenA.wertAnzeigen(minuten.getZeitWert());
        stundenA.wertAnzeigen(stunden.getZeitWert());
    }

    private void simpleAnzeige() {
        sekunden.formattierung();
        minuten.formattierung();
        stunden.formattierung();
        System.out.println(stunden.getZeitString() + ":" + minuten.getZeitString() + ":" + sekunden.getZeitString());
    }

}
