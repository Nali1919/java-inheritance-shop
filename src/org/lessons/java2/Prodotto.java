package org.lessons.java2;

import java.util.Random;

public class Prodotto {

	private int codice;
	private String nome;
	private String marca;
	private int prezzo;
	double iva;
	Random n = new Random();
	private static int itemsNumber=0;
 

	public Prodotto(String nome, String marca, int prezzo) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.codice = n.nextInt(1000);
	}
	
	
	public int getCodice() {
		return this.codice ;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (this.nome != "") {
			this.nome = nome;
		}else {
			System.out.println("non puoi");
		}

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (this.marca != "") {
			this.marca = marca;
		}else {
			System.out.println("Non puoi");
		}
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {

		if (this.prezzo > 0) {
			this.prezzo = prezzo;
		}else {
			System.out.println("non puoi");
		}

	}

	public double getIva() {
		return this.iva;
	}
	

	public void setIva(double iva) {
		this.iva = iva;
	}

	double prezzoSenzaIva() {
		return this.prezzo;
	}

	double prezzoConIva() {
		this.iva = (this.prezzo * 22) /100;
		return this.prezzo +  this.iva;
	}

	@Override
	public String toString() {
		return " Codice Prodotto: " + codice + " Nome: " + nome + " Marca: " + marca + " Prezzo con Iva: "
				+ prezzoConIva() + " euro";

	}
}