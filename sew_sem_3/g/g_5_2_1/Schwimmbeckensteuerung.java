package g_5_2_1;

import javax.swing.JOptionPane;
/**
 * Das Programm errechnet mit Hilfe einer selbst erstellten Klasse
 * die Maße und Füllwerte eines Pools und "füllt" Wasser in den Pool
 * und "leert" ihn wieder
 * @author Linus Benedikt Dehner
 * @version 11.10.2017
 */
public class Schwimmbeckensteuerung {

	public static void main(String[] args) {
		Schwimmbecken s = new Schwimmbecken(1000,200,500);
		System.out.println(s.status());
	}

}
