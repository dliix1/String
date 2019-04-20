package String;

public class StringMedote {

	String bezveze = new String();

	public String getBezveze() {
		return bezveze;
	}

	public void setBezveze(String bezveze) {
		this.bezveze = bezveze;
	}

	public void duzinaStringa() {

		System.out.println("Duzina stringa je: " + bezveze.length());

	}

	public void karakteriNaParnimPozicijama() {

		System.out.println("Karakteri na parnim pozicijama su: ");

		for (int i = 0; i < bezveze.length(); i++) {

			if (i % 2 == 0) {

				System.out.println(bezveze.charAt(i) + " ");

			}
		}
	}

	public void karakteriNaNeparnimPozicijama() {

		System.out.println("Karakteri na neparnim pozicijama su: ");

		for (int i = 0; i < bezveze.length(); i++) {

			if (i % 2 != 0) {

				System.out.println(bezveze.charAt(i) + " ");

			}
		}
	}

	public void brojUppercaseKaraktera() {

		int brojac = 0;

		for (int i = 0; i < bezveze.length(); i++) {

			if (Character.isUpperCase(bezveze.charAt(i))) {

				brojac++;

			}
		}

		if (brojac > 0) {
			System.out.println("Vas string ima " + brojac
					+ " uppercase karaktera.");
		} else {
			System.out.println("Vas string nema uppercase karaktera.");
		}
	}

	public void brojLowercaseKaraktera() {

		int brojac = 0;

		for (int i = 0; i < bezveze.length(); i++) {

			if (Character.isLowerCase(bezveze.charAt(i))) {

				brojac++;
			}
		}

		if (brojac > 0) {
			System.out.println("Vas string ima " + brojac
					+ " lowercase karaktera.");
		} else {
			System.out.println("Vas string nema lowercase karaktera.");
		}
	}

	public void sviKojiNisuSlova() {

		for (int i = 0; i < bezveze.length(); i++) {

			if (!Character.isAlphabetic(bezveze.charAt(i))
					&& Character.isWhitespace(bezveze.charAt(i))
					&& Character.isDigit(bezveze.charAt(i))) {

				System.out.println(bezveze.charAt(i) + " ");
			}
		}
	}

}
