package com.jogocartas.classes;

public enum NAIPE {
	COPAS("Copas"), ESPADAS("Espadas"), OUROS("Ouros"), PAUS("Paus");
	
	private String nome;
	
	
	
	NAIPE(String nome){
		this.nome = nome;
	}
	
	public String toString(){
		return nome;
	}

}
