package String;

import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite neki string: ");
		String korisnikovUnos = unos.nextLine();

		StringMedote ispis = new StringMedote();

		ispis.setBezveze(korisnikovUnos);

		ispis.duzinaStringa();
		ispis.karakteriNaParnimPozicijama();
		ispis.karakteriNaNeparnimPozicijama();
		ispis.brojUppercaseKaraktera();
		ispis.brojLowercaseKaraktera();
		ispis.sviKojiNisuSlova();

		unos.close();
	}

}
