# API de artistas musicais

## Updates

26/09: Controller das entidades Artista e Usuario;

27/09: todas as entidades básicas definidas. Criação dos Repository e Service para entidades Artista e Usuario.

28/09: build com sucesso pela primeira vez. Implementação do banco de dados em H2. Entidades anotadas, de forma que o banco de dados é criado automaticamente.

29:09: consumo da API do IBGE para preenchimento da tabela País.

## Projeto Ada/Let's Code - Turma Marcianos BB

Projeto do Módulo "Programação Web II": API com arquitetura RESTful utilizando Spring Boot.

Estudante: João Antonio Desiderio de Moraes

## Tema do projeto

A API servirá endpoints para cadastro e consulta de informações sobre artistas musicais, incluindo dados dos artistas e de detalhes sobre seus lançamentos.

## Funcionalidades

A API terá as seguintes funcionalidades:
- Artistas 
  - Cadastro de dados dos artistas - nome, tipo (solo, conjunto), cidade de origem, país de origem, gêneros, período em atividade, integrantes, biografia, website).
  - Listagem dos artistas 
    - ordenação por ordem alfabética e inversa
    - paginação de resultados
    - filtro de pesquisa por atributos do artista.
  - Consulta aos dados do cadastro;
  - Cadastro de discografia;
- Lançamentos musicais 
  - Cadastro de lançamentos - nome, tipo (álbum, single, EP), data de lançamento, listagem de músicas;
  - Cadastro de letras de músicas ;
  - Listagem dos lançamentos
    - ordenação
    - paginação de resultados
    - filtro de pesquisa por atributos do lançamento
- Usuários
  - Cadastro de usuários
    - Dados: nome, email (validar), data de nascimento, nickname (validar se já existe), endereço.
      - Validação de cadastro repetido pelo email;
      - Validação do formato do email e data de nascimento
  - É necessário ter um usuário cadastrado para fazer alterações nos dados de artistas e lançamentos.
  - É possível criar listas de artistas
  - É possível criar listas de lançamentos
  - É possível criar listas de músicas
  - É possível acessar as listas de outros usuários

## Diagrama de classes