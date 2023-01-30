package org.lessons.java2;

public class Cuffie extends Prodotto {

	 private String colore;
	 private boolean isWireless = true;

	public Cuffie(String nome, String marca, int prezzo, String colore, boolean isWireless) {
		super(nome, marca, prezzo);
		this.colore = colore;
		this.isWireless = isWireless;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isWireless() {
		return isWireless;
	}

	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}

	

}
