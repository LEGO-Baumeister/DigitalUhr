
/**
 * Write a description of class SegmentAnzeige here.
 *
 * @author Lukas Breuer
 * @version 04.03.2020
 */
public class SegmentAnzeige
{   
    private int hoehe = 80;
    private int breite = 20;
    private int abstandX = 40;
    private int abstandY = 40;
    private int stelle1;
    private int stelle2;

    private Rechteck oMitte = new Rechteck();
    private Rechteck oRechts = new Rechteck();
    private Rechteck oLinks = new Rechteck();
    private Rechteck mMitte = new Rechteck();
    private Rechteck uLinks = new Rechteck();
    private Rechteck uRechts = new Rechteck();
    private Rechteck uMitte = new Rechteck();

    public SegmentAnzeige()
    {
        positionieren();
        wertDerStelle(65);
        anzeigen(1);
    }

    private void positionieren() {

        //Groessen
        oMitte.groesseAendern(hoehe, breite);
        oRechts.groesseAendern(breite, hoehe);
        oLinks.groesseAendern(breite, hoehe);
        mMitte.groesseAendern(hoehe, breite);
        uLinks.groesseAendern(breite, hoehe);
        uMitte.groesseAendern(hoehe, breite);
        uRechts.groesseAendern(breite, hoehe);

        //Positionen
        oMitte.positionAendern(abstandX + breite, abstandY);
        oRechts.positionAendern(abstandX + hoehe + breite, abstandY + breite);
        oLinks.positionAendern(abstandX, abstandY + breite);
        mMitte.positionAendern(abstandX + breite, abstandY + hoehe + breite);
        uLinks.positionAendern(abstandX, abstandY + breite + hoehe + breite);
        uMitte.positionAendern(abstandX + breite, abstandY + breite + hoehe + breite + hoehe);
        uRechts.positionAendern(abstandX + hoehe + breite, abstandY + breite + hoehe + breite);

        //test
        /*
        oMitte.sichtbarMachen();
        oRechts.sichtbarMachen();
        oLinks.sichtbarMachen();
        mMitte.sichtbarMachen();
        uLinks.sichtbarMachen();
        uMitte.sichtbarMachen();
        uRechts.sichtbarMachen();
        */
    }

    private void wertDerStelle(int nummer) {
        stelle1 = (nummer / 10) % 10;
        stelle2 = nummer % 10;
        System.out.println(stelle1);
        System.out.println(stelle2);
    }

    private void anzeigen(int wert) {
        switch(wert) {
            case 0:
                oMitte.sichtbarMachen();
                oRechts.sichtbarMachen();
                oLinks.sichtbarMachen();
                mMitte.unsichtbarMachen();
                uLinks.sichtbarMachen();
                uMitte.sichtbarMachen();
                uRechts.sichtbarMachen();
                break;
            case 1:
                oMitte.unsichtbarMachen();
                oRechts.sichtbarMachen();
                oLinks.unsichtbarMachen();
                mMitte.unsichtbarMachen();
                uLinks.unsichtbarMachen();
                uMitte.unsichtbarMachen();
                uRechts.sichtbarMachen();
                break;
            case 2:
                oMitte.sichtbarMachen();
                oRechts.sichtbarMachen();
                mMitte.sichtbarMachen();
                uLinks.sichtbarMachen();
                uMitte.sichtbarMachen();
                break;
            case 3:
                oMitte.sichtbarMachen();
                oRechts.sichtbarMachen();
                mMitte.sichtbarMachen();
                uRechts.sichtbarMachen();
                uMitte.sichtbarMachen();
                break;
            case 4:
                oMitte.unsichtbarMachen();
                oRechts.sichtbarMachen();
                oLinks.sichtbarMachen();
                mMitte.sichtbarMachen();
                uLinks.unsichtbarMachen();
                uMitte.unsichtbarMachen();
                uRechts.sichtbarMachen();
                break;
            case 5:
                oMitte.sichtbarMachen();
                oRechts.unsichtbarMachen();
                oLinks.sichtbarMachen();
                mMitte.sichtbarMachen();
                uLinks.unsichtbarMachen();
                uMitte.sichtbarMachen();
                uRechts.sichtbarMachen();
                break;
            case 6:
                oMitte.sichtbarMachen();
                oRechts.unsichtbarMachen();
                oLinks.sichtbarMachen();
                mMitte.sichtbarMachen();
                uLinks.sichtbarMachen();
                uMitte.sichtbarMachen();
                uRechts.sichtbarMachen();
                break;
            case 7:
                oMitte.sichtbarMachen();
                oRechts.sichtbarMachen();
                oLinks.unsichtbarMachen();
                mMitte.unsichtbarMachen();
                uLinks.unsichtbarMachen();
                uMitte.unsichtbarMachen();
                uRechts.sichtbarMachen();
                break;
            case 8:
                oMitte.sichtbarMachen();
                oRechts.sichtbarMachen();
                oLinks.sichtbarMachen();
                mMitte.sichtbarMachen();
                uLinks.sichtbarMachen();
                uMitte.sichtbarMachen();
                uRechts.sichtbarMachen();
                break;
            case 9:
                oMitte.sichtbarMachen();
                oRechts.sichtbarMachen();
                oLinks.sichtbarMachen();
                mMitte.sichtbarMachen();
                uLinks.unsichtbarMachen();
                uMitte.sichtbarMachen();
                uRechts.sichtbarMachen();
                break;
            default:
                oMitte.unsichtbarMachen();
                oRechts.unsichtbarMachen();
                oLinks.unsichtbarMachen();
                mMitte.unsichtbarMachen();
                uLinks.unsichtbarMachen();
                uMitte.unsichtbarMachen();
                uRechts.unsichtbarMachen();
        }
    }
}




