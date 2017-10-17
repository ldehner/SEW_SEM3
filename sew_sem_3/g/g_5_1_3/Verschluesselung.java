package g_5_1_3;
/**
 * Das Programm enthält nur Methoden die einem externen Programm Wörter ver- und entschlüsseln
 * @author Linus Benedikt Dehner
 * @version 15.09.2017
 */
public class Verschluesselung {
	/**
	 * Die Methode verschlüsselt Wörter nach der Caesar Methode
	 * @param eingabe Die Eingabe wird aus dem Programm der Methode übergeben
	 * @return Gibt das verschlüsselte Passwort zurück
	 */
	public static String verschluesseln(String eingabe) {
		String satz = "";
		char c;
		char z;
		int lang = eingabe.length();
		for(int x = 0;x<lang;x++) {
			c = eingabe.charAt(x);
			int a = (int) c;
			if(a >= 87) {
				a -=23;
			}
			else {
				a +=3;
			}	
			z = (char) a;
			satz += z;
			
		}
		return satz;	
	}
	/**
	 * 
	 * @param eingabe Die Eingabe wird aus dem Programm der Methode übergeben
	 * @param multipli Die Stellenverschiebung wird aus dem Programm übergeben
	 * @return Gibt das verschlüsselte Passwort zurück
	 */
	public static String verschluesseln(String eingabe, String multipli) {
		int multi = Integer.parseInt(multipli);
		String satz = "";
		char c;
		char z;
		int q = 90 - multi;
		int b = 26 - multi;
		int lang = eingabe.length();
		for(int x = 0;x<lang;x++) {
			c = eingabe.charAt(x);
			int a = (int) c;
			if(a >= q) {
				a -= b;
			}
			else {
				a +=multi;
			}	
			z = (char) a;
			satz += z;
			
		}
		return satz;
	}
	/**
	 * 
	 * @param eingabe Die Eingabe wird aus dem Programm der Methode übergeben
	 * @param buchstabe Die Buchstaben verschiebung wird aus dem Programm übergeben
	 * @return Gibt das verschlüsselte Passwort zurück
	 */
	public static String verschluesseln(String eingabe, char buchstabe) {
		char a = 'A';
		int aa = (int)a;
		int buch = (int)buchstabe;
		int plus = buch - aa;
		int minus = 26 - plus;
		int grenze = 90 - plus;
		String satz = "";
		char c;
		char z;
		int lang = eingabe.length();
		for(int x = 0;x<lang;x++) {
			c = eingabe.charAt(x);
			int h = (int) c;
			if(h >= grenze) {
				h -= minus;
			}
			else {
				h +=plus;
			}	
			z = (char) h;
			satz += z;
			
		}
		return satz;	
	}
	
	
	
	/**
	 * 
	 * @param eingabe Die Eingabe wird aus dem Programm der Methode übergeben
	 * @return Gibt das entschlüsselte Passwort zurück
	 */
	public static String entschluesseln(String eingabe) {
		String satz = "";
		char c;
		char z;
		int lang = eingabe.length();
		for(int x = 0;x<lang;x++) {
			c = eingabe.charAt(x);
			int a = (int) c;
			if(a <= 67) {
				a += 23;
			}
			else {
				a -= 3;
			}	
			z = (char) a;
			satz += z;
			
		}
		return satz;
	}
	/**
	 * 
	 * @param eingabe Die Eingabe wird aus dem Programm der Methode übergeben
	 * @param multipli Die Stellenverschiebung wird aus dem Programm übergeben
	 * @return Gibt das entschlüsselte Passwort zurück
	 */
	public static String entschluesseln(String eingabe, String multipli) {
		int multi = Integer.parseInt(multipli);
		String satz = "";
		char c;
		char z;
		int q = 64 + multi;
		int b = 26 - multi;
		int lang = eingabe.length();
		for(int x = 0;x<lang;x++) {
			c = eingabe.charAt(x);
			int a = (int) c;
			if(a <= q) {
				a += b;
			}
			else {
				a -=multi;
			}	
			z = (char) a;
			satz += z;
			
		}
		return satz;
	}
	/**
	 * 
	 * @param eingabe Die Eingabe wird aus dem Programm der Methode übergeben
	 * @param buchstabe Die Buchstaben verschiebung wird aus dem Programm übergeben
	 * @return Gibt das entschlüsselte Passwort zurück
	 */
	public static String entschluesseln(String eingabe, char buchstabe) {
		char a = 'A';
		int aa = (int)a;
		int buch = (int)buchstabe;
		int plus = buch - aa;
		int minus = 26 - plus;
		int grenze = 64 + plus;
		String satz = "";
		char c;
		char z;
		int lang = eingabe.length();
		for(int x = 0;x<lang;x++) {
			c = eingabe.charAt(x);
			int h = (int) c;
			if(h <= grenze) {
				h += minus;
			}
			else {
				h -=plus;
			}	
			z = (char) h;
			satz += z;
			
		}
		return satz;
	}
}
