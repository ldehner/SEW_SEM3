package g_5_3_1;
/**
 * Die Klasse überprüft viele Dinge mit Punkten
 * @author Linus Benedikt Dehner
 * @version 06.11.2017
 */
public class Punkt2D {
	private double x;
	private double y;
	/**
	 * Der Standard Konstruktor setzt x und y auf 0
	 */
	public Punkt2D() {
		this.x = 0;
		this.y = 0;
	}
	/**
	 * Dieser Konstruktor setzt x und y auf benutzerdefinierte Werte
	 * @param x holt x aus der Test Klasse
	 * @param y holt y aus der Test Klasse
	 */
	public Punkt2D(double x, double y) {
		this.setX(x);
		this.setY(y);
	}
	/**
	 * Setzt x auf das benutzerdefinierte x
	 * @param x holt x aus dem Konstruktor
	 */
	public void setX(double x) {
		this.x = x;
	}
	/**
	 * Setzt y auf das benutzerdefinierte y
	 * @param y holt y aus dem Konstruktor
	 */
	public void setY(double y) {
		this.y = y;
	}
	/**
	 * Gibt x zurück
	 * @return x
	 */
	public double getX() {
		return this.x;
	}
	/**
	 * Gibt y zurück
	 * @return y
	 */
	public double getY() {
		return this.y;
	}
	/**
	 * Erstellt Text Daten zu dem Punkt
	 * @return Die Daten
	 */
	public String textDaten() {
		String x = "( "+getX()+" / "+getY()+" )";
		return x;
	}
	/**
	 * Überprüft den Abstand zu 0 mit Hilfe der Methode abstand
	 * @return den Abstand zum 0 Punkt
	 */
	public double abstandNull() {
		double abstand = abstand(new Punkt2D());
		return abstand;
		
	}
	/**
	 * Überprüft den Abstand von einem zum anderen Punkt
	 * @param p1 holt den 2. Punkt aus der Testklasse
	 * @return den Abstand
	 */
	public double abstand(Punkt2D p1) {
		double c;
		double h;
		double w;
		h = this.y - p1.getY();
		w = p1.getX() - this.x;
		c = Math.sqrt(h*h+w*w);
		return c;
	}
	/**
	 * Überprüft ob die Punkte die gleichen sind
	 * @param p holt den 2. Punkt aus der Test Klasse
	 * @return ob die Punkt überein stimmen
	 */
	public boolean equals(Punkt2D p) {
		boolean x = this.x == p.x;
		boolean y = this.y == p.y;
		return x && y;
	}
	/**
	 * Überprüft den Abstand von zwei Punkten mit Hilfe der Methode abstand
	 * @param p1 holt den 1. und 2. Punkt aus der Testklasse
	 * @param p2 holt den 1. und 2. Punkt aus der Testklasse
	 * @return den Abstand
	 */
	public static double abstand(Punkt2D p1, Punkt2D p2) {
		return p1.abstand(p2);
	}
}
