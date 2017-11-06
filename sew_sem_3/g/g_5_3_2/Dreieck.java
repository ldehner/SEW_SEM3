package g_5_3_2;
import g_5_3_1.Punkt2D;
public class Dreieck {
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private double x3;
	private double y3;
	private double x12;
	private double y12;
	private double x22;
	private double y22;
	private double x32;
	private double y32;
	private double u;
	public Dreieck(){
		
	}
	public Dreieck(double x1,double y1, double x2, double y2, double x3, double y3,double x12,double y12, double x22, double y22, double x32, double y32){
		this.setX1(x1);
		this.setY1(y1);
		this.setX2(x2);
		this.setY2(y2);
		this.setX3(x3);
		this.setY3(y3);
		this.setX12(x12);
		this.setY2(y12);
		this.setX22(x22);
		this.setY22(y22);
		this.setX32(x32);
		this.setY32(y32);
	}
	public void setX1(double x) {
		this.x1 = x;
	}
	public void setY1(double y) {
		this.y1 = y;
	}
	public double getX1() {
		return this.x1;
	}
	public double getY1() {
		return this.y1;
	}
	public void setX2(double x) {
		this.x2 = x;
	}
	public void setY2(double y) {
		this.y2 = y;
	}
	public double getX2() {
		return this.x2;
	}
	public double getY2() {
		return this.y2;
	}
	public void setX3(double x) {
		this.x3 = x;
	}
	public void setY3(double y) {
		this.y3 = y;
	}
	public double getX3() {
		return this.x3;
	}
	public double getY3() {
		return this.y3;
	}
	public void setX12(double x) {
		this.x12 = x;
	}
	public void setY12(double y) {
		this.y12 = y;
	}
	public double getX12() {
		return this.x12;
	}
	public double getY12() {
		return this.y12;
	}
	public void setX22(double x) {
		this.x22 = x;
	}
	public void setY22(double y) {
		this.y22 = y;
	}
	public double getX22() {
		return this.x22;
	}
	public double getY22() {
		return this.y22;
	}
	public void setX32(double x) {
		this.x32 = x;
	}
	public void setY32(double y) {
		this.y32 = y;
	}
	public double getX32() {
		return this.x3;
	}
	public double getY32() {
		return this.y3;
	}
	public double umfang() {
		double ab1 = Punkt2D.abstand(x1, y1, x2, y2);
		double ab2 = Punkt2D.abstand(x2, y2, x3, y3);
		double ab3 = Punkt2D.abstand(x3, y3, x1, y1);
		this.u = ab1+ab2+ab3;
		return this.u;
	}
}
