import staticHamster.*;

/**
 * Klasse, welche an einem einfachen Beispiel die Verwendung des Hamsterprogrammes
 * demonstriert.
 * @author Johann Weiser
 * @version 2012-11-17
 */
public class StaticHamsterTest {

	/**
	 * Ein einfache Methode zum Testen des StaticHamster's. Ein Start des Hamsters
	 * mit der Standardmethode "main" funktioniert in BlueJ nicht, wenn das zuletzt
	 * gestartete Programm noch aktiv ist (d.h. wenn das Hamster-Fenster noch sichtbar
	 * ist). Daher wird hier in diesem Beispielprogramm auf eine Standard-"main" Methode
	 * verzichtet.
	 * @since 2012-11-17
	 */
	public static void main1() {
		StaticTerritorium.erzeugeTerritorium(10, 10);
		StaticHamster.vor();
		StaticHamster.vor();
		StaticHamster.vor();
		StaticHamster.linksUm();
		StaticHamster.linksUm();
		StaticHamster.linksUm();
		StaticHamster.vor();
		StaticHamster.vor();
		StaticHamster.vor();
	}

}
