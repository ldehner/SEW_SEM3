package g_5_0_1;
/**
 * Das Programm checkt ob das Passwort gültig ist
 * @author Linus Benedikt Dehner
 * @version 13.09.2017
 */
public class PasswortCheck {
	/**
	 * Die Methode überprüft ob ein Char ein Buchstabe oder eine Zahl ist
	 * @param zeichen
	 * @return Ob es true ist 
	 */
	public static boolean istZeichenGueltig (char zeichen) {
		return Character.isLetterOrDigit(zeichen);
	}
	/**
	 * Die Methode überprüft mit hilfe einer anderen Methode ob das Passwort gültig ist
	 * @param eingabe übergibt den aktuellen Char
	 * @return ob das Passwort gültig ist
	 */
	public static boolean istPasswortGueltig (String eingabe) {
		boolean rückgabe = false;

		int lang;
		char zeichen;
		boolean methode;
		lang = eingabe.length();
		for(int i = 0; lang>i; i++) {
			zeichen = eingabe.charAt(i);
			methode = PasswortCheck.istZeichenGueltig(zeichen);
			if(methode==true) {
				rückgabe = true;
			}
			else {
				rückgabe = false;
				break;
			}
		}
		
		return rückgabe;
	}
}
