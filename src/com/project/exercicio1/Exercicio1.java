package com.project.exercicio1;

public class Exercicio1 {

	public static void main(String[] args) {
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica("LTDA Huawei", "Av Agamenon-4777 Recife PE", "1234560001", new PessoaFisica("Ronaldo", "Rua da hora", "0123456789"));
		
		System.out.println(pessoaJuridica);
	}

}
