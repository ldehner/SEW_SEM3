package schueler1;

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
		vor(6);
		StaticHamster.linksUm();
		vor(5);
		nimm(5);
		StaticHamster.linksUm();
		vor(2);
		StaticHamster.linksUm();
		vor(2);
		nimm(5);
		StaticHamster.linksUm();
		vor(4);
		nimm(5);
	}

}
