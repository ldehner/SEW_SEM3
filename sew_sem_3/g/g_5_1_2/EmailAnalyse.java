package g_5_1_2;
/**
 * Das Programm enthält methoden welche einem anderen Programm helfen
 * @author Linus Benedikt Dehner
 * @version 19.09.2017
 */
public class EmailAnalyse {
	/**
	 * In dieser Methode wird der Benutzerteil der E-Mail Adresse getrennt und zurückgegeben
	 * @param eingabe Die Eingabe aus der main
	 * @return Der abgetrennte Teil
	 */
	public static String holeBenutzer(String eingabe) {
		String output;
		int b;
		b = eingabe.indexOf ('@');
		output = eingabe.substring(0, b);
		return output;
	}
	/**
	 * Die Methode trennt die Domain der E-Mail Adresse ab
	 * @param eingabe Die Eingabe aus der main
	 * @return Der abgetrennte Teil der E-Mail Adresse
	 */
	public static String holeDomain(String eingabe) {
		String output;
		int b;
		b = eingabe.lastIndexOf('@');
		b = b+1;
		output = eingabe.substring(b, eingabe.length());
		return output;
	}
	/**
	 * Trennt die gewünschte Domain aus der E-Mail Adresse ab
	 * @param eingabe Die Domain von holeDomain
	 * @param zahl Die gewünschte Domain
	 * @return Die abgetrennte Level-Domain
	 */
	public static String holeDomainEbene(String eingabe, int zahl) {
		String email = EmailAnalyse.holeDomain(eingabe);
		String output = "";
		for (int v = zahl; v > 0; v--) {
			if (email.contains(".")) {
				output = email.substring(email.lastIndexOf('.') + 1, email.length());
				email = email.substring(0, email.lastIndexOf('.'));
			} else {
				output = email;
			}
		}
		return output;
	}
}
