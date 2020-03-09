/**
 * Zählt bis zu einer bestimmten Zahl.
 *
 * @author Lukas Breuer
 * @version 02.03.2020
 */
public class Zaehler
{
    private int zeitWert;
    private String zeitString;
    private int zaehlenBis;
    private long delay;

    public Zaehler(int zaehlenBis) {
        this.zaehlenBis = zaehlenBis;
        zeitWert = -1;
        delay = 100;
        zaehlen();
    }

    public void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void zaehlen() {
        if(zeitWert + 1 < zaehlenBis) {
            sleep(delay);
            zeitWert++;
        } else {
            sleep(delay);
            zeitWert = 0;
        }

    }
    
    public void formattierung() {
        if(zeitWert < 10) {
            zeitString = "0" + Integer.toString(zeitWert);
        } else {
            zeitString = Integer.toString(zeitWert);
        }
    }
    
    public String getZeitString() {
        return zeitString;
    }
    
    public int getZeitWert() {
        return zeitWert;
    }

    public void setZeitWert(int zeitWert) {
        this.zeitWert = zeitWert;
    }

    public int getZaehlenBis() {
        return zaehlenBis;
    }

}
