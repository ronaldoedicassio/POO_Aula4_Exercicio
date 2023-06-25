package com.project.exercicio2;

public class Caminhao extends VeiculoRegistrado {

	private String carga;
	private int cargaMax;

	public String getCarga() {
		return carga;
	}

	public void setCarga(String carga) {
		this.carga = carga;
	}

	public int getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	public Caminhao(int identificador, String fabricante, String modelo, int anoFabricacao, String carga, int cargaMax) {
		this.carga = carga;
		this.cargaMax = cargaMax;
		setIdentificador(identificador);
		setFabricante(fabricante);
		setModelo(modelo);
		setAnoFabricacao(anoFabricacao);
	}

}
