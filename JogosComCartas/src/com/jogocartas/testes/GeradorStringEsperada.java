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
		for (int i = 1; i < 14; i++) {
			if (i == 1) {
				retorno.append("�s" + " de " + naipe.toString() + "\n");
			} else if (i == 11) {
				retorno.append("Valete" + " de " + naipe.toString() + "\n");
			} else if (i == 12) {
				retorno.append("Dama" + " de " + naipe.toString() + "\n");
			} else if (i == 13) {
				retorno.append("Rei" + " de " + naipe.toString() + "\n");
			} else {
				retorno.append(i + " de " + naipe.toString() + "\n");
			}
		}
		return retorno.toString();
	}

}
