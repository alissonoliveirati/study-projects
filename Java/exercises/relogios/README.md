# ⏰ Sistema de Relógios – Brasileiro e Americano

## 🧩 Descrição do Projeto
Este projeto tem como objetivo demonstrar conceitos de herança, polimorfismo e encapsulamento em Java, por meio da criação de uma hierarquia de classes que representam relógios de diferentes regiões do mundo.


A aplicação define uma classe base (Relogio) que contém as propriedades e comportamentos comuns a qualquer relógio, e duas subclasses que implementam comportamentos específicos:
- Relógio Brasileiro (formato 24h)
- Relógio Americano (formato 12h com AM/PM)

Além disso, cada relógio é capaz de receber informações de outro relógio e ajustar-se automaticamente ao formato correspondente.

## 🧠 Conceitos Envolvidos
- Abstração: a classe Relogio define uma estrutura comum e um método abstrato atualizarHorario, deixando as subclasses responsáveis pela implementação.
- Herança: as subclasses herdam atributos e métodos da classe Relogio.
- Polimorfismo: métodos com comportamento distinto nas subclasses.
- Encapsulamento: uso de getters e setters para controlar o acesso às propriedades hora, minuto e segundo.
- Conversão de formato de hora: implementação das regras específicas para relógios 12h e 24h.

## ⚙️ Estrutura da Hierarquia

Relogio (abstract)
 ├── RelogioBrasileiro
 └── RelogioAmericano

### Classe Abstrata Relogio
- Atributos:
  - hora
  - minuto
  - segundo
- Métodos:
  - getHoraFormatada(): retorna a hora no formato HH:MM:SS
  - setHora(), setMinuto(), setSegundo(): validam os limites de tempo
  - atualizarHorario(Relogio outroRelogio): método abstrato a ser implementado nas subclasses

### Classe RelogioBrasileiro
- Formato 24 horas
- Implementa atualizarHorario copiando as informações diretamente do relógio recebido

### Classe RelogioAmericano
- Formato 12 horas (com AM/PM)
- Implementa atualizarHorario realizando a conversão entre 24h ↔ 12h

## 🧮 Regras de Negócio
- O relógio americano não deve exibir horas entre 13 e 24.
- O método atualizarHorario deve ajustar o formato automaticamente conforme o tipo de relógio.
- Valores de tempo devem respeitar:
  - 0 ≤ hora ≤ 23
  - 0 ≤ minuto ≤ 59
  - 0 ≤ segundo ≤ 59
- O formato exibido deve sempre seguir HH:MM:SS.

## 🛠️ Tecnologias Utilizadas
- Java 17+
- Paradigma Orientado a Objetos (POO)
- Abstração e Polimorfismo
- VS Code / IntelliJ IDEA

## 📚 Aprendizados
Este exercício reforça o entendimento da abstração como ferramenta de modelagem, permitindo definir contratos comuns entre classes, além de exercitar os conceitos de herança, encapsulamento e polimorfismo em um contexto prático.

## 👨‍💻 Autor
Projeto desenvolvido por Alisson Oliveira como parte do aprendizado em Java e boas práticas de desenvolvimento.