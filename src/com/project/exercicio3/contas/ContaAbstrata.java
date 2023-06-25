package com.project.exercicio3.contas;

import com.project.exercicio1.Pesssoa;

public abstract class ContaAbstrata {
	private Pesssoa titularConta;
	private double saldo;
	private int agencia;
	private int conta;
	private int digito;

	public Pesssoa getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(Pesssoa titularConta) {
		this.titularConta = titularConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}

	public double getSaldo() {
		return saldo;
	}

	public void sacar(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor do saque tem que ser positivo");
		}

		if (saldo - valor < 0) {
			throw new IllegalArgumentException("Saldo insuficiente");
		}

		saldo = saldo - valor;
	}

	public void depositar(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor do deposito tem que ser positivo");
		}

		saldo = saldo + valor;
	}

	public double consultar() {
		return saldo;
	}
}
