# PRJ_AbstractFactory

Este projeto implementa o padrão de projeto **Abstract Factory** em Java, com um exemplo exclusivo e didático, voltado para fins acadêmicos.

## Objetivo

Demonstrar a aplicação do padrão Abstract Factory por meio de uma estrutura de código que cria famílias de objetos relacionados sem depender de suas classes concretas.

## Estrutura do Projeto

- `factories/`: contém a interface abstrata e as fábricas concretas
- `products/`: contém os produtos abstratos e suas implementações
- `App.java`: classe principal com o método `main()`

## Sobre o Abstract Factory

O padrão Abstract Factory é útil quando:

- Precisamos garantir que objetos criados em conjunto são compatíveis
- Desejamos isolar o código cliente das classes concretas de produtos

Neste projeto, cada "fábrica" representa um conjunto de produtos relacionados (por exemplo, para diferentes plataformas ou estilos de interface).

## Tecnologias Utilizadas

- Java 11+
- Padrão de Projeto: Abstract Factory
- IDE recomendada: NetBeans ou IntelliJ

