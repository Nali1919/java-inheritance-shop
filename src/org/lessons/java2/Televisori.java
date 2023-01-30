package org.lessons.java2;

public class Televisori extends Prodotto {

	int pollici;
	boolean smart = true;

	public Televisori(int codice, String nome, String marca, int prezzo, int iva, int pollici, boolean smart) {
		super(codice, nome, marca, prezzo, iva);
		this.pollici = pollici;
		this.smart = smart;
	}

}
