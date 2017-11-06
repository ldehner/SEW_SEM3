package g_5_3_2;
import javax.swing.JOptionPane;
import g_5_3_1.Punkt2D;
/**
 * Das Programm macht mit Hilfe der Klassen Dreieck und Punkt2D viele Sachen mit 2 Dreiecken.
 * @author Linus Benedikt Dehner
 * @version 06.11.2017
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Die Daten für das 1. Dreieck:");
		int x1 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die 1. X Koordinate ein"));
		int y1 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die 1. Y Koordinate ein"));
		int x2 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die 2. X Koordinate ein"));
		int y2 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die 2. Y Koordinate ein"));
		int x3 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die 3. X Koordinate ein"));
		int y3 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die 3. Y Koordinate ein"));
		Dreieck d1 = new Dreieck(x1,y1,x2,y2,x3,y3);
		Dreieck d2 = new Dreieck();
		System.out.println(d1.Daten());
		System.out.println(d2.Daten());
		System.out.println("Der Umfang beträgt: "+d1.umfang());
		System.out.println("Die Dreiecke stimmen Überein: "+d1.equals(d2));
	}

}
