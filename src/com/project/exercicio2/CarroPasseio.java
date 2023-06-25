package com.project.exercicio2;

public class CarroPasseio extends VeiculoRegistrado {
	private TipoCarroPasseio categoria;
	private int qtdPassageiro;

	public TipoCarroPasseio getCategoria() {
		return categoria;
	}

	public void setCategoria(TipoCarroPasseio categoria) {
		this.categoria = categoria;
	}

	public int getQtdPassageiro() {
		return qtdPassageiro;
	}

	public void setQtdPassageiro(int qtdPassageiro) {
		this.qtdPassageiro = qtdPassageiro;
	}

	public CarroPasseio(int identificador, String fabricante, String modelo, int anoFabricacao,
			TipoCarroPasseio categoria, int qtdPassageiro) {
		this.categoria = categoria;
		this.qtdPassageiro = qtdPassageiro;
		setIdentificador(identificador);
		setFabricante(fabricante);
		setModelo(modelo);
		setAnoFabricacao(anoFabricacao);
	}

}
