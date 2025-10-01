# 🏦 Sistema Bancário em Java

## 📌 Sobre o projeto
Este projeto está sendo desenvolvido em Java com fins de estudo, aplicando conceitos de:
 - Estruturas de controle e repetição
 - Programação Orientada a Objetos (POO)
 - Boas práticas de versionamento (Git e Conventional Commits)
A aplicação simula operações básicas de uma conta bancária, com menu interativo no console.

## ⚙️ Funcionalidades
 - Consultar saldo
 - Consultar limite do cheque especial
 - Depositar dinheiro
 - Sacar dinheiro
 - Pagar boleto
 - Verificar se a conta está utilizando cheque especial

## 📝 Regras de negócio
- O limite de cheque especial é definido no momento da criação da conta, de acordo com o valor do depósito inicial:
    - Até R$ 500,00 → limite fixo de R$ 50,00
    - Acima de R$ 500,00 → limite de 50% do valor depositado
- Caso o cheque especial seja utilizado, será cobrada uma taxa de 20% sobre o valor utilizado, assim que houver saldo disponível para cobrir.

## 📌 Roadmap
- [x] Criar menu interativo no console
- [x] Implementar criação de conta com depósito inicial
- [x] Definir limite de cheque especial conforme regras de negócio
- [x] Implementar depósitos
- [x] Implementar saques
- [x] Implementar pagamento de contas
- [ ] Aplicar taxa automática sobre uso do cheque especial
- [ ] Melhorar mensagens exibidas ao usuário
- [ ] Criar testes unitários básicos

## 📖 Aprendizados
 - Implementação de menus interativos em Java
 - Uso de classes e métodos para organizar responsabilidades
 - Aplicação de regras de negócio em lógica de programação
 - Primeiros passos com Git e boas práticas de commits

## 👨‍💻 Autor
Projeto desenvolvido por Alisson Oliveira como parte do aprendizado em Java e boas práticas de desenvolvimento.
