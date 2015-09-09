package br.unibh.pessoas;

import java.util.Date;

import br.unibh.pessoas.entidades.Pessoa;
import br.unibh.pessoas.entidades.PessoaFisica;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	PessoaFisica pf1 = new PessoaFisica (1L,"João", "Rua A", "3333-4444", "11122233344", "joao@gmail.com", new Date(), "M");
		
		System.out.println(pf1);
	}

}
