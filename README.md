# Prototype Pattern - Java

Este projeto demonstra o uso do **padrão de projeto Prototype** em Java, aplicado a um sistema de pedidos com endereço de entrega.

## 📌 Estrutura


  ***DIAGRAMA DE CLASSES***

  <img width="2396" height="1352" alt="597890519-34579130-9bd3-4f57-88a9-08b569b252d4" src="https://github.com/user-attachments/assets/b365524c-d983-45a9-994a-0fba91c21b16" />


- **Interface**
  - `Cloneable` → utilizada para permitir clonagem de objetos.

- **Classes concretas**
  - `EnderecoEntrega` → representa o endereço de entrega de um pedido.  
    Implementa `clone()` para permitir cópia profunda.
  - `Pedido` → representa um pedido com código, descrição, cliente e endereço.  
    Implementa `clone()` para duplicar pedidos mantendo independência dos objetos.

- **Classe de execução**
  - `Main` → instancia um pedido original, realiza clonagem e demonstra a independência entre os objetos.

## 🚀 Como executar

1. Abra o projeto no **IntelliJ IDEA**.
2. Certifique-se de que os arquivos estão em `src/prototype`.
3. Execute a classe `Main`.

## 💻 Saída esperada

Pedido #1 - Notebook Gamer | Cliente: Vinícius | Endereço: Rua das Flores, 123
Pedido #2 - Notebook Gamer | Cliente: Maria | Endereço: Rua das Flores, 456
Pedido Original após clone: Pedido #1 - Notebook Gamer | Cliente: Vinícius | Endereço: Rua das Flores, 123


## 🎯 Objetivo

O padrão **Prototype** permite criar novos objetos a partir de cópias de instâncias existentes, sem depender de suas classes concretas.  
Neste exemplo, o `Pedido` é clonado junto com seu `EnderecoEntrega`, garantindo que alterações no clone não afetem o objeto original.
