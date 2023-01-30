package org.lessons.java2;

public class Prodotto {

	private int codice;
	String nome;
	String marca;
	int prezzo;
    int iva;
	
	
	public Prodotto(int codice, String nome, String marca, int prezzo, int iva) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
	}
	
	public int getCodice() {
		return codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (this.nome != "") {
			this.nome = nome;
		}
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (this.marca != "") {
			this.marca = marca;
		}
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		
		if (this.prezzo > 0) {
			this.prezzo = prezzo;
		}
		
	}

	public int getIva() {
		return iva;
	}

	double prezzoSenzaIva () {
		return this.prezzo;
	}
	double prezzoConIva() {
		return (this.prezzo * this.iva) /2;
	}
	
}