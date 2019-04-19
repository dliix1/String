package String;

public class StringMedote {

	public void min(int[] niz) {

		int minimalni = niz[0];

		for (int i = 0; i < niz.length; i++) {

			if (niz[i] < minimalni) {
				minimalni = niz[i];
			}
		}
		System.out.println("Najmanji element u nizu je: " + minimalni);
	}

	public void max(int[] niz) {
		int maksimalni = niz[0];
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] > maksimalni) {
				maksimalni = niz[i];
			}
		}
		System.out.println("Najveci element u nizu je: " + maksimalni);
	}

	public void zbirNiza(int[] niz) {

		int zbir = niz[0];
		for (int i = 0; i < niz.length; i++) {

			zbir += niz[i];

		}

		System.out.println("Zbir brojeva u nizu je: " + zbir);
	}

	public void prosjekBrojeva(int[] niz) {

		int prosjek = 0;
		int zbir = 0;
		int brojac = 0;

		for (int i = 0; i < niz.length; i++) {

			zbir += niz[i];
			brojac++;
			prosjek = zbir / brojac;

		}

		System.out.println("Prosjek brojeva u nizu je: " + prosjek);
	}

	public void sortiraniNiz(int[] niz) {

		java.util.Arrays.parallelSort(niz);
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
	}
}
