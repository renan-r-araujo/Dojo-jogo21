package com.jogocartas.testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.jogocartas.classes.Carta;
import com.jogocartas.classes.NAIPE;

public class TesteCarta {
	
	private Carta carta;

	@Before
	public void setUp(){
		carta = new Carta(1, NAIPE.COPAS);
	}

	@Test
	public void testGetValor() {
		assertEquals(1,carta.getValor());
	}
	
	@Test
	public void testGetNaipe(){
		assertEquals(NAIPE.COPAS, carta.getNaipe());
	}
	
	@Test
	public void testUsada(){
		assertFalse(carta.getUse());
	}
	
	@Test
	public void testToString(){
		assertEquals("�s de Copas", carta.toString());
	}

}
