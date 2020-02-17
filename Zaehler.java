
/**
 * Write a description of class Zaehler here.
 *
 * @author Lukas Breuer
 * @version 17.02.2020
 */
public class Zaehler
{
    private int zeitWert;
    private int zaehlenBis;
    
    public Zaehler(int zaehlenBis) {
    zeitWert = 0;
    this.zaehlenBis = zaehlenBis;
    zaehlen(zaehlenBis);
    }
    
    public void reset() {
        setZeitWert(0);
    }
    
    
    public int zaehlen(int zaehlenBis) {
        
        while(zeitWert < zaehlenBis) {
            if(zeitWert == zaehlenBis - 1) {
                reset();
            } else {
              System.out.println(zeitWert);
              zeitWert++;
            }
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
