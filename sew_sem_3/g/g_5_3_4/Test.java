package g_5_3_4;

import java.util.Scanner;
/**
 * Das Programm erstellt Brüche und rechnet und  mit Hilfe einer Klasse mit Brüchen
 * @author Linus Benedikt Dehner
 * @version 06.11.2017
 */
public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		System.out.println("Geben Sie eimen fixen Bruch an:");
		System.out.println("Geben Sie bitte den 1. Zähler ein!");
		int z1 = Integer.parseInt( s.nextLine());
		System.out.println("Geben Sie bitte den 1. Nenner ein!");
		int n1 = Integer.parseInt( s.nextLine());
		Bruchzahl b = new Bruchzahl(z1,n1);
		System.out.println("Ihr Bruch:\n\n"+b.textForm()+"\n\n");
		System.out.println("Ihr Bruch in Dezimalform:\n\n"+b.dezimalWert()+"\n\n");
		System.out.println("Geben Sie eine Zahl zum erweitern ihres Bruches an:");
		int e = Integer.parseInt( s.nextLine());
		b.erweitern(e);
		System.out.println("Ihr Bruch erweitert:\n\n"+b.textForm()+"\n\n");
		b.kuerzen();
		System.out.println("Ihr Bruch gekürzt:\n\n"+b.textForm()+"\n\n");
		System.out.println("Geben Sie eimen Bruch an, mit dem gerechnet werden soll:");
		System.out.println("Geben Sie bitte den 2. Zähler ein!");
		int z2 = Integer.parseInt( s.nextLine());
		System.out.println("Geben Sie bitte den 2. Nenner ein!");
		int n2 = Integer.parseInt( s.nextLine());
		Bruchzahl z = new Bruchzahl(z2,n2);
		System.out.println("Addition:\n\n"+b.addieren(z).textForm()+"\n\n");
		System.out.println("Subtraktion:\n\n"+b.subtrahieren(z).textForm()+"\n\n");
		System.out.println("Multiplikation:\n\n"+b.multipliziere(z).textForm()+"\n\n");
		System.out.println("Division:\n\n"+b.dividieren(z).textForm()+"\n\n");
		System.out.println("Invertiert:\n\n"+b.invertieren(b).textForm()+"\n\n");	
		System.out.println("Umgedreht:\n\n"+Bruchzahl.umdrehen(b));
		s.close();
	}
}
