package com.jogocartas.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jogocartas.classes.Baralho;

public class TesteBaralho {
	
	private Baralho baralho = new Baralho();

	@Test
	public void testCriouCarta() {
		assertEquals(1, baralho.getCarta(0).getValor());
	}

}