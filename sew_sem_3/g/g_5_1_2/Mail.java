package g_5_1_2;
import javax.swing.*;
/**
 * Das Programm ließt Informationen ein, schickt diese an das andere Programm und bekommt andere Infos zurück
 * @author Linus Benedikt Dehner
 * @version 19.09.2017
 */
public class Mail {
	public static void main(String[] args) {
		String eingabe = JOptionPane.showInputDialog("Geben Sie ihr E-Mail Adresse ein.");
		int zahl = Integer.parseInt(JOptionPane.showInputDialog("Welche Domain wollen Sie haben?"));
		String output = EmailAnalyse.holeBenutzer(eingabe);
		String outputEins = EmailAnalyse.holeDomain(eingabe);
		String domain = EmailAnalyse.holeDomainEbene(outputEins, zahl);
		JOptionPane.showMessageDialog(null, "Benutzername: "+output+ "\n Domain: "+outputEins+ "\n Ausgewählte Domain: "+domain);
	}
}
