## Ng-Sarc

# Getting Started

## Compilar e Executar

Para compilar o projeto execute os seguintes comandos:

* mvn clean install
* mvn spring-boot:run

## Arquitetura do Projeto

![Arquitetura](./docs/arq.jpeg?raw=true "Arquitetura") 


* API: Interface para documentação e mapeamento de requisições HTTP.
* Controller: Lógica das requisições realizadas pelo usuário.
* Core: Camada que lida com a transição dos dados.
    * Repository: Se conecta com adapters para trazer os dados para essa camada sem interferir com tecnologias de banco de dados.
    * Service: Aplica a lógica dos dados vindos do Domain para devolver para a camada de controllers.
    * DTO: Todos os objetos de Data Transfer Object.

* Domain: Camada que traz os dados do banco e mapeia para objetos.
    * Adapter: Comunicação com o banco de dados diretamente e mapeamento das entidades.
    * Entity: Mapeamento das entidades dos banco de dados.
* Util: Utilitários que não possuem lógica de negócio, servem apenas como ferramentas auxiliares.

URL Swagger: http://localhost:8082/swagger-ui/index.html

Frameworks: 
* Spring-Boot

Decisões:
* Arquitetura com Api para documentação e Controller para lógica.
* Arquitetura com Adapter e Repository para integração com banco e camada de serviço.