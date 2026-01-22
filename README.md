# Workshop Spring Boot 4 - CRUD com JPA

Projeto desenvolvido no curso:

**Java COMPLETO - Programação Orientada a Objetos + Projetos**  
Instrutor: **Nélio Alves**

Este projeto implementa um sistema CRUD de usuários, utilizando **Spring Boot**, **Spring Data JPA** e **H2/MySQL** como banco de dados. É um exemplo prático de aplicação de conceitos de orientação a objetos e desenvolvimento de APIs RESTful.

---

## Funcionalidades

O projeto oferece os seguintes endpoints RESTful:

| Método | Endpoint       | Descrição                     |
|--------|----------------|--------------------------------|
| GET    | `/users`       | Lista todos os usuários       |
| GET    | `/users/{id}`  | Busca um usuário por ID       |
| POST   | `/users`       | Cria um novo usuário          |
| PUT    | `/users/{id}`  | Atualiza um usuário existente |
| DELETE | `/users/{id}`  | Remove um usuário             |

### Tratamento de exceções
O projeto utiliza um handler global (`ResourceExceptionHandler`) para retornar mensagens padronizadas em casos de erro, como:

- **ResourceNotFoundException** → retorna HTTP 404 com JSON explicativo.
- **DatabaseException** → retorna HTTP 400 em caso de violação de integridade de dados.

Exemplo de resposta JSON de erro:

```json
{
  "timestamp": "2026-01-22T22:07:50Z",
  "status": 404,
  "error": "Resource not found",
  "message": "Resource not found. Id 8",
  "path": "/users/8"
}
