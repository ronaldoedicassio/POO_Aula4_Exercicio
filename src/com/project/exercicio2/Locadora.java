package com.project.exercicio2;

import java.util.ArrayList;

import com.project.exercicio1.PessoaFisica;
import com.project.exercicio1.Pesssoa;

public class Locadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pesssoa> pessoas = new ArrayList<>();
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		
		pessoas.add(new PessoaFisica("Ronaldo", "Rua A", "1234567890"));
		pessoas.add(new PessoaFisica("Maira", "Rua A", "0987654321"));
		
		System.out.println(pessoas);
	}

}
