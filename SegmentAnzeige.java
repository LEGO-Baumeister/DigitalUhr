/**
 * Write a description of class SegmentAnzeige here.
 *
 * @author Lukas Breuer
 * @version 09.03.2020
 */
public class SegmentAnzeige
{   
    private static int hoehe = 100;
    private static int breite = 20;
    private static int segmentBreite = 2*breite + hoehe;
    private int abstandX = 40;
    private int abstandY = 40;
    private int xVerschiebung;

    private Rechteck oMitte = new Rechteck();
    private Rechteck oRechts = new Rechteck();
    private Rechteck oLinks = new Rechteck();
    private Rechteck mMitte = new Rechteck();
    private Rechteck uLinks = new Rechteck();
    private Rechteck uRechts = new Rechteck();
    private Rechteck uMitte = new Rechteck();

    public SegmentAnzeige(int xVerschiebung)
    {   
        this.xVerschiebung = xVerschiebung;
        positionieren(xVerschiebung);
    }

    private void positionieren(int xVerschiebung) {

        //Groessen
        oMitte.groesseAendern(hoehe, breite);
        oRechts.groesseAendern(breite, hoehe);
        oLinks.groesseAendern(breite, hoehe);
        mMitte.groesseAendern(hoehe, breite);
        uLinks.groesseAendern(breite, hoehe);
        uMitte.groesseAendern(hoehe, breite);
        uRechts.groesseAendern(breite, hoehe);

        //Positionen
        oMitte.positionAendern(abstandX + breite + xVerschiebung, abstandY);
        oRechts.positionAendern(abstandX + hoehe + breite + xVerschiebung, abstandY + breite);
        oLinks.positionAendern(abstandX + xVerschiebung, abstandY + breite);
        mMitte.positionAendern(abstandX + breite + xVerschiebung, abstandY + hoehe + breite);
        uLinks.positionAendern(abstandX + xVerschiebung, abstandY + breite + hoehe + breite);
        uMitte.positionAendern(abstandX + breite + xVerschiebung, abstandY + breite + hoehe + breite + hoehe);
        uRechts.positionAendern(abstandX + hoehe + breite + xVerschiebung, abstandY + breite + hoehe + breite);

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

    public void anzeigen(int wert) {
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
                oLinks.unsichtbarMachen();
                mMitte.sichtbarMachen();
                uLinks.sichtbarMachen();
                uMitte.sichtbarMachen();
                uRechts.unsichtbarMachen();
                break;
            case 3:
                oMitte.sichtbarMachen();
                oRechts.sichtbarMachen();
                oLinks.unsichtbarMachen();
                mMitte.sichtbarMachen();
                uLinks.unsichtbarMachen();
                uMitte.sichtbarMachen();
                uRechts.sichtbarMachen();
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
    
    public void unsichtbatMachen() {
        oMitte.unsichtbarMachen();
                oRechts.unsichtbarMachen();
                oLinks.unsichtbarMachen();
                mMitte.unsichtbarMachen();
                uLinks.unsichtbarMachen();
                uMitte.unsichtbarMachen();
                uRechts.unsichtbarMachen();
    }
    
    public static int getSegmentBreite() {
        return segmentBreite;
    }
    
    public static int getHoehe() {
        return hoehe;
    }
    
    public static int getBreite() {
        return breite;
    }
}