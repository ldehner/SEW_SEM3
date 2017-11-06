package g_5_3_1;

import javax.swing.JOptionPane;
/**
 * Testet mit Hilfe der Klasse Punkt2D Dinge mit Punkten
 * @author Linus Benedikt Dehner
 * @version 06.11.2017
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie die 1. X Koordinate ein"));
		double y = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie die 1. Y Koordinate ein"));
		Punkt2D p = new Punkt2D(x,y);
		System.out.println(p.textDaten());
		System.out.println(p.abstandNull());
		Punkt2D punkt = new Punkt2D();
		System.out.println(p.equals(punkt));
		System.out.println(p.abstand(punkt));
		System.out.println(Punkt2D.abstand(p,punkt));
		
	}

}
