package org.lessons.java2;

public class Cuffie extends Prodotto {

	String colore;
	boolean isWireless = true;

	public Cuffie(int codice, String nome, String marca, int prezzo, int iva, String colore, boolean isWireless) {
		super(codice, nome, marca, prezzo, iva);
		this.colore = colore;
		this.isWireless = isWireless;
	}

}
