package g_5_3_1;

public class Punkt2D {
	private double x;
	private double y;
	
	public Punkt2D() {
		this.x = 0;
		this.y = 0;
	}
	public Punkt2D(double x, double y) {
		this.setX(x);
		this.setY(y);
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public String textDaten() {
		String x = "( "+getX()+" / "+getY()+" )";
		return x;
	}
	public double abstandNull() {
		double x = this.x;
		double x2 = x*x;
		double y = this.y;
		double y2 = y*y;
		return Math.sqrt(x2+y2);
		
	}
	
	public double abstand(double x, double y) {
		double ax;
		double ay;
		if(x<getX()) {
			ax = getX() - x;
		}
		else {
			ax = 0;
		}
		if(y<getY()) {
			ay = getY() - y;
		}
		else {
			ay = 0;
		}
		return Math.sqrt(ax*ax+ay*ay);
	}
	
	public boolean equals(Punkt2D punkt) {
		boolean xB = this.x == punkt.x;
		boolean yB = this.y == punkt.y;
		return xB && yB;
	}
	public static double abstand(double pX1, double pY1, double pX2, double pY2) {
		double ax;
		double ay;
		if(pX2<pX1) {
			ax = pX1-pX2;
		}
		else {
			if(pX1<pX2) {
				ax = pX2-pX1;
			}
			else {
				ax = 0;
			}
		}
		if(pY2<pY1) {
			ay = pY1-pY2;
		}
		else {
			if(pY1<pY2) {
				ay = pY2-pY1;
			}
			else {
				ay = 0;
			}
		}
		return Math.sqrt(ax*ax+ay*ay);
	}
}
