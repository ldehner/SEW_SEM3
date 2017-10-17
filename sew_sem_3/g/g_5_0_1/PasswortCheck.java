package g_5_0_1;
/**
 * Das Programm checkt ob das Passwort g�ltig ist
 * @author Linus Benedikt Dehner
 * @version 13.09.2017
 */
public class PasswortCheck {
	/**
	 * Die Methode �berpr�ft ob ein Char ein Buchstabe oder eine Zahl ist
	 * @param zeichen
	 * @return Ob es true ist 
	 */
	public static boolean istZeichenGueltig (char zeichen) {
		return Character.isLetterOrDigit(zeichen);
	}
	/**
	 * Die Methode �berpr�ft mit hilfe einer anderen Methode ob das Passwort g�ltig ist
	 * @param eingabe �bergibt den aktuellen Char
	 * @return ob das Passwort g�ltig ist
	 */
	public static boolean istPasswortGueltig (String eingabe) {
		boolean r�ckgabe = false;

		int lang;
		char zeichen;
		boolean methode;
		lang = eingabe.length();
		for(int i = 0; lang>i; i++) {
			zeichen = eingabe.charAt(i);
			methode = PasswortCheck.istZeichenGueltig(zeichen);
			if(methode==true) {
				r�ckgabe = true;
			}
			else {
				r�ckgabe = false;
				break;
			}
		}
		
		return r�ckgabe;
	}
}
