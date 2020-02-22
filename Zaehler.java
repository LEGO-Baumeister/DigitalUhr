import java.lang.*;
/**
 * Zählt bis zu einer bestimmten Zahl.
 *
 * @author Lukas Breuer
 * @version 17.02.2020
 */
public class Zaehler
{
    private int zeitWert;
    private int zaehlenBis;
    private int delay;
    
    public Zaehler(/*int zaehlenBis*/) {
    zeitWert = 0;
    //this.zaehlenBis = zaehlenBis;
    zaehlen(zaehlenBis, 20);
    }
    
    public void reset() {
        setZeitWert(0);
    }
    
    public void sleep(long delay) {
	try {
		Thread.sleep(delay);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
    }
    
    private void zeitAnzeige() {
        
    }
    
    
    public int zaehlen(int zaehlenBis, long delay) {
        
        for(int i = zeitWert; i <= zaehlenBis - 1; i++) {
            if(i < 10) {
                System.out.println("0" + i);
            } else
                System.out.println(i);
            sleep(delay);
        }
        return zeitWert;
    }
    
    
    public int getZeitWert() {
        return zeitWert;
    }
    
    public void setZeitWert(int zeitWert) {
        this.zeitWert = zeitWert;
    }
}
