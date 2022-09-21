# API de artistas musicais

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

## Diagrama de classes