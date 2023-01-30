package org.lessons.java2;

public class Telefoni extends Prodotto {

	int codiceImei;

	int memoria;

	public Telefoni(int codice, String nome, String marca, int prezzo, int iva, int codiceImei, int memoria) {
		super(codice, nome, marca, prezzo, iva);
		this.codiceImei = codiceImei;
		this.memoria = memoria;
	}
	

}
