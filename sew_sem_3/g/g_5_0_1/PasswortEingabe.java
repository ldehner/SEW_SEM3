package g_5_0_1;
import javax.swing.*;
/**
 * Das Programm �berpr�ft mit hilfe eines anderen programmes ob das passwort g�ltig und richtig ist
 * @author Linus Benedikt Dehner
 * @version 08.09.2017
 */
public class PasswortEingabe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String eingabe;
		String pw = "haha1234";
		boolean gueltig = false;
		
		do {
		eingabe = JOptionPane.showInputDialog("Geben Sie bitte ein g�ltiges Passwort ein!");
		gueltig = PasswortCheck.istPasswortGueltig(eingabe);
		}while(gueltig!=true);
	
			if(eingabe.equals(pw)) {
				JOptionPane.showMessageDialog(null,"Das Passwort stimmt �berein");
			}
			else {
				JOptionPane.showMessageDialog(null,"Das Passwort stimmt NICHT �berein");
			}
		}


}
