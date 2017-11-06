package g_5_2_3;
/**
 * errechnet Daten eines Benutzerdefinierten Kegels
 * @author Linus Benedikt Dehner
 * @version 06.11.2017
 */
public class Kegel {
	private double r;
	private double d;
	private double h;
	private double volume;
	private double ober;
	private double grund;
	private double mantel;
	public Kegel(double d, double h){
		this.setH(h);
		this.setD(d);
	}
	/**
	 * Setzt die H�he auf den benutzerdefinierten Wert
	 * @param h holt sich die Variable aus dem Konstruktor
	 */
	public void setH(double h) {
		this.h = h;
	}
	/**
	 * Gibt die H�he zur�ck
	 * @return die H�he
	 */
	public double getH() {
		return this.h;
	}
	/**
	 * Setzt den Durchmesser auf den benutzerdefinierten Wert
	 * @param d holt sich die Variable aus dem Konstruktor
	 */
	public void setD(double d) {
		this.d = d;
	}
	/**
	 * Gibt den Durchmesser zur�ck
	 * @return den Durchmesser
	 */
	public double getD() {
		return this.d;
	}
	/**
	 *  Errechnet sich den Radius
	 * @return den Radius
	 */
	public double radius() {
		double d = this.d;
		double r = d/2.0;
		this.r = r;
		return this.r;
	}
	/**
	 * Gibt die Grundfl�che zur�ck
	 * @return die Grundfl�che
	 */
	public double grund() {
		
		return this.grund;
	}
	/**
	 * Errechnet sich das Volumen
	 * @return das Volumen
	 */
	public double volumen() {
		double drittl = 1.0/3.0;
		this.volume = drittl*this.grund*this.h;
		return this.volume;
	}
	/**
	 * Gibt den Mantel zur�ck
	 * @return denk Mantel
	 */
	public double mantel() {
		
		return this.mantel;
	}
	/**
	 * Errechnet sich die Oberfl�che
	 * @return die Oberfl�che
	 */
	public double ober() {
		this.grund = (radius()*radius())*Math.PI;
		double s = (radius()*radius())*(this.h*this.h);
		s = Math.pow(s, 0.5);
		this.mantel = Math.PI*radius()*s;
		this.ober = this.mantel+this.grund;
		return this.ober;
	}
	/**
	 * Gibt alle Infos zur�ck
	 * @return die Infos
	 */
	public String gesamtInfo() {
		String s = "Durchmesser: "+this.d+"\nRadius: "+radius()+"\nH�he: "+this.h+"\nOberfl�che: "+ober()+"\nVolumen:"+volumen();
		return s;	
	}
}
