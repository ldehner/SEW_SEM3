  package g_5_1_5;

import java.util.Random;

/**
 * 
 * @author Linus Benedikt Dehner
 * @version 20.09.2017
 */
public class Zufallszahlen {
	/**
	 * Die Methode generiert mit Hilfe der letzten zufall Methode eine Zufallszahl zwischen 1 und 10
	 * @return die Zufallszahl
	 */
	public static int zufall () {
		int b = Zufallszahlen.zufall(1, 10);
		return b;
	}
	/**
	 * Die Methode generiert mit Hilfe der letzten zufall Methode eine Zufallszahl zwischen 1 und c
	 * @param c die vom Benutzer eingegebene Höchstzahl
	 * @return die Zufallszahl
	 */
	public static int zufall(int c) {
		int b = Zufallszahlen.zufall(1, c);
		return b;
	}
	/**
	 * Die Methode generiert mit Hilfe der letzten zufall Methode eine Zufallszahl zwischen min und max
	 * @param min bekommt die min von der 2. Methode und setzt sie als minimale Zahl
	 * @param max bekommt die max von der 2. Methode und setzt sie als maximale Zahl
	 * @return die Zufallszahl
	 */
	public static int zufall(int min, int max) {
		
		if (min > 0 && max > 0) {
			Random r = new Random();
			int b = r.nextInt(max-min)+min;
			return b;
		}
			return 0;
		
		
	}
}
