# Connect 4 - Quatro em Linha 🎮

Este repositório contém a implementação do famoso jogo **Connect 4** (Quatro em Linha) desenvolvido em Java. Dois jogadores competem para conectar quatro discos consecutivos em uma grade de 7 colunas por 6 linhas.

---

## 🚀 Funcionalidades
- **Jogo para dois jogadores**: Cada jogador escolhe seu símbolo (ex.: "R" para vermelho e "P" para preto).
- **Tabuleiro dinâmico**: Visualização clara do tabuleiro e atualizações após cada movimento.
- **Verificação de vitória**: O jogo identifica automaticamente combinações válidas de quatro discos consecutivos na horizontal, vertical ou diagonal.
- **Empates**: Detecta quando o tabuleiro está cheio e declara empate.
- **Validação de entradas**: Tratamento de erros para jogadas inválidas, como inserções em colunas fora do limite ou já preenchidas.

---

## 🛠️ Tecnologias Utilizadas
- **Java**: Linguagem principal utilizada para desenvolver o jogo.
- **POO (Programação Orientada a Objetos)**: Estruturação modular com classes para o tabuleiro e a lógica do jogo.
- **IDE**: Qualquer IDE ou editor de texto que suporte Java (ex.: IntelliJ, Eclipse ou VS Code).

---

## 📦 Estrutura do Projeto

```
connect4
├── src
│   └── br/com/fernandes
│       ├── Tabuleiro.java
│       └── GameConnect4Application.java
└── README.md
```

---

## 📚 Como Executar

### 1. Clone o Repositório:
```bash
git clone https://github.com/seu-usuario/connect4.git
cd connect4
```

### 2. Compile o Projeto:
```bash
javac -d bin src/br/com/fernandes/*.java
```

### 3. Execute o Jogo:
```bash
java -cp bin br.com.fernandes.GameConnect4Application
```

---

## 🧩 Exemplos de Execução

### Tabuleiro Inicial:
```
. . . . . . .
. . . . . . .
. . . . . . .
. . . . . . .
. . . . . . .
. . . . . . .
```

### Após Alguns Movimentos:
```
. . . . . . .
. . . . . . .
. . . . . . .
. . . . . . .
. . . . . . .
R P R P R . .
```

---

## 📝 Melhorias Futuras
- Interface gráfica para uma experiência mais intuitiva.
- Suporte para jogo contra a máquina com diferentes níveis de dificuldade.
- Salvamento e carregamento do estado do jogo.
- Testes unitários para validação das funcionalidades principais.

---

## 🤝 Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir uma *issue* ou enviar um *pull request*.

---
