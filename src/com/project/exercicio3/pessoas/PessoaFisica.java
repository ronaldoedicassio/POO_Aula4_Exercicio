package com.project.exercicio3.pessoas;

public class PessoaFisica extends Pesssoa{

	private String cpf;

	public PessoaFisica(String nome, String endereco, String cpf) {
		super();
		setNome(nome);
		setEndereco(endereco);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getNome()+ " (" + getCpf() + ")";
	}
}
