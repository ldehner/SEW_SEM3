package g_5_3_4;
/**
 * Die Klasse erstellt einen Bruch und rechnet mit Brüchen
 * @author Linus Benedikt Dehner
 * @version 06.11.2017
 */
public class Bruchzahl {
	private int zaehler;
	private int nenner;
	/**
	 * Dies ist der Standardkonstruktor, welcher den Nenner auf 1 setzt und den Zähler auf 0, da man nicht durch 0 teilen kann
	 */
	public Bruchzahl() {
		int n = 1, z = 0;
		this.setNenner(n);
		this.setZaehler(z);
	}
	/**
	 * Dieser Konstruktor setzt den Zähler und Nenner auf benutzerdefinierte Zahlen
	 * @param z holt den Zähler aus der Test Klasse
	 * @param n holt sich den Nenner aus der Test Klasse
	 */
	public Bruchzahl(int z, int n) {
		this.setZaehler(z);
		this.setNenner(n);
	}
	/**
	 * Setzt den Zähler auf den geänderten Zähler
	 * @param z holt den Zähler vom Konstruktor
	 */
	public void setZaehler(int z) {
		this.zaehler = z;
	}
	/**
	 * Setzt den Nenner auf den geänderten Nenner
	 * @param n holt den Nenner aus dem Konstruktor
	 */
	public void setNenner(int n) {
		if(n<=0) {
			n=1;
		}
		this.nenner = n;
	}
	/**
	 * Gibt den Zähler zurück
	 * @return den Zähler
	 */
	public int getZaehler() {
		return this.zaehler;
	}
	/**
	 * Gibt den Nenner zurück
	 * @return den Nenner
	 */
	public int getNenner() {
		return this.nenner;
	}
	/**
	 * Erstellt ein optisches Bild des Bruches
	 * @return den Text des optischen Bilds
	 */
	public String textForm() {
		
		String s = this.zaehler + "\n---\n"+this.nenner;
		return s;
	}
	/**
	 * Rechnet den Dezimal Wert des Bruches aus
	 * @return den Dezimalwert des Bruches
	 */
	public double dezimalWert() {
		double d = (double)this.zaehler / this.nenner;
		return d;
	}
	/**
	 * Erweitert (multipliziert) den Bruch mit einer benutzerdefinierten zahl
	 * @param z holt sich den Multiplikator aus der Test Klasse
	 */
	public void erweitern (int z) {
		this.zaehler = this.zaehler*z;
		this.nenner = this.nenner*z;
	}
	/**
	 * Kürzt den Bruch mit Hilfe des GGT's
	 */
	public void kuerzen() {
		int k = Bruchzahl.ggT(this.zaehler,this.nenner);
		this.zaehler = this.zaehler/k;
		this.nenner = this.nenner/k;
	}
	/**
	 * Rechnet den GGT aus
	 * @param z holt sich den Zähler aus der Klassenmethode kuerzen
	 * @param n holt sich den Nenner aus der Klassenmethode kuerzen
	 * @return den größten gemeinsamen Teiler
	 */
	public static int ggT(int z, int n) {
		int r1;
		int r;
		int e;
		int l;
		do {
			if(z>=n) {
				l = n;
				e = z/n;
				r = z%n;
				z = n;
				n = r;	
			}
			else {
				l = z;
				e = n/z;
				r = n%z;
				n = z;
				z = r;
			}
		}while(r != 0);
		return l;
	}
	/**
	 * Überprüft ob 2 Brüche übereinstimmen
	 * @param z holt sich den 2. Bruch aus der Testklasse
	 * @return ob die Brüche übereinstimmen
	 */
	public boolean equals (Bruchzahl z) {
		boolean ergebnis = false;
		if ((z.getZaehler() == this.zaehler) && (z.getNenner() == this.nenner)) {
			ergebnis = true;
		}
		return ergebnis;
	}
	/**
	 * Multipliziert 2 Brüche miteinander und kürzt sie danach
	 * @param z holt sich den 2. Bruch aus der Test Klasse
	 * @return Den neu entstandenen Bruch
	 */
	public Bruchzahl multipliziere(Bruchzahl z) {
		Bruchzahl ergebnis = new Bruchzahl();
		ergebnis.setZaehler(this.zaehler * z.getZaehler());
		ergebnis.setNenner(this.nenner * z.getNenner());
		int k = Bruchzahl.ggT(ergebnis.getZaehler(),ergebnis.getNenner());
		ergebnis.setZaehler(ergebnis.getZaehler()/k);
		ergebnis.setNenner(ergebnis.getNenner()/k);
		return ergebnis;
	}
	/**
	 * Setzt 2 Brüche auf den Selben Nenner und addiert sie, danach wird das Ergebnis gekürzt
	 * @param z holt sich den 2. Bruch aus der Test Klasse
	 * @return
	 */
	public Bruchzahl addieren(Bruchzahl z) {
		Bruchzahl neuerBruch = new Bruchzahl();
		if(this.nenner!=z.getNenner()) {
			int newnenner = this.nenner*z.getNenner();
			int newzaehler1 = this.zaehler*z.getNenner();
			int newzaehler2 = z.getZaehler()*this.nenner;
			int gesamtzaehler = newzaehler1+newzaehler2;
			neuerBruch.setNenner(newnenner);
			neuerBruch.setZaehler(gesamtzaehler);	
			
		}else {
			int newnenner = this.nenner;
			int gesamtzaehler = this.zaehler+z.getZaehler();
			neuerBruch.setNenner(newnenner);
			neuerBruch.setZaehler(gesamtzaehler);
		}
		int k = Bruchzahl.ggT(neuerBruch.getZaehler(),neuerBruch.getNenner());
		neuerBruch.setZaehler(neuerBruch.getZaehler()/k);
		neuerBruch.setNenner(neuerBruch.getNenner()/k);
		return neuerBruch;
	}
	/**
	 * Bringt 2 Brüche auf den selben Nenner und subtrahiert sie, danach werden Sie gekürzt
	 * @param z holt sich den 2. Bruch aus der Test Klasse
	 * @return
	 */
	public Bruchzahl subtrahieren(Bruchzahl z) {
		Bruchzahl neuerBruch = new Bruchzahl();
		if(this.nenner!=z.getNenner()) {
			int newnenner = this.nenner*z.getNenner();
			int newzaehler1 = this.zaehler*z.getNenner();
			int newzaehler2 = z.getZaehler()*this.nenner;
			int gesamtzaehler = newzaehler1-newzaehler2;
			neuerBruch.setNenner(newnenner);
			neuerBruch.setZaehler(gesamtzaehler);	
			
		}else {
			int newnenner = this.nenner;
			int gesamtzaehler = this.zaehler-z.getZaehler();
			neuerBruch.setNenner(newnenner);
			neuerBruch.setZaehler(gesamtzaehler);
		}
		int k = Bruchzahl.ggT(neuerBruch.getZaehler(),neuerBruch.getNenner());
		neuerBruch.setZaehler(neuerBruch.getZaehler()/k);
		neuerBruch.setNenner(neuerBruch.getNenner()/k);
		return neuerBruch;
	}
	/**
	 * Zuerst wird der 2. Bruch in den Kehrwert von sich selbst umgewandelt
	 * danach werden die Brüche multipliziert und gekürzt
	 * @param z holt sich den 2. Bruch aus der Test Klasse
	 * @return
	 */
	public Bruchzahl dividieren(Bruchzahl z) {
		Bruchzahl neuerBruch = new Bruchzahl();
		z = invertieren(z);
		neuerBruch.setNenner(this.nenner*z.getNenner());
		neuerBruch.setZaehler(this.zaehler*z.getZaehler());
		int k = Bruchzahl.ggT(neuerBruch.getZaehler(),neuerBruch.getNenner());
		neuerBruch.setZaehler(neuerBruch.getZaehler()/k);
		neuerBruch.setNenner(neuerBruch.getNenner()/k);
		return neuerBruch;
	}
	/**
	 * Dreht einen Bruch um
	 * @param z holt sich den Bruch aus der Test Klasse
	 * @return den umgedrehten Bruch
	 */
	public Bruchzahl invertieren(Bruchzahl z) {
		int nenner = z.getNenner();
		z.setNenner(z.getZaehler());
		z.setZaehler(nenner);
		return z;
	}
	/**
	 * Dreht einen Bruch um
	 * @param z holt sich den Bruch aus der Test Klasse
	 * @return den umgedrehten Bruch
	 */
	public static Bruchzahl umdrehen(Bruchzahl z) {
		Bruchzahl n = new Bruchzahl(z.getNenner(), z.getZaehler());
		return n;
		
	}
}
