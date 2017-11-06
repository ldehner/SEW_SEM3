package g_5_3_2;
import javax.swing.JOptionPane;

import g_5_3_1.Punkt2D;
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
		JOptionPane.showMessageDialog(null, "Die Daten für das 2. Dreieck:");
		int x4 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die 1. X Koordinate ein"));
		int y4 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die 1. Y Koordinate ein"));
		int x5 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die 2. X Koordinate ein"));
		int y5 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die 2. Y Koordinate ein"));
		int x6 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die 3. X Koordinate ein"));
		int y6 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die 3. Y Koordinate ein"));
		Dreieck d1 = new Dreieck(x1,y1,x2,y2,x3,y3,x4,y4,x5,y5,x6,y6);
	}

}
