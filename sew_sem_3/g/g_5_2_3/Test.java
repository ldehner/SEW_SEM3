package g_5_2_3;
/**
 * errechnet Daten eines Benutzerdefinierten Kegels mit Hilfe der Klasse Kegel
 * @author Linus Benedikt Dehner
 * @version 06.11.2017
 */
public class Test {
	public static void main(String[] args) {
		Kegel  k = new Kegel(16.0, 50.0);
		System.out.println(k.gesamtInfo());
	}
}
