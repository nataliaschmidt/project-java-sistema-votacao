package com.betrybe.sistemadevotacao;

import java.util.ArrayList;
import java.util.Objects;

/**
 * The type Gerenciamento votacao.
 */
public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {

  private final ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<>();
  private final ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<>();

  private final ArrayList<String> cpfsComputados = new ArrayList<>();

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata pessoaCandidata : this.pessoasCandidatas) {
      if (pessoaCandidata.getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
        return;
      }
    }
    pessoasCandidatas.add(new PessoaCandidata(nome, numero));
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora pessoaEleitora : this.pessoasEleitoras) {
      if (Objects.equals(pessoaEleitora.getCpf(), cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
        return;
      }
    }
    pessoasEleitoras.add(new PessoaEleitora(nome, cpf));
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (cpfsComputados.contains(cpfPessoaEleitora)) {
      System.out.println("Pessoa eleitora já votou!");
      return;
    }

    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      if (pessoaCandidata.getNumero() == numeroPessoaCandidata) {
        pessoaCandidata.receberVoto();
      }
    }
    cpfsComputados.add(cpfPessoaEleitora);
  }

  @Override
  public void mostrarResultado() {
    if (cpfsComputados.isEmpty()) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
      return;
    }

    int totalVotos = cpfsComputados.size();
    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      double percentual = (double) pessoaCandidata.getVotos() / totalVotos * 100;
      System.out.println(
          "Nome: " + pessoaCandidata.getNome() + " - " + pessoaCandidata.getVotos() + " votos ( "
              + Math.round(percentual) + "% )");
    }
    System.out.printf("Total de votos: " + totalVotos);
  }
}