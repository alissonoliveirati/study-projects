# 🚗 Simulador de Carro (Java)

Este projeto é um simulador simples de carro desenvolvido em Java, com o objetivo de praticar POO, estruturas de controle e repetição.

O programa oferece um menu interativo para que o usuário possa controlar as funções de um carro, respeitando regras de velocidade, marcha e funcionamento.

## 📋 Funcionalidades
- Ligar o carro
- Desligar o carro
- Acelerar (até 120 km/h)
- Diminuir a velocidade (mínimo 0 km/h)
- Trocar marcha (0 a 6, sem pular marchas)
- Virar à esquerda ou direita (somente entre 1 e 40 km/h)
- Exibir status completo do carro (ligado, velocidade e marcha)

## ⚙️ Regras de negócio implementadas
- O carro inicia desligado, em ponto morto (marcha 0) e com velocidade 0.
- Carro desligado não pode realizar nenhuma ação.
- Velocidade máxima: 120 km/h.
- Velocidade mínima: 0 km/h.
- Restrições por marcha:
  - Marcha 0 → não pode acelerar
  - Marcha 1 → 0 a 20 km/h
  - Marcha 2 → 21 a 40 km/h
  - Marcha 3 → 41 a 60 km/h
  - Marcha 4 → 61 a 80 km/h
  - Marcha 5 → 81 a 100 km/h
  - Marcha 6 → 101 a 120 km/h
- Só pode virar para esquerda/direita se a velocidade estiver entre 1 km/h e 40 km/h.
- Só pode desligar o carro se estiver em marcha 0 e velocidade 0.

📚 Objetivo educacional
- Este projeto foi desenvolvido com fins de aprendizado em:
- Programação Orientada a Objetos (POO)
- Estruturas de controle e repetição
- Validações de regras de negócio
- Criação de menus interativos em Java

## 📖 Aprendizados
 - Implementação de menus interativos em Java
 - Uso de classes e métodos para organizar responsabilidades
 - Aplicação de regras de negócio em lógica de programação
 - Primeiros passos com Git e boas práticas de commits

## 👨‍💻 Autor
Projeto desenvolvido por Alisson Oliveira como parte do aprendizado em Java e boas práticas de desenvolvimento.