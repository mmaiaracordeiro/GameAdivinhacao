# 🎮 Game Adivinhação

## 📋 Proposta da Aplicação

Esta aplicação é um jogo de adivinhação interativo, onde os jogadores tentam adivinhar um número secreto gerado pelo sistema. O jogo oferece feedback em tempo real, indicando se o palpite do jogador está muito alto ou muito baixo. O sistema armazena o histórico de acertos e erros de cada jogador em um banco de dados MySQL.

## 🚀 Como Executar a Aplicação

### Pré-requisitos

- Java 17+
- Maven
- MySQL

### Passo a Passo

1. **Clone o Repositório:**
   ```sh
   git clone https://github.com/caio462/Orientacao_objeto.git
   cd Orientacao_objeto


2. **Configure o Banco de Dados:**
 
   Acesse o MySQL:
 ```cmd
<pre>mysql -u root -p <
 ```
/pre> Crie o banco de dados e tabelas:  <pre>CREATE DATABASE GuessingGame; USE GuessingGame; CREATE TABLE Users ( id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50), email VARCHAR(50), password VARCHAR(50) ); CREATE TABLE GameHistory ( id INT AUTO_INCREMENT PRIMARY KEY, user_name VARCHAR(50), attempts INT, hits INT, misses INT ); </pre>
   Compile o Projeto:
   Compile o Projeto:  <pre>mvn clean install </pre>
   Execute a Aplicação:  <pre>mvn exec:java -Dexec.mainClass="org.example.Main" </pre>

   
   📋 Funcionamento das Funcionalidades
   Tela de Registro

3. **Funcionamento das Funcionalidades**'
   - Tela de Registro  
   Nome: Campo para inserir o nome do usuário.
   Email: Campo para inserir o email do usuário.
   Senha: Campo para inserir a senha do usuário.
   Botão Registrar: Realiza o registro do usuário no banco de dados.
   - Tela de Login  
   Email: Campo para inserir o email do usuário.
   Senha: Campo para inserir a senha do usuário.
   Botão Login: Autentica o usuário e inicia o jogo.
   Botão Registrar: Leva o usuário à tela de registro.
   - Tela do Jogo  
   Campo de Palpite: Campo para inserir o palpite do número.
   Botão Adivinhar: Verifica se o palpite está correto e dá feedback.
   Botão Voltar: Retorna à tela de login para que o usuário possa sair ou criar um novo usuário.
   

🗂️ **Script do Banco de Dados**

   O script SQL para criar o banco de dados e as tabelas necessárias está incluído na seção de configuração do banco de dados:
   

**CREATE DATABASE GuessingGame;**
```mysql
USE GuessingGame;

CREATE TABLE Users (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(50),
email VARCHAR(50),
password VARCHAR(50)
);

CREATE TABLE GameHistory (
id INT AUTO_INCREMENT PRIMARY KEY,
user_name VARCHAR(50),
attempts INT,
hits INT,
misses INT
);
```
🔧 **Tecnologias Utilizadas**
- Java
- Swing
- MySQL
- Maven

📞 Contato

Para mais informações, entre em contato pelo email