### Renata Hassum - [Linkedin](https://www.linkedin.com/in/renataviottohassumdev) | renatahassum@gmail.com

# DSLearn [![NPM](https://img.shields.io/npm/l/react)](https://github.com/RenataHassum/dslearn_backend/blob/main/LICENSE) 

# Sobre o projeto

Utilizando um modelo de domínio complexo, o DSLearn é um projeto backend desenvolvido com Spring Boot que implementa uma plataforma de ensino online. Seguindo as melhores práticas, ele oferece uma solução abrangente para gerenciar cursos, turmas, alunos e um fórum de perguntas e respostas.

Os cursos são organizados em seções e incluem trilhas de aprendizado, bônus, links externos e aulas em diferentes formatos. O sistema possui funcionalidades essenciais, como autenticação, autorização e operações CRUD completas para gerenciar recursos.

Além disso, o DSLearn oferece recursos como matrícula, aulas com entrega e correção, e notificações de leitura. Este projeto foi desenvolvido como parte do Bootcamp Spring da instituição de ensino <a href="https://devsuperior.com.br/cursos"><img align="center" height="16" alt="DevSuperior" src="https://devsuperior.com.br/_next/static/images/logo-white-10059e26f600604a7b5bd7782ed7550c.svg"></a>

## Figma
https://www.figma.com/file/p8Hawp1w5g0pCZ3h3ZsCUd/DSLearn-Bootcamp?type=design&node-id=0-1&mode=design&t=uQs8oG31lR6cXNqu-0

## Modelo conceitual
![Modelo Conceitual](https://github.com/RenataHassum/assets/blob/main/dslearn_assets/modelo%20conceitual.jpg?raw=true)

## Padrão camadas
![Padrão camadas](https://github.com/RenataHassum/assets/blob/main/padrao_camadas.jpg?raw=true)

# Passo a passo Postman Collection

## [![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/22138191-979c6818-ba5f-4099-a756-00d3a37c4704?action=collection%2Ffork&source=rip_markdown&collection-url=entityId%3D22138191-979c6818-ba5f-4099-a756-00d3a37c4704%26entityType%3Dcollection%26workspaceId%3D971d952a-dbd9-4ab4-b24a-788c15b34916#?env%5Bbootcamp-DSLearn%5D=W3sia2V5IjoiaG9zdCIsInZhbHVlIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwIiwiZW5hYmxlZCI6dHJ1ZSwidHlwZSI6ImRlZmF1bHQifSx7ImtleSI6ImNsaWVudC1pZCIsInZhbHVlIjoiZHNsZWFybiIsImVuYWJsZWQiOnRydWUsInR5cGUiOiJkZWZhdWx0In0seyJrZXkiOiJjbGllbnQtc2VjcmV0IiwidmFsdWUiOiJkc2xlYXJuMTIzIiwiZW5hYmxlZCI6dHJ1ZSwidHlwZSI6ImRlZmF1bHQifSx7ImtleSI6InVzZXJuYW1lIiwidmFsdWUiOiJhbGV4QGdtYWlsLmNvbSIsImVuYWJsZWQiOnRydWUsInR5cGUiOiJkZWZhdWx0In0seyJrZXkiOiJwYXNzd29yZCIsInZhbHVlIjoiMTIzNDU2IiwiZW5hYmxlZCI6dHJ1ZSwidHlwZSI6ImRlZmF1bHQifSx7ImtleSI6InRva2VuIiwidmFsdWUiOiIiLCJlbmFibGVkIjp0cnVlLCJ0eXBlIjoiZGVmYXVsdCJ9LHsia2V5IjoicmVmcmVzaF90b2tlbiIsInZhbHVlIjoiIiwiZW5hYmxlZCI6dHJ1ZSwidHlwZSI6ImRlZmF1bHQifV0=)

## Escolha o ambiente do projeto
- "dsLearn" (lembre-se de substituir os emails para login).

## Login endpoints
`POST` Permite efetuar o login de um usuário. Utilize as seguintes credenciais para teste:
- maria@gmail.com
  - Funções: "ROLE_ADMIN"
  - Acesso: Liberado

- bob@gmail.com
  - Funções: "ROLE_INSTRUCTOR"
  - Acesso: Intermediário

- alex@gmail.com
  - Funções: "ROLE_STUDENT"
  - Acesso: Restrito

## User endpoints
`GET User by ID`
- Liberado para o próprio usuário com "ROLE_STUDENT" e para "ROLE_ADMIN" com acesso adicional
- Retorna informações de um usuário específico

## Deliver endpoints
`POST Save revision task`
- Restrito a usuários com função "ROLE_STUDENT"
- Liberado para usuários com função "ROLE_INSTRUCTOR" e "ROLE_ADMIN"
- Permite que o professor responsável atualize uma tarefa

## Notification endpoints
`GET Notifications for current user`
- Liberado para o usuário logado com função "ROLE_STUDENT"
- Permite visualizar notificações pessoais do usuário logado, sem informar o ID

# Opcional clone do projeto
```bash
# Pré-requisitos: Java 17
# clonar repositório
git clone git@github.com:RenataHassum/dslearn.git

# entrar na pasta do projeto back end
cd dslearn
cd backend

# executar o projeto
./mvnw spring-boot:run
```

# Tecnologias | Implantação em produção
## Backend
- Java
- Spring Boot
- Spring Cloud
- Spring Security
- ORM
- H2 Database
- JPA / Hibernate
- Maven
- OAuth2 / JWT
- PostgreSQL
- Implantação backend: Railway
- Implantação banco de dados: Postgresql

# Técnicas | Competências
- Monorepositório Git
- Modelo Conceitual com ORM e Seed de Banco de Dados: Utiliza mapeamento objeto-relacional (ORM)
- Arquitetura em Camadas: Segue uma arquitetura em camadas bem organizada, promovendo separação de responsabilidades e manutenibilidade
- Web Services RESTful: Implementa web services RESTful, seguindo o padrão DTO para transferência de dados
- Operações CRUD completas: Criar, Ler, Atualizar, Excluir, Procurar
- Tratamento de Exceções: Utiliza mecanismos para tratar exceções e fornecer mensagens de erro claras aos usuários
- Paginação de Dados: Utiliza técnicas de paginação para melhorar o desempenho e permitir navegação eficiente em conjuntos de dados grandes
- Autenticação e Autorização: Implementa OAuth2 e JWT para autenticação e autorização segura dos usuários
- Refresh Token e Password Token: Utiliza tokens para garantir a autenticação contínua e segura dos usuários, permitindo a renovação do acesso e a redefinição da senha de forma segura
- Autorizações Personalizadas: Pré-Autorização de Métodos, restringe o acesso apenas a usuários autorizados através de pré-autorização de métodos sensíveis
- Consultas ao Banco de Dados com JPA, JPQL e SQL: abordando o problema das consultas N+1

# Agradecimentos
<a href="https://devsuperior.com.br/cursos"><img align="center" height="16" alt="DevSuperior" src="https://devsuperior.com.br/_next/static/images/logo-white-10059e26f600604a7b5bd7782ed7550c.svg"></a> - Professor Nélio Alves

# Autora
### Renata Hassum - [Linkedin](https://www.linkedin.com/in/renataviottohassumdev) | renatahassum@gmail.com
Fico à disposição para qualquer esclarecimento, não hesite em me contatar
