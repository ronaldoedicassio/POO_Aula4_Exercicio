package com.project.exercicio1;

public class PessoaJuridica extends Pesssoa {

	private String cnpj;
	private PessoaFisica responsavel;

	
	public PessoaJuridica(String nome, String endereco, String cnpj, PessoaFisica responsavel) {
		super();
		setNome(nome);
		setEndereco(endereco);
		this.cnpj = cnpj;
		this.responsavel = responsavel;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public PessoaFisica getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(PessoaFisica responsavel) {
		this.responsavel = responsavel;
	}

	@Override
	public String toString() {
		return getNome() + "(" + getCnpj() + ") - Responsavel " + getResponsavel();
	}

	
}
