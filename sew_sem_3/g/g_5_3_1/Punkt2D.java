package g_5_3_1;

public class Punkt2D {
	private int x;
	private int y;
	public Punkt2D() {
		this.x = 0;
		this.y = 0;
	}
	public Punkt2D(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String textDaten() {
		String x = "( "+this.x+" / "+this.y+" )";
		return x;
	}
	public double abstandNull() {
		return this.abstand(new Punkt2D());
	}
	
	public double abstand(Punkt2D punkt) {
		
	}
	
	public boolean equals(Punkt2D punkt) {
		boolean xB = this.x == punkt.x;
		boolean yB = this.y == punkt.y;
		return xB && yB;
	}
	
	public static double abstand(Punkt2D punkt1, Punkt2D punkt2) {
		return punkt1.abstand(punkt2);
	}
}
