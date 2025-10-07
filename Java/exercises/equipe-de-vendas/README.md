# 💼 Sistema de Funcionários — Herança e Polimorfismo em Java

## 📘 Descrição do Projeto

Este projeto tem como objetivo demonstrar o uso de herança e polimorfismo em Java por meio de uma hierarquia de classes que representam os tipos de usuários de um sistema de loja.
Cada tipo de funcionário possui comportamentos e responsabilidades específicos, mas compartilham atributos e métodos comuns herdados da classe base Funcionario.

## 🧱 Estrutura de Classes
🔹 Classe Funcionario (superclasse)
Representa o modelo base de um funcionário.
Contém os atributos e métodos comuns a todos os tipos de usuários do sistema.

Atributos:

- nome — nome do funcionário
- emailString — email para login
- senha — senha de acesso
- isAdmin — indica se o funcionário é administrador

Métodos principais:

- realizarLogin(String email, String senha)
- realizarLogoff()
- alterarDados(String novoNome, String novoEmail)
- alterarSenha(String novaSenha)
- isAdmin() e setAdmin(boolean)
- Getters e Setters

🔹 Classe Gerente
Herdeira de Funcionario.
Responsável por consultar vendas e gerar relatórios financeiros.

Características:
- O atributo isAdmin é sempre true.

Métodos:
- consultarVendas(Vendedor vendedor) — exibe o total de vendas de um vendedor.
- gerarRelatorioFinanceiro(Vendedor vendedor, Atendente atendente) — mostra o total de vendas e o valor em caixa.

🔹 Classe Vendedor
Herdeira de Funcionario.
É responsável pelo controle de vendas individuais.

Atributos adicionais:
- vendasFeitas — contador de vendas realizadas.

Características:
- O atributo isAdmin é sempre false.

Métodos:
- registrarVenda() — incrementa o número de vendas realizadas.
- consultarVendas() — exibe o total de vendas do vendedor.
- getVendasFeitas() — retorna o número total de vendas.

🔹 Classe Atendente
Herdeira de Funcionario.
Responsável por registrar e gerenciar o caixa da loja.

Atributos adicionais:
- valorEmCaixa — total de dinheiro recebido pelo atendente.

Características:
- O atributo isAdmin é sempre false.

Métodos:
- receberPagamento(double valor) — adiciona um valor ao caixa.
- getValorEmCaixa() — retorna o total atual em caixa.

## ⚙️ Fluxo de Execução (LojaApp)
O programa principal cria instâncias de cada tipo de funcionário e simula um dia de operações na loja.

Etapas:

1. Login de todos os funcionários.
2. Registro de vendas pelos vendedores.
3. Recebimento de pagamentos pelo atendente.
4. Consulta de vendas pelos vendedores.
5. Relatórios gerenciais criados pelo gerente.
6. Alteração de dados e senha do atendente.
7. Logoff de todos os funcionários.

## 📋 Regras de Negócio
- O Gerente é o único com permissão de administrador (isAdmin = true).
- Vendedor e Atendente nunca são administradores (isAdmin = false).
- Cada funcionário deve autenticar-se com email e senha antes das operações.
- A venda registrada incrementa o contador vendasFeitas do vendedor.
- O pagamento recebido incrementa o valor total em caixa do atendente.
- O Gerente pode:
  - Consultar o total de vendas de um vendedor.
  - Gerar relatórios financeiros combinando dados de vendas e caixa.

## 🧩 Conceitos Envolvidos
- Herança: Reuso de código comum entre subclasses.
- Encapsulamento: Controle de acesso a atributos e métodos via getters/setters.
- Polimorfismo: Mesmo método (realizarLogin, realizarLogoff) com comportamento genérico aplicado a diferentes tipos de funcionários.
- Regras de negócio: Diferenciação clara entre permissões e responsabilidades por cargo.

## 🚀 Tecnologias Utilizadas
- Java 17+
- Paradigma de Orientação a Objetos (POO)
- Estruturas de controle e repetição

## 👨‍💻 Autor
Projeto desenvolvido por Alisson Oliveira como parte do aprendizado em Java e boas práticas de desenvolvimento.