package org.lessons.java2;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		String scelta = "";

		int contatore = 0;

		int n = 10;

		Prodotto[] prodotti = new Prodotto[n];

		Scanner s = new Scanner(System.in);

		while (contatore <= n ) {

			System.out.println("Vuoi inserire un telefono, cuffie o televisori? ");

			scelta = s.nextLine();
			
			s.nextLine();

			if (scelta.equals("telefono")) {

				System.out.println("Inserisci nome");

				String nome = s.nextLine();

				System.out.println("Inserisci marca");

				String marca = s.nextLine();

				System.out.println("Inserisci prezzo");

				int prezzo = s.nextInt();

				System.out.println("Inserisci Imei");

				int imei = s.nextInt();

				System.out.println("Inserisci memoria");

				int memoria = s.nextInt();

				Telefoni telefono = new Telefoni(nome, marca, prezzo, imei, memoria);

				System.out.println("ecco il telefono" + telefono);

				contatore++;

			} else if (scelta.equals("cuffie")) {

				System.out.println("Inserisci nome");

				String nome = s.nextLine();

				System.out.println("Inserisci marca");

				String marca = s.nextLine();

				System.out.println("Inserisci prezzo");

				int prezzo = s.nextInt();

				System.out.println("Inserisci colore");

				String colore = s.nextLine();

				System.out.println("è wireless?");

				boolean b = s.nextBoolean();

				Cuffie c = new Cuffie(nome, marca, prezzo, colore, b);

				System.out.println("ecco il telefono" + c);

				contatore++;
			}

		}
		System.out.println("Prodotti:");
		for (int i = 0; i <= contatore; i++) {
			System.out.println(prodotti[i].toString()); // metodo da rivedere.
		}

		s.close();
	}

}
