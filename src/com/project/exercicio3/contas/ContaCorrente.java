package com.project.exercicio3.contas;

public class ContaCorrente extends ContaAbstrata {

	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public void sacar(double valor) {
		if(getSaldo() - valor < (limite *-1)) {
			throw new IllegalArgumentException("Saldo insuficiente");
		}else {
			sacar(valor);
		}
	}

}
