package g_5_2_2;
import javax.swing.JOptionPane;
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
		w = JOptionPane.showInputDialog("Wollen Sie Ver- oder Entschlüsseln:\nFür Verschlüsseln"
				+ " geben Sie bitte [v] ein\nFür entschlüsseln geben Sie bitte [e] ein");
		wahl = w.toUpperCase();
		if(wahl.equals("V")) {
			eing = JOptionPane.showInputDialog("Bitte geben Sie ein Wort ein, welches Sie verschlüsseln wollen");
			eingabe = eing.toUpperCase();
			buchstabe = JOptionPane.showInputDialog("Geben Sie bitte einen Buchstaben ein der Das Aplphabet verändern soll");
			bu = buchstabe.toUpperCase();
			buch = bu.charAt(0);
			
			Verschluesseln ver = new Verschluesseln(buch);
			
			
			JOptionPane.showMessageDialog(null,"Ihr verschlüsseltes Wort:\n"+ver.verschluesseln(eingabe));
			
		}
		if(wahl.equals("E")) {
			eing = JOptionPane.showInputDialog("Bitte geben Sie ein Wort ein, welches Sie entschlüsseln wollen");
			eingabe = eing.toUpperCase();
			buchstabe = JOptionPane.showInputDialog("Geben Sie bitte einen Buchstaben ein der Das Aplphabet zurück ändern soll");
			bu = buchstabe.toUpperCase();
			buch = bu.charAt(0);
			Verschluesseln ver = new Verschluesseln(buch);
			JOptionPane.showMessageDialog(null,"Ihr entschlüsseltes Wort:\n"+ver.entschluesseln(eingabe));

		}
		
		if(wahl.equals("V") || wahl.equals("E")) {
		}
		else {
			JOptionPane.showMessageDialog(null,"Ungültige Eingabe");
		}
		}
}
