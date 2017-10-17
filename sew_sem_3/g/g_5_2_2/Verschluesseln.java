package g_5_2_2;

public class Verschluesseln {
private int key;

	
	public Verschluesseln() {
		this.key = 3;
	}
	
	public Verschluesseln(int key) {
		if(key>=1&&key<=25) {
			this.setKey(key);
			
		}
	}

	public Verschluesseln(char buch) {
		this.setKey(buch);
	}	
	public void setKey(int key) {
		if(key>=1&&key<=25) {
		}
	}
	public int getKey() {
		int i = 0;
		
		return i;
	}
	public void setKey(char buch) {
		this.key = buch - 'A';
		this.setKey(this.key);
	}

	/**
	 * 
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
	 * 
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
