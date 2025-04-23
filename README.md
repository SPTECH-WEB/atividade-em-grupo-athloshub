[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/aHACxyIM)
# 📦 Projeto de Entregas com Adapter, Strategy e Observer

## 🎯 Objetivo
Este projeto foi desenvolvido como parte de uma atividade prática em grupo para aplicação dos padrões de projeto **Adapter**, **Strategy** e **Observer** utilizando Java com Spring Boot.

---

## 🧱 Cenário
Você faz parte da equipe de desenvolvimento de uma plataforma de e-commerce. Seu time recebeu a missão de desenvolver o novo módulo de **entregas** da aplicação. Esse módulo precisa ser flexível, reutilizável e de fácil manutenção. Para isso, será necessário aplicar os três padrões de projeto: Adapter, Strategy e Observer.

---

## 👥 Divisão sugerida entre os 6 membros do grupo

| Membro | Responsabilidade |
|--------|------------------|
| 1      | Criar a entidade `Pedido` e configurar o JPA |
| 2      | Implementar o padrão Strategy com pelo menos 3 estratégias de frete |
| 3      | Criar a integração com uma transportadora externa utilizando Adapter |
| 4      | Implementar os Observers (e-mail, log, notificação) |
| 5      | Criar os Controllers e configurar os endpoints REST |
| 6      | Testar, documentar e montar o `README.md` com as instruções de uso |

---

## ✅ Funcionalidades obrigatórias

- Cadastro de pedidos via endpoint REST.
- Cálculo de frete baseado no tipo de entrega informado (`expressa`, `economica`, `transportadora`).
- Integração com transportadora externa simulada via Adapter.
- Disparo automático de pelo menos **três observadores** (ex: e-mail, log, SMS) após o processamento de um pedido.
- README com instruções e explicações dos padrões utilizados.

---

## 🚀 Funcionalidades

- `POST /pedidos` → Cria e processa um pedido
- `GET /pedidos` → Lista todos os pedidos
- Integração com transportadora externa (simulada)
- Cálculo de frete via Strategy
- Notificações automáticas com Observer

---

## 📐 Padrões de Projeto Aplicados

| Padrão     | Descrição |
|------------|-----------|
| **Adapter** | Permite que o sistema utilize a API da transportadora externa, mesmo com uma interface diferente. |
| **Strategy** | Permite alterar dinamicamente o cálculo do frete sem mudar o código principal. |
| **Observer** | Permite que várias ações (e-mail, log, notificações) sejam executadas automaticamente após um pedido ser processado. |

---

## 🧪 Como testar

1. Rode a aplicação com `mvn spring-boot:run`.
2. Faça uma requisição `POST`:

```
POST /pedidos
Content-Type: application/json

{
  "cliente": "Maria",
  "produto": "Notebook",
  "peso": 5.0,
  "tipoEntrega": "transportadora"
}
```

3. Verifique no console os logs de notificação, integração e cálculo de frete.


---

## 🌐 Endpoints disponíveis

A API REST expõe os seguintes endpoints para interação com o módulo de entregas:

| Método | Rota         | Descrição |
|--------|--------------|-----------|
| `GET`  | `/pedidos`   | Retorna uma lista com todos os pedidos cadastrados no sistema. |
| `POST` | `/pedidos`   | Registra um novo pedido de entrega. O corpo da requisição deve conter os dados do pedido no formato JSON. |

### Exemplo de uso do endpoint `POST /pedidos`

```http
POST /pedidos
Content-Type: application/json

{
  "cliente": "Maria",
  "produto": "Notebook",
  "peso": 5.0,
  "tipoEntrega": "transportadora"
}
```


---

## 👥 Integrantes do grupo

| Nome | Função |
|------|--------|
| Aluno 1 | Entidade Pedido |
| Aluno 2 | Strategy do frete |
| Aluno 3 | Adapter da transportadora externa |
| Aluno 4 | Observers (email, log, notificação) |
| Aluno 5 | Controller REST |
| Aluno 6 | Testes e documentação |

---

## 📄 Licença
Uso acadêmico - Exercício prático de padrões de projeto.

