package g_5_1_5;

import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 * Das Programm ließt eine Zahl und einen Operator ein und rechnet mit der Zufallszahl
 * von der anderen Methoden und lässt den Benutzer rechnen und überprüft diese Rechnung
 * @author Linus Benedikt Dehner
 * @version 20.09.2017
 */
public class Main {

	public static void main(String[] args) {
		try {
			String f;
			String ja = "ja";
			Scanner s = new Scanner(System.in);
			String zahl1;
			String operator;
			String denken;
			int denk;
			int ergebnis;
			int positiv = 0;
			int negativ = 0;
			int zahl10;
			int zahl20;
			do {
			
				System.out.println("Geben Sie Bitte eine Zahl ein");
				zahl1 = s.nextLine();
				System.out.println("Geben Sie Bitte einen Operator ein ein");
				operator = s.nextLine();
				ergebnis = 1;
				zahl10 = Integer.parseInt(zahl1);
				zahl20 = Zufallszahlen.zufall(zahl10);
				switch (operator) {
				case "+":
					ergebnis = zahl10+zahl20;
					System.out.println("Was denken Sie kommt raus bei "+zahl10+" + "+zahl20+" ?");
					break;
				case "-":
					ergebnis = zahl10-zahl20;
					System.out.println("Was denken Sie kommt raus bei "+zahl10+" - "+zahl20+" ?");
					break;
				case "*":
					ergebnis = zahl10*zahl20;
					System.out.println("Was denken Sie kommt raus bei "+zahl10+" * "+zahl20+" ?");
					break;
				case "/":
					ergebnis = zahl10/zahl20;
					System.out.println("Was denken Sie kommt raus bei "+zahl10+" / "+zahl20+" ?");
				}
				denken = s.nextLine();
				denk = Integer.parseInt(denken);
				System.out.println("Das Ergebnis ist: "+ergebnis);
				if(denk == ergebnis) {
					System.out.println("Sie lagen richtig!");
					positiv++;
				}
				else {
					System.out.println("Sie lagen NICHT richtig!");
					negativ++;
				}
				System.out.println("Sie lagen "+positiv+" mal richtig!\nSie lagen "+negativ+" mal nicht richtig!");
				System.out.println("Möchten Sie nochmal?\nFür nochmal [ja]\nWenn Sie nicht wollen [nein]");
				f = s.nextLine();
			
			
			}while (f.equals(ja));
			s.close();
		}
		catch(Exception v) {
			System.out.println("Eingabe nicht Gültig");
		}
	}
}
