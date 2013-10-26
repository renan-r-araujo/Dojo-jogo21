package com.jogocartas.classes;

import java.util.ArrayList;
import java.util.Collections;

public class Baralho implements JogoDeCartas {

	ArrayList<Carta> baralho;
	private int qtCartas = 0;

	public Baralho() {
		baralho = new ArrayList<>();

		criaCartasPor(NAIPE.COPAS);
		criaCartasPor(NAIPE.ESPADAS);
		criaCartasPor(NAIPE.OUROS);
		criaCartasPor(NAIPE.PAUS);

	}

	private void criaCartasPor(NAIPE naipe) {
		for (int i = 1; i < 14; i++) {
			baralho.add(qtCartas, new Carta(i, naipe));
			qtCartas++;
		}
	}

	@Override
	public void ordenar() {
		ArrayList<Carta> baralhoCopas = new ArrayList<>();
		ArrayList<Carta> baralhoEspadas = new ArrayList<>();
		ArrayList<Carta> baralhoOuros = new ArrayList<>();
		ArrayList<Carta> baralhoPaus = new ArrayList<>();
		for (Carta carta : baralho) {
			if(carta.getNaipe()==NAIPE.COPAS){
				baralhoCopas.add(carta);				
			}
			else if(carta.getNaipe()==NAIPE.ESPADAS){
				baralhoCopas.add(carta);				
			}
			else if(carta.getNaipe()==NAIPE.OUROS){
				baralhoCopas.add(carta);				
			}
			else if(carta.getNaipe()==NAIPE.PAUS){
				baralhoCopas.add(carta);				
			}
		}	
		baralho.clear();
		Collections.sort(baralhoCopas);
		Collections.sort(baralhoEspadas);
		Collections.sort(baralhoOuros);
		Collections.sort(baralhoPaus);
		baralho.addAll(baralhoCopas);
		baralho.addAll(baralhoEspadas);
		baralho.addAll(baralhoOuros);
		baralho.addAll(baralhoPaus);
	}

	@Override
	public void embaralhar() {
		Collections.shuffle(baralho);
	}

	@Override
	public Carta darCartas() {
		return null;
	}

	@Override
	public String listarBaralho() {
		StringBuilder baralhoListado = new StringBuilder();
		for (Carta carta : baralho) {
			baralhoListado.append(carta.toString() + "\n");
		}
		return baralhoListado.toString();
	}

	public Carta getCarta(int i) {
		return baralho.get(i);
	}

	public int getQtCartas() {
		return qtCartas;
	}

}
