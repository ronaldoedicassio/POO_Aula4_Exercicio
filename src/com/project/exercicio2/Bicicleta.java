package com.project.exercicio2;

public class Bicicleta extends Veiculo {
	private TipoBicicleta tipoBicicleta;
	boolean temRodinha;

	public TipoBicicleta getTipoBicicleta() {
		return tipoBicicleta;
	}

	public void setTipoBicicleta(TipoBicicleta tipoBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
	}

	public boolean isTemRodinha() {
		return temRodinha;
	}

	public void setTemRodinha(boolean temRodinha) {
		this.temRodinha = temRodinha;
	}

	public Bicicleta(int identificador, String fabricante, String modelo, int anoFabricacao, TipoBicicleta tipoBicicleta, boolean temRodinha) {
		
		this.tipoBicicleta = tipoBicicleta;
		this.temRodinha = temRodinha;
		setIdentificador(identificador);
		setFabricante(fabricante);
		setModelo(modelo);
		setAnoFabricacao(anoFabricacao);
	}

}
