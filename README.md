 Sistema de Gerenciamento de Assentos para Cinema "CineDev"

**Nome:** Yuri Mendes Beck  
**Matrícula:** 360420

## 📌 Descrição do Projeto

Este projeto é um sistema de gerenciamento de assentos para uma sala de cinema, desenvolvido em Java como parte do Trabalho Prático da disciplina de Lógica de Programação.

O sistema permite:
- Visualizar o mapa de assentos (10 fileiras x 20 assentos).
- Comprar ingressos (marcando assentos como ocupados).
- Cancelar compras (liberando assentos).
- Exibir um relatório detalhado de ocupação da sala.
- Navegação por menu interativo em loop, utilizando `switch`.

A sala é representada por uma matriz bidimensional `char[10][20]`, onde:
- `'L'` = Assento Livre
- `'X'` = Assento Ocupado

## ▶️ Como Executar o Programa

1. Abra o projeto no **Apache NetBeans**.
2. Clique com o botão direito no nome do projeto.
3. Selecione **"Run"**.
4. Utilize o menu no console para interagir com o sistema.

> **Observação:** O projeto já está configurado e pronto para execução. Não é necessário compilar manualmente.

## 📁 Estrutura do Projeto

- `CineRoom.java` — Classe principal que gerencia a sala de cinema, assentos e operações (comprar, cancelar, relatório).
- `Main.java` — Classe de execução, contendo o menu interativo e a integração com o usuário via `Scanner`.

Desenvolvido para a disciplina de Lógica de Programação — Prof. Alexandre Silveira.
