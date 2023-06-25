package com.project.exercicio3.contas;

public class ContaPoupanca extends ContaAbstrata {
	private double taxaRendimento;

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	public void render() {
		double rendimento = getSaldo() * (taxaRendimento / 100);
		depositar(rendimento);
	}
}
