
# Estacionamento

Projeto e desenvolver um back end para gerenciamento de uma estacionamento


## Stack utilizada

**Back-end:** Java, SpringBoot, Posgre, JustUnit, Swageer


## Funcionalidades

- CRUD da Empresa
- CRUD Veiculo
- Cadastrar o veiculo na sua respectiva Empresa
- Listar os veiculos que ainda estão dentro do estacionamento
- Listar quantidade de veiculos que entrar por hora
- Lista a quantidade de veiculo que passaram pela empresa por dia
- Controlar a entrada e saida dos veiculos
- Controle de acesso


## Variáveis de Ambiente

Para rodar esse projeto, você vai precisar adicionar as seguintes variáveis de ambiente no seu .application.properties

`spring.jpa.show-sql=true`

`spring.jpa.hibernate.ddl-auto=update`

`spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect`

`spring.datasource.driverClassName=org.postgresql.Driver`

`spring.datasource.url=jdbc:postgresql://viaduct.proxy.rlwy.net:38141/railway`

`spring.datasource.username=postgres`

`spring.datasource.password=gC2-*CFA4GeEcfgde4-a2FbG14*2*B-3`


## Documentação da API
![Captura de Tela 2024-01-21 às 11 36 43](https://github.com/TorugoH/desafio-gestor-estacionamento/assets/40009988/e54ec1a9-218f-4a2a-88aa-52573d051e13)




## Rodando os testes

Para rodar os testes, excute o arquivo GereciadorEstacoinamentoApplicationTests, que se localiza em :

```bash
  src > test > GereciadorEstacoinamentoApplicationTests 
```


## Roadmap

- Implentação da autenticação usando JWT


## Apêndice

Coloque qualquer informação adicional aqui

