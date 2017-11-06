package g_5_3_3;

public class Bruchzahl {
	private int zaehler;
	private int nenner;

	public Bruchzahl() {
		int n = 0, z = 0;
		this.setNenner(n);
		this.setZaehler(z);
	}
	public Bruchzahl(int z, int n) {
		this.setZaehler(z);
		this.setNenner(n);
	}
	public void setZaehler(int z) {
		this.zaehler = z;
	}
	public void setNenner(int n) {
		if(n<=0) {
			n=1;
		}
		this.nenner = n;
	}
	public int getZaehler() {
		return this.zaehler;
	}
	public int getNenner() {
		return this.nenner;
	}
	public String textForm() {
		
		String s = this.zaehler + "\n---\n"+this.nenner;
		return s;
	}
	public double dezimalWert() {
		double d = (double)this.zaehler / this.nenner;
		return d;
	}
	public void erweitern (int z) {
		this.zaehler = this.zaehler*z;
		this.nenner = this.nenner*z;
	}
	public void kuerzen() {
		int k = Bruchzahl.ggT(this.zaehler,this.nenner);
		this.zaehler = this.zaehler/k;
		this.nenner = this.nenner/k;
	}
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
	public boolean equals (Bruchzahl z) {
		boolean ergebnis = false;
		if ((z.getZaehler() == this.zaehler) && (z.getNenner() == this.nenner)) {
			ergebnis = true;
		}
		return ergebnis;
	}
	public Bruchzahl multipliziere(Bruchzahl z) {
		Bruchzahl ergebnis = new Bruchzahl();
		ergebnis.setZaehler(this.zaehler * z.getZaehler());
		ergebnis.setNenner(this.nenner * z.getNenner());
		return ergebnis;
	}
	
}