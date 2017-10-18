package schueler2;

import staticHamster.StaticHamster;

public class Round0 {
	static void vor(int n) {
		for (int i=0;i<n;i++)
			StaticHamster.vor();
	}
	
	static void nimm(int n) {
		for (int i=0;i<n;i++)
			StaticHamster.nimm();
	}

	static void rechtsUm() {
		for (int i=0;i<3;i++)
			StaticHamster.linksUm();
	}

	static void retour() {
		for (int i=0;i<2;i++)
			StaticHamster.linksUm();
	}
	
	public static void spielen(boolean spielerA, String gegner) {
	   //System.out.println("Schüler2: Beginn");
		vor(8);
		StaticHamster.linksUm();
		vor(3);
		nimm(5);
		vor(2);
		StaticHamster.linksUm();
		vor(2);
		nimm(5);
		vor(2);
		StaticHamster.linksUm();
		vor(2);
		nimm(5);
	   //System.out.println("Schüler2: Ende");
	}

}
