package g_5_2_2;
import javax.swing.JOptionPane;
/**
 * Ve3r und entschl�sselt ein Wort mit Hilfe der Klasse Verschluesseln
 * @author Linus Benedikt Dehner
 * @version 06.11.2017
 */
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String eingabe;
		String eing = "";
		String buchstabe = "";

		String w;
		String bu;
		String wahl;
		char buch = 'a';
		w = JOptionPane.showInputDialog("Wollen Sie Ver- oder Entschl�sseln:\nF�r Verschl�sseln"
				+ " geben Sie bitte [v] ein\nF�r entschl�sseln geben Sie bitte [e] ein");
		wahl = w.toUpperCase();
		if(wahl.equals("V")) {
			eing = JOptionPane.showInputDialog("Bitte geben Sie ein Wort ein, welches Sie verschl�sseln wollen");
			eingabe = eing.toUpperCase();
			buchstabe = JOptionPane.showInputDialog("Geben Sie bitte einen Buchstaben ein der Das Aplphabet ver�ndern soll");
			bu = buchstabe.toUpperCase();
			buch = bu.charAt(0);
			
			Verschluesseln ver = new Verschluesseln(buch);
			
			
			JOptionPane.showMessageDialog(null,"Ihr verschl�sseltes Wort:\n"+ver.verschluesseln(eingabe));
			
		}
		if(wahl.equals("E")) {
			eing = JOptionPane.showInputDialog("Bitte geben Sie ein Wort ein, welches Sie entschl�sseln wollen");
			eingabe = eing.toUpperCase();
			buchstabe = JOptionPane.showInputDialog("Geben Sie bitte einen Buchstaben ein der Das Aplphabet zur�ck �ndern soll");
			bu = buchstabe.toUpperCase();
			buch = bu.charAt(0);
			Verschluesseln ver = new Verschluesseln(buch);
			JOptionPane.showMessageDialog(null,"Ihr entschl�sseltes Wort:\n"+ver.entschluesseln(eingabe));

		}
		
		if(wahl.equals("V") || wahl.equals("E")) {
		}
		else {
			JOptionPane.showMessageDialog(null,"Ung�ltige Eingabe");
		}
		}
}
