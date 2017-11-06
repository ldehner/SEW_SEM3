package g_5_3_3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bruchzahl zahl = new Bruchzahl();
		Scanner s = new Scanner(System.in);
		System.out.println("Geben Sie bitte den 1. Zähler ein!");
		int z1 = Integer.parseInt( s.nextLine());
		System.out.println("Geben Sie bitte den 1. Nenner ein!");
		int n1 = Integer.parseInt( s.nextLine());
		System.out.println("Geben Sie bitte den 2. Zähler ein!");
		int z2 = Integer.parseInt( s.nextLine());
		System.out.println("Geben Sie bitte den 2. Nenner ein!");
		int n2 = Integer.parseInt( s.nextLine());
		Bruchzahl zahl1 = new Bruchzahl(z1,n1);
		Bruchzahl zahl2 = new Bruchzahl(z2,n2);
		zahl1.kuerzen();
		System.out.println(zahl1.textForm());
	}

}
