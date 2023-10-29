package com.betrybe.sistemadevotacao;

import java.util.Objects;
import java.util.Scanner;

/**
 * The type Principal.
 */
public class Principal {

  /**
   * The Gerenciamento votacao.
   */
  GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
  /**
   * The Scanner.
   */
  Scanner scanner = new Scanner(System.in);

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    Principal principal = new Principal();
    principal.menuPessoaCandidata();
  }

  private void menuPessoaCandidata() {
    while (true) {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      String opcao = scanner.nextLine();

      if (opcao.equals("1")) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nome = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        String numeroScanner = scanner.nextLine();
        int numero = Integer.parseInt(numeroScanner);
        gerenciamentoVotacao.cadastrarPessoaCandidata(nome, numero);
      } else {
        menuPessoaEleitora();
        return;
      }
    }
  }

  private void menuPessoaEleitora() {
    System.out.println("Cadastrar pessoa eleitora?");
    System.out.println("1 - Sim");
    System.out.println("2 - Não");
    System.out.println("Entre com o número correspondente à opção desejada:");
    String opcao = scanner.nextLine();
    if (Objects.equals(opcao, "1")) {
      System.out.println("Entre com o nome da pessoa eleitora:");
      String nome = scanner.nextLine();
      System.out.println("Entre com o cpf da pessoa eleitora:");
      String cpf = scanner.nextLine();
      gerenciamentoVotacao.cadastrarPessoaEleitora(nome, cpf);
      menuPessoaEleitora();
    } else {
      menuVotacao();
    }
  }

  private void menuVotacao() {
    System.out.println("Entre com o número correspondente à opção desejada:");
    System.out.println("1 - Votar");
    System.out.println("2 - Resultado Parcial");
    System.out.println("3 - Finalizar Votação");
    String opcao = scanner.nextLine();

    if (Objects.equals(opcao, "1")) {
      System.out.println("Entre com o cpf da pessoa eleitora:");
      String cpf = scanner.nextLine();
      System.out.println("Entre com o número da pessoa candidata:");
      String numeroScanner = scanner.nextLine();
      int numero = Integer.parseInt(numeroScanner);
      gerenciamentoVotacao.votar(cpf, numero);
      menuVotacao();
    } else if (Objects.equals(opcao, "2")) {
      gerenciamentoVotacao.mostrarResultado();
      menuVotacao();
    } else {
      gerenciamentoVotacao.mostrarResultado();
    }
  }
}
