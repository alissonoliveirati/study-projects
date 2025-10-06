# 🎬 CinemaApp

Um projeto em Java que demonstra o uso de herança, polimorfismo e encapsulamento aplicados a ingressos de cinema.

## 📝 Descrição

O CinemaApp permite criar diferentes tipos de ingressos e calcular seu valor real:
- Ingresso normal: valor base informado.
- Meia Entrada: 50% do valor base.
- Ingresso Família: valor multiplicado pelo número de pessoas, com desconto de 5% quando há mais de 3 pessoas.
O projeto também exibe as informações de cada ingresso usando toString(), mostrando filme, tipo de áudio e valor.

## 🏗️ Estrutura de Classes

| Classe            | Descrição                                                                            |
| ----------------- | ------------------------------------------------------------------------------------ |
| `Ingresso`        | Superclasse com atributos `valor`, `nomeFilme`, `tipoAudio` e método `valorReal()`.  |
| `MeiaEntrada`     | Subclasse que sobrescreve `valorReal()` para aplicar desconto de 50%.                |
| `IngressoFamilia` | Subclasse com `numeroPessoas`, sobrescrevendo `valorReal()` com cálculo de desconto. |
| `CinemaApp`       | Classe principal para testar todos os tipos de ingresso.                             |


## 💻 Funcionalidades
- Criar ingressos com nome do filme, valor e tipo de áudio.
- Calcular o valor real conforme o tipo de ingresso.
- Exibir detalhes completos do ingresso.
- Demonstrar polimorfismo ao chamar o mesmo método em diferentes objetos.

## 📜 Regras de Negócio
O sistema de ingressos de cinema segue as seguintes regras:
1. Ingresso Normal
   - O valor do ingresso é exatamente o valor informado na criação do objeto.
   - Não há descontos nem multiplicações.
   - Mantém as informações de filme e tipo de áudio.
2. Meia Entrada
   - O valor real do ingresso é metade do valor base.
   - Aplica-se a qualquer filme e mantém o tipo de áudio informado.
   - É útil para estudantes, idosos ou categorias que tenham direito a desconto.
3. Ingresso Família
   - O valor real é calculado multiplicando o valor base pelo número de pessoas.
   - Quando o número de pessoas é maior que três, aplica-se um desconto de 5% no total.
   - Permite cadastrar quantas pessoas forem necessárias e mantém informações de filme e tipo de áudio.
Exemplos práticos:
- Um ingresso normal de R$20 → valor real: R$20.
- Uma meia entrada de R$20 → valor real: R$10.
- Um ingresso família de 2 pessoas, valor R$20 → valor real: R$40.
- Um ingresso família de 4 pessoas, valor R$20 → valor real: R$76 (aplicando o desconto de 5%).

## 🚀 Tecnologias Utilizadas
- Java 17+
- Paradigma de Orientação a Objetos (POO)
- Herança, polimorfismo e encapsulamento

## 📖 Aprendizados
 - Uso de heranças e polimorfismo
 - Aplicação de regras de negócio em lógica de programação
 - Primeiros passos com Git e boas práticas de commits

## 📌 Observações
- Todos os atributos são privados (encapsulamento), acessados via métodos públicos.
- Projeto pronto para evoluir com listas (List<Ingresso>), permitindo gerenciar múltiplos ingressos dinamicamente.
- Excelente prática para fixar conceitos de POO em Java.

## 👨‍💻 Autor
Projeto desenvolvido por Alisson Oliveira como parte do aprendizado em Java e boas práticas de desenvolvimento.