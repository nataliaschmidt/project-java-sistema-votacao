package com.betrybe.sistemadevotacao;

public class Principal {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
  GerenciamentoVotacao teste = new GerenciamentoVotacao();
  teste.cadastrarPessoaCandidata("Joao", 1);
    System.out.println(teste.pessoasCandidatas);

    teste.cadastrarPessoaCandidata("Maria", 1);
  }

}
