# 🐾 PetShop – Controle de Banho

Este projeto é uma simulação de uma máquina de banho de pets, desenvolvida em Java com foco em estruturas de controle, repetição e POO.
A aplicação permite controlar os recursos da máquina (água e shampoo), gerenciar pets em banho e aplicar as regras de funcionamento definidas.

## ⚙️ Funcionalidades

A máquina de banho possui as seguintes operações:
- 🐶 Colocar pet na máquina (apenas 1 por vez).
- 🧴 Dar banho no pet (consome 10L de água e 2L de shampoo).
- 🚰 Abastecer com água (+2L por vez, até o limite de 30L).
- 🧼 Abastecer com shampoo (+2L por vez, até o limite de 10L).
- 💧 Verificar nível de água.
- 🧴 Verificar nível de shampoo.
- 🔍 Verificar se há pet na máquina.
- 🐕 Retirar pet da máquina.
- 🧽 Limpar máquina (consome 3L de água e 1L de shampoo).

## 📜 Regras de Negócio
- A máquina só pode ter 1 pet por vez.
- Cada banho realizado consome 10L de água e 2L de shampoo.
- A capacidade máxima é de 30L de água e 10L de shampoo.
- Se um pet for retirado sem tomar banho, a máquina fica suja e precisa ser limpa antes do próximo uso.
- A limpeza da máquina consome 3L de água e 1L de shampoo.
- O abastecimento é feito em incrementos de 2L por vez.

## 🖥️ Estrutura do Projeto
- Classe Pet → representa um animal que pode tomar banho.
- Classe MaquinaDeBanho → controla os recursos da máquina e o estado do pet.
- Classe PetShopApp → contém o menu interativo para o usuário interagir com o sistema.

## 📌 Exemplo de Interação
```
====== PetShop ======
1 - Colocar pet na máquina
2 - Dar banho no pet
3 - Retirar pet da máquina
4 - Abastecer água
5 - Abastecer shampoo
6 - Verificar níveis
7 - Limpar máquina
8 - Sair
====================== 
```

## 🚀 Tecnologias Utilizadas
- Java 17+
- Paradigma de Orientação a Objetos (POO)
- Estruturas de controle e repetição

## 📖 Aprendizados
 - Implementação de menus interativos em Java
 - Uso de classes e métodos para organizar responsabilidades
 - Aplicação de regras de negócio em lógica de programação
 - Primeiros passos com Git e boas práticas de commits

## 👨‍💻 Autor
Projeto desenvolvido por Alisson Oliveira como parte do aprendizado em Java e boas práticas de desenvolvimento.