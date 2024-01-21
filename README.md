
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




## Rodando os testes

Para rodar os testes, excute o arquivo GereciadorEstacoinamentoApplicationTests, que se localiza em :

```bash
  src > test > GereciadorEstacoinamentoApplicationTests 
```


## Roadmap

- Implentação da autenticação usando JWT


## Apêndice

Coloque qualquer informação adicional aqui

