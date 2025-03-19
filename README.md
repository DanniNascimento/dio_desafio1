# Projeto Conta Terminal

Este projeto consiste em um programa Java simples que simula a criação de uma conta bancária. Ele solicita ao usuário informações como número da agência, número da conta, nome do cliente e saldo inicial, e exibe uma mensagem de boas-vindas com os dados da conta.

## Funcionalidades

* Solicita ao usuário o número da agência, número da conta, nome do cliente e saldo inicial.
* Exibe uma mensagem de boas-vindas personalizada com os dados da conta criada.

## Como Executar

1.  Certifique-se de ter o Java Development Kit (JDK) instalado em seu sistema.
2.  Compile o código Java usando o comando `javac ContaTerminal.java`.
3.  Execute o programa usando o comando `java ContaTerminal`.
4.  Siga as instruções no console para inserir os dados da conta.

## Estrutura do Projeto

O projeto é composto por um único arquivo Java, `ContaTerminal.java`, que contém a classe `ContaTerminal` com o método `main`. O método `main` é responsável por:

1.  Declarar as variáveis para armazenar os dados da conta.
2.  Criar um objeto `Scanner` para ler a entrada do usuário.
3.  Solicitar e ler os dados da conta do usuário.
4.  Exibir a mensagem de boas-vindas com os dados da conta.
5.  Fechar o scanner.

## Desafios Encontrados

Durante o desenvolvimento deste projeto, alguns desafios foram encontrados:

* **Tratamento de exceções:** Inicialmente, o programa não tratava exceções, o que poderia levar a erros caso o usuário inserisse dados inválidos. Para resolver isso, foi implementado um bloco `try-catch` para capturar a exceção `InputMismatchException` e exibir uma mensagem de erro adequada.
* **Formatação de saída:** A mensagem de boas-vindas inicial não era formatada de forma clara e legível. Para melhorar a apresentação dos dados, foi utilizada a formatação de strings com `System.out.printf()`.
* **Entrada de dados:** a entrada de dados do tipo `double` para o saldo, poderia gerar erros caso o usuario digitasse algum caractere que não fosse um numero, ou usasse a virgula no lugar do ponto. Foi adicionado tratamento de erros para que o usuario seja notificado caso digite um valor incorreto.

## Melhorias Futuras

* Adicionar validação de dados para garantir que os dados inseridos pelo usuário sejam válidos.
* Implementar outras funcionalidades de uma conta bancária, como depósito, saque e transferência.
* Criar uma interface gráfica para tornar o programa mais amigável.
* Adicionar a possibilidade de escolher a moeda da conta.
* Implementar testes unitários para garantir a qualidade do código.
