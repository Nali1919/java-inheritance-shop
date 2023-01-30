package org.lessons.java2;

public class Televisori extends Prodotto {

	int pollici;
	boolean smart = true;

	public Televisori(String nome, String marca, int prezzo, int pollici, boolean smart) {
		super(nome, marca, prezzo);
		this.pollici = pollici;
		this.smart = smart;
	}

	public int getPollici() {
		return pollici;
	}

	public void setPollici(int pollici) {
		this.pollici = pollici;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

}
