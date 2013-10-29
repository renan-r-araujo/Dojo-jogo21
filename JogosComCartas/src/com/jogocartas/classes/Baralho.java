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
		ArrayList<Carta> baralhoDeCopas = new ArrayList<>();
		ArrayList<Carta> baralhoDeEspadas = new ArrayList<>();
		ArrayList<Carta> baralhoDeOuros = new ArrayList<>();
		ArrayList<Carta> baralhoDePaus = new ArrayList<>();
		
		separaEm(baralhoDeCopas, baralhoDeEspadas, baralhoDeOuros, baralhoDePaus);	
		
		ordena(baralhoDeCopas, baralhoDeEspadas, baralhoDeOuros, baralhoDePaus);
		
		baralho.clear();
		
		junta(baralhoDeCopas, baralhoDeEspadas, baralhoDeOuros, baralhoDePaus);
	}

	private void junta(ArrayList<Carta> baralhoCopas,
			ArrayList<Carta> baralhoEspadas, ArrayList<Carta> baralhoOuros,
			ArrayList<Carta> baralhoPaus) {
		baralho.addAll(baralhoCopas);
		baralho.addAll(baralhoEspadas);
		baralho.addAll(baralhoOuros);
		baralho.addAll(baralhoPaus);
	}

	private void ordena(ArrayList<Carta> baralhoCopas,
			ArrayList<Carta> baralhoEspadas, ArrayList<Carta> baralhoOuros,
			ArrayList<Carta> baralhoPaus) {
		Collections.sort(baralhoCopas);
		Collections.sort(baralhoEspadas);
		Collections.sort(baralhoOuros);
		Collections.sort(baralhoPaus);
	}

	private void separaEm(ArrayList<Carta> baralhoCopas,
			ArrayList<Carta> baralhoEspadas, ArrayList<Carta> baralhoOuros,
			ArrayList<Carta> baralhoPaus) {
		for (Carta carta : baralho) {
			if(carta.getNaipe()==NAIPE.COPAS){
				baralhoCopas.add(carta);				
			}
			else if(carta.getNaipe()==NAIPE.ESPADAS){
				baralhoEspadas.add(carta);				
			}
			else if(carta.getNaipe()==NAIPE.OUROS){
				baralhoOuros.add(carta);				
			}
			else if(carta.getNaipe()==NAIPE.PAUS){
				baralhoPaus.add(carta);				
			}
		}
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
