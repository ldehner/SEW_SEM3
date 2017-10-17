package g_5_2_1;
/**
 * Die selbst erstellte Klasse errechnet Maße und füllwerte eines Beckens
 * @author Linus Benedikt Dehner
 * @version 11.10.2017
 */
public class Schwimmbecken {
	private int length;
	private int height;
	private int width;
	private int wasser;
	private int wasservoll;
	private int volume;
	private int ablassen;
	
	/**
	 * Die Methode setzt die Werte mit denen aus der Main gleich und gibt dem Wasser einen Wert
	 * @param length holt die angepasste Länge aus der Main
	 * @param height holt die angepasste Höhe aus der Main
	 * @param width holt die angepasste Breite aus der Main
	 */
	public Schwimmbecken(int length, int height, int width) {
		this.length = length;
		this.height = height;
		this.width = width;
		this.wasser = 0;
		this.setWasser(wasser);
	}
	/**
	 * Setzt das Wasser auf einen bestimmten Wert
	 * @param wasser holt den Wert des Wassers aus der Hauptklasse
	 */
	public void setWasser(int wasser) {
		this.wasser = wasser;
	}
	/**
	 * Errechnet das Volumen des Beckens
	 * @return gibt done zurück
	 */
	public String volumen() {
		int a = this.length*this.width;
		this.volume = a*this.height;
		this.wasservoll = (a*this.height)/1000;
		String x = "done";
		return x;
	}
	/**
	 * "Füllt" das Becken mit Wasser
	 * @return gibt done zurück
	 */
	public String einfüllen() {
		for(;wasser<wasservoll;wasser++);
		String x = "done";
		return x;
	}
	/**
	 * Lässt 5000 Liter aus dem Becken
	 * @return gibt done zurück
	 */
	public String auslassen() {
		String x = "done";
		this.ablassen = 5000;
		this.wasser = wasser - 5000;
		return x;
	}
	/**
	 * Leert das Beckne komplett
	 * @return gibt done zurück
	 */
	public String leeren() {
		String x = "done";
		for(;wasser>=0; wasser--);
		return x;		
	}
	/**
	 * Erstellt einen Status und gibt ihn in der Main aus
	 * @return den erstellten Status
	 */
	public String status() {
		int water = this.wasservoll-this.ablassen;
		String status = "Status:\nDas Volumen wurde berechnet.\nDas Becken wurde mit "+this.wasservoll+" Litern randvoll gefüllt.\n"
				+ "Danach wurden "+this.ablassen+" Liter abgelassen, damit ein 10cm Abstand zum Rand herscht.\n"
						+ "Als letztes wurde der ganze Inhalt des Beckens ausgelassen ( von "+water+" Litern auf 0 Liter ).\n"
								+ "Endstatus: Erledigt!";
		return status;
	}
}
