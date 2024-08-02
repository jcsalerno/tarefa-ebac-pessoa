# Projeto: Sistema de Pessoas (Pessoa Física e Jurídica)

Este projeto foi desenvolvido como parte de uma tarefa da EBAC, visando a prática de conceitos de Programação Orientada a Objetos (OOP) em Java. O sistema simula um cadastro de pessoas, diferenciando entre Pessoa Física e Pessoa Jurídica, utilizando herança e classes abstratas.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

- **Pessoa**: Classe abstrata que define os atributos e métodos comuns para Pessoa Física e Pessoa Jurídica.
- **PessoaFisica**: Subclasse de `Pessoa`, representando uma pessoa física, com atributos específicos como CPF e data de nascimento.
- **PessoaJuridica**: Subclasse de `Pessoa`, representando uma pessoa jurídica, com atributos específicos como CNPJ e razão social.
- **Main**: Classe principal utilizada para testar as funcionalidades do sistema.

## Classes

### 1. Pessoa
Classe abstrata que serve de base para as classes `PessoaFisica` e `PessoaJuridica`.

**Atributos**:
- `nome`: Nome da pessoa.
- `endereco`: Endereço da pessoa.

**Métodos**:
- `exibirInformacoes()`: Método abstrato que deve ser implementado pelas subclasses.

### 2. PessoaFisica
Subclasse que estende a classe `Pessoa` e representa uma pessoa física.

**Atributos**:
- `cpf`: CPF da pessoa física.
- `dataNascimento`: Data de nascimento da pessoa física.

**Métodos**:
- `exibirInformacoes()`: Implementação do método abstrato, exibindo informações específicas de uma pessoa física.

### 3. PessoaJuridica
Subclasse que estende a classe `Pessoa` e representa uma pessoa jurídica.

**Atributos**:
- `cnpj`: CNPJ da empresa.
- `razaoSocial`: Razão social da empresa.

**Métodos**:
- `exibirInformacoes()`: Implementação do método abstrato, exibindo informações específicas de uma pessoa jurídica.

### 4. Main
Classe principal do projeto, utilizada para criar instâncias de `PessoaFisica` e `PessoaJuridica` e exibir suas informações.

## Como Executar

1. Clone o repositório para sua máquina local.
2. Compile as classes Java.
3. Execute a classe `Main` para visualizar as funcionalidades.

```bash
javac Pessoa.java PessoaFisica.java PessoaJuridica.java Main.java
java Main
