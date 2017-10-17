package g_5_1_3;

import javax.swing.JOptionPane;
/**
 * Das Programm Ent- und Verschlüsselt mit hilfe von externen Methoden
 * Auf verschiedene Weisen Wörter
 * @author Linus Benedikt Dehner
 * @version 15.09.2017
 */
public class TestKlasse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String multi = "1";
		String eingabe;
		String eing = "";
		String buchstabe = "";
		String caesar; 
		String benutzer = ""; 
		String alpha;
		String auswahl;
		String aus;
		String w;
		String bu;
		String wahl;
		char buch = 'a';
		w = JOptionPane.showInputDialog("Wollen Sie Ver- oder Entschlüsseln:\nFür Verschlüsseln"
				+ " geben Sie bitte [v] ein\nFür entschlüsseln geben Sie bitte [e] ein");
		wahl = w.toUpperCase();
		if(wahl.equals("V")) {
			aus = JOptionPane.showInputDialog("Mit welcher Methode wollen Sie ihr Wort verschlüsseln:\nFür die Caesar-Methode"
					+ " geben Sie bitte [a] ein\nFür die Benutzer definierte Methode geben Sie bitte"
					+ " [b] ein\nFür die Buchstaben Methode geben Sie bitte [c] ein");
			auswahl = aus.toUpperCase();


			if(auswahl.equals("A")) {
					eing = JOptionPane.showInputDialog("Bitte geben Sie ein Wort ein, welches Sie verschlüsseln wollen");
					eingabe = eing.toUpperCase();
					caesar = Verschluesselung.verschluesseln(eingabe);
					JOptionPane.showMessageDialog(null,"Ihr verschlüsseltes Wort:\n"+caesar);
			}
			if(auswahl.equals("B")) {		
					eing = JOptionPane.showInputDialog("Bitte geben Sie ein Wort ein, welches Sie verschlüsseln wollen");
					eingabe = eing.toUpperCase();
					multi = JOptionPane.showInputDialog("Bitte geben Sie den verschlüsselungs modus ein");
					benutzer = Verschluesselung.verschluesseln(eingabe, multi);
					JOptionPane.showMessageDialog(null,"Ihr verschlüsseltes Wort:\n"+benutzer);
			}
			if(auswahl.equals("C")) {
					eing = JOptionPane.showInputDialog("Bitte geben Sie ein Wort ein, welches Sie verschlüsseln wollen");
					eingabe = eing.toUpperCase();
					buchstabe = JOptionPane.showInputDialog("Geben Sie bitte einen Buchstaben ein der Das Aplphabet verändern soll");
					bu = buchstabe.toUpperCase();
					buch = bu.charAt(0);
					alpha = Verschluesselung.verschluesseln(eingabe, buch);
					JOptionPane.showMessageDialog(null,"Ihr verschlüsseltes Wort:\n"+alpha);
			}
			if(auswahl.equals("A") || auswahl.equals("C") || auswahl.equals("B")) {
					
				
			}
			else {
				JOptionPane.showMessageDialog(null,"Ungültige Eingabe");
			}
		}
		if(wahl.equals("E")) {
			aus = JOptionPane.showInputDialog("Mit welcher Methode wollen Sie ihr Wort entschlüsseln:\nFür die Caesar-Methode"
					+ " geben Sie bitte [a] ein\nFür die Benutzer definierte Methode geben Sie bitte"
					+ " [b] ein\nFür die Buchstaben Methode geben Sie bitte [c] ein");
			auswahl = aus.toUpperCase();


			if(auswahl.equals("A")) {
					eing = JOptionPane.showInputDialog("Bitte geben Sie ein Wort ein, welches Sie entschlüsseln wollen");
					eingabe = eing.toUpperCase();
					caesar = Verschluesselung.entschluesseln(eingabe);
					JOptionPane.showMessageDialog(null,"Ihr entschlüsseltes Wort:\n"+caesar);
			}
			if(auswahl.equals("B")) {		
					eing = JOptionPane.showInputDialog("Bitte geben Sie ein Wort ein, welches Sie entschlüsseln wollen");
					eingabe = eing.toUpperCase();
					multi = JOptionPane.showInputDialog("Bitte geben Sie den entschlüsselungs modus ein");
					benutzer = Verschluesselung.entschluesseln(eingabe, multi);
					JOptionPane.showMessageDialog(null,"Ihr entschlüsseltes Wort:\n"+benutzer);
			}
			if(auswahl.equals("C")) {
					eing = JOptionPane.showInputDialog("Bitte geben Sie ein Wort ein, welches Sie entschlüsseln wollen");
					eingabe = eing.toUpperCase();
					buchstabe = JOptionPane.showInputDialog("Geben Sie bitte einen Buchstaben ein der Das Aplphabet zurück ändern soll");
					bu = buchstabe.toUpperCase();
					buch = bu.charAt(0);
					alpha = Verschluesselung.entschluesseln(eingabe, buch);
					JOptionPane.showMessageDialog(null,"Ihr entschlüsseltes Wort:\n"+alpha);
			}
			if(auswahl.equals("A") || auswahl.equals("C") || auswahl.equals("B")) {
					
				
			}
			else {
				JOptionPane.showMessageDialog(null,"Ungültige Eingabe");
			}
		}
		
		if(wahl.equals("V") || wahl.equals("E")) {
		}
		else {
			JOptionPane.showMessageDialog(null,"Ungültige Eingabe");
		}
		}
}
