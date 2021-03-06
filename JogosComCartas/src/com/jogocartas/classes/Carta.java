package com.jogocartas.classes;

public class Carta implements Comparable<Carta> {

	private int valor;
	private NAIPE naipe;
	private boolean utlilizada;

	public Carta(int valor, NAIPE naipe) {
		this.valor = valor;
		this.naipe = naipe;
		this.utlilizada = false;
	}

	public int getValor() {
		return valor;
	}

	public NAIPE getNaipe() {
		return naipe;
	}

	public boolean getUse() {
		return utlilizada;
	}

	@Override
	public String toString() {
		return criaString();
	}

	private String criaString() {
		return stringValor() + " de " + naipe.toString();
	}

	private String stringValor() {
		String value;
		switch (valor) {
		case 1:
			value = "�s";
			break;

		case 11:
			value = "Valete";
			break;

		case 12:
			value = "Dama";
			break;

		case 13:
			value = "Rei";
			break;

		default:
			value = String.valueOf(valor);
			break;
		}

		return value;

	}

	@Override
	public int compareTo(Carta o) {
		if (o.getValor() > this.valor) {
			return -1;
		}
		if (o.getValor() < this.valor) {
			return 1;
		}
		return 0;
	}

}
