package com.logic.rest;

public class Transportadora {
	private int tipoTransporte;
	private double valor;
	private double tempo;
	
	public Transportadora(int tipoTransporte, double valor, double tempo) {
		this.tipoTransporte = tipoTransporte;
		this.valor = valor;
		this.tempo = tempo;
	}

	public int getTipoTransporte() {
		return tipoTransporte;
	}

	public double getValor() {
		return valor;
	}

	public double getTempo() {
		return tempo;
	}
}
