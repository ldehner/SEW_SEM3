package g_5_2_3;

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
	public void setH(double h) {
		this.h = h;
	}
	public double getH() {
		return this.h;
	}
	public void setD(double d) {
		this.d = d;
	}
	public double getD() {
		return this.d;
	}
	public double radius() {
		double d = this.d;
		double r = d/2.0;
		this.r = r;
		return this.r;
	}

	public double grund() {
		
		return this.grund;
	}
	public double volumen() {
		double drittl = 1.0/3.0;
		this.volume = drittl*this.grund*this.h;
		return this.volume;
	}
	public double mantel() {
		
		return this.mantel;
	}
	public double ober() {
		this.grund = (radius()*radius())*Math.PI;
		double s = (radius()*radius())*(this.h*this.h);
		s = Math.pow(s, 0.5);
		this.mantel = Math.PI*radius()*s;
		this.ober = this.mantel+this.grund;
		return this.ober;
	}
	public String gesamtInfo() {
		String s = "Durchmesser: "+this.d+"\nRadius: "+radius()+"\nHöhe: "+this.h+"\nOberfläche: "+ober()+"\nVolumen:"+volumen();
		return s;	
	}
}
