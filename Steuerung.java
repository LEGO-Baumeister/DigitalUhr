
/**
 * Steuert die Zähler und später die Anzeigen
 *
 * @author Lukas Breuer
 * @version 22.02.20
 */
public class Steuerung
{   
    private Zaehler sekunden = new Zaehler();
    private Zaehler minuten = new Zaehler();
    private Zaehler stunden = new Zaehler();

    private int sekunde = 60;
    private int minute = 60;
    private int stunde = 24;
    
    private int zaehlenSekunden() {
        return sekunden.zaehlen(sekunde, 50);
        /*minuten.zaehlen(minute, 50);
        stunden.zaehlen(stunde, 50);*/
    }

    public void umschlagen() {
        zaehlenSekunden();
        if(zaehlenSekunden() == sekunde -1) {
            System.out.println("Max erreicht");
        }
    }
}
