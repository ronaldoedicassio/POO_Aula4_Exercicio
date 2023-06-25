package com.project.exercicio2;

import com.project.exercicio1.Pesssoa;

public class Locacao {
	private Veiculo veiculo;
	private Pesssoa cliente;
	private String dataInicio;
	private String dataFim;
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public Pesssoa getCliente() {
		return cliente;
	}
	public void setCliente(Pesssoa cliente) {
		this.cliente = cliente;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataFim() {
		return dataFim;
	}
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	public Locacao(Veiculo veiculo, Pesssoa cliente, String dataInicio, String dataFim) {
		super();
		this.veiculo = veiculo;
		this.cliente = cliente;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}
	
	
}

