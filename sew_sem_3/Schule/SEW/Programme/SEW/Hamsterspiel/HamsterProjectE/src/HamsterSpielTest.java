import staticHamster.*;

/**
 * Beispiele zum Testen mit dem Hamsterspiel in BlueJ.
 * @author Johann Weiser
 * @version 2013-04-07
 */
public class HamsterSpielTest {

    /**
     * Aufruf eines einzelnen Spiels.
     * @since 2013-04-07
     */
    public static void testSingle() {
        String territorium = "..\\HamsterSpielDaten\\Territorien\\Round0.ter";
        HamsterSpiel.single(territorium, "Schüler1", "schueler1.Round0", "Schüler2", "schueler2.Round0");
        //HamsterSpiel.single(territorium, "Schüler1", null, "Schüler2", "schueler2.Round0");
    }
    
    /**
     * Aufruf zur Ausführung ener ganzen Spielrunde.
     * @since 2013-04-07
     */
    public static void testRunde() {
   	 // in <gameDir>\\Territorien
       String territorium = "Round0.ter";
       String gameDir = "..\\HamsterSpielDaten";
       // in <gameDir>\\NamensListen
       String nameList;
       nameList = "1AHIT.txt";
       nameList = "1AHIT-Extended.txt";
       String className = "Round0";
       HamsterSpiel.runde(gameDir, nameList, className, territorium);
    }

    /**
     * Aufruf zur Ausführung ener ganzen Spielrunde, inklusive des Entzippens einer von Moodle
     * heruntergeladenen zip-Datei, welche alle Abgaben enthält.
     * @since 2013-04-07
     */
    public static void testUnzipUndRunde() {
        String dir7zip = "..\\7-Zip";
        // relative to actual BlueJ Project
        String gameDir = "..\\HamsterSpielDaten";
    	 // in <gameDir>\\Territorien
        String territorium = "Round0.ter";
        // in <gameDir>\\NamensListen
        String nameList;
        nameList = "1AHIT.txt";
        nameList = "1AHIT-Extended.txt";
        String className = "Round1";
        HamsterSpiel.unzipUndRunde(dir7zip, gameDir, nameList, className, territorium,
      	  100, 100, "round1z");
    }
    
    /**
     * Zum Aufrufen einer der beiden Testmethoden. Ein Start des Hamsters (bzw. des
     * Hamsterspiels
     * mit der Standardmethode "main" funktioniert in BlueJ nicht, wenn das zuletzt
     * gestartete Programm noch aktiv ist (d.h. wenn das Hamster-Fenster noch sichtbar
     * ist). Daher wird hier in diesem Beispiel-Programm auf eine Standard-"main" Methode
     * verzichtet.
     * @since 2013-04-07
     */
    public static void main(String[] args) {
   	  //System.getProperties().list(System.out);
        testSingle();
        //testRunde();
        //testUnzipUndRunde();
        //System.exit(0);
    }
    
}
