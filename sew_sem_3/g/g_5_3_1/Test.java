package g_5_3_1;

import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie die 1. X Koordinate ein"));
		double y = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie die 1. Y Koordinate ein"));
		double x1 = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie die 2. X Koordinate ein"));
		double y1 = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie die 2. Y Koordinate ein"));
		Punkt2D p = new Punkt2D(x,y);
		System.out.println(p.textDaten());
		System.out.println(p.abstandNull());
		Punkt2D punkt = new Punkt2D();
		System.out.println(p.equals(punkt));
		System.out.println(p.abstand(x, y));
		System.out.println(Punkt2D.abstand(x, y, x1, y1));
		
	}

}
