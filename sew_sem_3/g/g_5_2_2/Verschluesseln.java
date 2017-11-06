package g_5_2_2;
/**
 * Ver und Entschlüsselt ein wort
 * @author Linus Benedikt Dehner
 * @version 06.11.2017
 */
public class Verschluesseln {
private int key;

	/**
	 * Standardkonstruktor setzt key auf 3
	 */
	public Verschluesseln() {
		this.key = 3;
	}
	/**
	 * Setzt den key auf den benutzerdefinierten wert
	 * @param key holt den wert aus der Testklasse
	 */
	public Verschluesseln(int key) {
		if(key>=1&&key<=25) {
			this.setKey(key);
			
		}
	}
	/**
	 * Setzt den key auf den benutzerdefinierten wert
	 * @param buch holt den Buchstaben aus der Testklasse
	 */
	public Verschluesseln(char buch) {
		this.setKey(buch);
	}	
	/**
	 * Setzt den Key auf den Wert
	 * @param key holt sich den Key aus dem Konstruktor
	 */
	public void setKey(int key) {
		if(key>=1&&key<=25) {
		}
	}
	/**
	 * Gibt 0 zurück
	 * @return i
	 */
	public int getKey() {
		int i = 0;
		
		return i;
	}
	/**
	 * Setzt den Key auf den Wert
	 * @param buch holt sich den Key aus dem Konstruktor
	 */
	public void setKey(char buch) {
		this.key = buch - 'A';
		this.setKey(this.key);
	}

	/**
	 * Verschlüsselt die Eingabe
	 * @param eingabe Die Eingabe wird aus dem Programm der Methode übergeben
	 * @param buchstabe Die Buchstaben verschiebung wird aus dem Programm übergeben
	 * @return Gibt das verschlüsselte Passwort zurück
	 */
	public String verschluesseln(String eingabe) {
		int plus = this.key;
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
	 * Entschlüsselt die Eingabe
	 * @param eingabe Die Eingabe wird aus dem Programm der Methode übergeben
	 * @param buchstabe Die Buchstaben verschiebung wird aus dem Programm übergeben
	 * @return Gibt das entschlüsselte Passwort zurück
	 */
	public String entschluesseln(String eingabe) {
		int plus = this.key;
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
