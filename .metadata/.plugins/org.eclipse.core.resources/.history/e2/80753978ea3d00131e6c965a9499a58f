package com.jogocartas.testes;

import java.io.ObjectInputStream.GetField;

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
			retorno.append(i + " de " + naipe.toString() + "\n");
		}
		return retorno.toString();

	}

}
