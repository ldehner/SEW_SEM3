package g_5_3_2;
import g_5_3_1.Punkt2D;
/**
 * Die Klasse macht jegliche Sachen mit Dreiecken
 * @author Linus Benedikt Dehner
 * @version 06.11.2017
 */
public class Dreieck {
	private Punkt2D p1,p2,p3;
	private double u;
	/**
	 * Dies is der Standardkonstruktor welcher Dem Dreieck Punkte zuweist
	 */
	public Dreieck(){
		Punkt2D p4 = new Punkt2D(1, 1);
		this.setP1(p4);
		Punkt2D p5 = new Punkt2D(5, 1);
		this.setP2(p5);
		Punkt2D p6 = new Punkt2D(3, 5);
		this.setP3(p6);
	}
	/**
	 * Der Konstruktor weißt dem Dreieck benutzerdefinierte Punkte zu
	 * @param x1 holt sich die Variable aus der Testklasse
	 * @param y1 holt sich die Variable aus der Testklasse
	 * @param x2 holt sich die Variable aus der Testklasse
	 * @param y2 holt sich die Variable aus der Testklasse
	 * @param x3 holt sich die Variable aus der Testklasse
	 * @param y3 holt sich die Variable aus der Testklasse
	 */
	public Dreieck(double x1,double y1, double x2, double y2, double x3, double y3){
		Punkt2D p1 = new Punkt2D(x1, y1);
		this.setP1(p1);
		Punkt2D p2 = new Punkt2D(x2, y2);
		this.setP2(p2);
		Punkt2D p3 = new Punkt2D(x3, y3);
		this.setP3(p3);
		
	}
	/**
	 * Gibt p1 zurück
	 * @return p1
	 */
	public Punkt2D getP1() {
		return p1;
	}
	/**
	 * setzt p1 auf den benutzerdefinierten wert
	 * @param holt sich den Punkt aus dem Konstruktor
	 */
	public void setP1(Punkt2D p1) {
		this.p1 = p1;
	}
	/**
	 * Gibt p2 zurück
	 * @return p2
	 */
	public Punkt2D getP2() {
		return p2;
	}
	/**
	 * setzt p2 auf den benutzerdefinierten wert
	 * @param holt sich den Punkt aus dem Konstruktor
	 */
	public void setP2(Punkt2D p2) {
		this.p2 = p2;
	}
	/**
	 * Gibt p3 zurück
	 * @return p3
	 */
	public Punkt2D getP3() {
		return p3;
	}
	/**
	 * Setzt p3 auf den benutzerdefinierten Wert
	 * @param holt sich den Punkt aus dem Konstruktor
	 */
	public void setP3(Punkt2D p3) {
		this.p3 = p3;
	}
	/**
	 * Errechnet mit Hilfe der Abstand Methode aus der Klasse Punkt2D den Umfang
	 * @return den Umfang
	 */
	public double umfang() {
		double ab1 = Punkt2D.abstand(this.p1, this.p2);
		double ab2 = Punkt2D.abstand(this.p2,this.p3);
		double ab3 = Punkt2D.abstand(this.p3,this.p1);
		this.u = ab1+ab2+ab3;
		return this.u;
	}
	/**
	 * Überprüft ob die 2 Dreiecke die Selben sind
	 * @param toCompare holt sich das 2. Dreieck aus der Testklasse
	 * @return ob die zwei Dreiecke überein stimmen
	 */
	public boolean equals(Dreieck toCompare) {
		boolean equals = false;
		equals = getP1().equals(toCompare.getP1()) && getP2().equals(toCompare.getP2()) && getP3().equals(toCompare.getP3());
		return equals;
	}
	/**
	 * Gibt die Daten der Dreiecke mit Hilfe der Methode textDaten aus der Klasse Punkt2D zurück
	 * @return die Daten
	 */
	public String Daten() {
		String pu1 = this.p1.textDaten();
		String pu2 = this.p2.textDaten();
		String pu3 = this.p3.textDaten();
		return pu1+" "+pu2+" "+pu3;
		
	}
}
