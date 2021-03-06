package com.jogocartas.testes;

import com.jogocartas.classes.NAIPE;

public class GeradorStringEsperada {

	private GeradorStringEsperada() {
	}

	public static String baralhoOrdenado() {
		StringBuilder retorno = new StringBuilder();
		retorno.append(getCartasDo(NAIPE.COPAS));
		retorno.append(getCartasDo(NAIPE.ESPADAS));
		retorno.append(getCartasDo(NAIPE.OUROS));
		retorno.append(getCartasDo(NAIPE.PAUS));
		return retorno.toString();
	}

	private static String getCartasDo(NAIPE naipe) {
		StringBuilder retorno = new StringBuilder();
		retorno.append("�s" + " de " + naipe.toString() + "\n");
		for (int i = 2; i < 11; i++) {
			retorno.append(i + " de " + naipe.toString() + "\n");
		}
		retorno.append("Valete" + " de " + naipe.toString() + "\n");
		retorno.append("Dama" + " de " + naipe.toString() + "\n");
		retorno.append("Rei" + " de " + naipe.toString() + "\n");
		return retorno.toString();
	}

}
