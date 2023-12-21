# Sistema de Votação

Desafio da Aceleração em Java proposto pela Trybe para abranger conceitos de POO, input e output, estruturas de dados e estrutura de repetição em Java.
O desafio consiste em desenvolver um sistema de votação eletrônico. Esse sistema deve permitir o cadastro das pessoas candidatas, o cadastro das pessoas eleitoras, iniciar o processo de votação e apresentar os resultados da eleição.

## Tecnologias Utilizadas
<hr>

- Java
- Maven

## Instruções
<hr>

- Clone este repositório.

```bash
git clone git@github.com:nataliaschmidt/project-java-sistema-votacao.git
```
- Acesse o diretório do projeto e instale suas dependências
```bash
mvn install
```

Execute a classe Principal, responsável por interagir com a pessoa usuária. Essa classe encontra-se no caminho /src/main/java/com.betrybe.sistemadevotacao

## Exemplo de uso

```bash
----------- Cadastrar Pessoa Candidata -----------

Cadastrar pessoa candidata?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa candidata:
Maria
Entre com o número da pessoa candidata:
1
Cadastrar pessoa candidata?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa candidata:
João
Entre com o número da pessoa candidata:
2
Cadastrar pessoa candidata?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
2


----------- Cadastrar pessoas eleitoras -----------
Cadastrar pessoa candidata?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
2
Cadastrar pessoa eleitora?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa eleitora:
Afonso
Entre com o cpf da pessoa eleitora:
123.456.789-00
Cadastrar pessoa eleitora?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa eleitora:
Lucia
Entre com o cpf da pessoa eleitora:
987.654.321-00
Cadastrar pessoa eleitora?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
2

----------- Votação -----------

Entre com o número correspondente à opção desejada:
1 - Votar
2 - Resultado Parcial
3 - Finalizar Votação
1
Entre com o cpf da pessoa eleitora:
123.456.789-00
Entre com o número da pessoa candidata:
1
Entre com o número correspondente à opção desejada:
1 - Votar
2 - Resultado Parcial
3 - Finalizar Votação
1
Entre com o cpf da pessoa eleitora:
987.654.321-00
Entre com o número da pessoa candidata:
1
Entre com o número correspondente à opção desejada:
1 - Votar
2 - Resultado Parcial
3 - Finalizar Votação
3
Nome: Maria - 2 votos ( 100.0% )
Nome: João - 0 votos ( 00.0% )
Total de votos: 2
```