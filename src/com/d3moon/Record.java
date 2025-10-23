package com.d3moon;

//Um record é um tipo especial de classe introduzido no Java 14 (estável no Java 16) para criar classes imutáveis e simples que servem para armazenar dados.
//É como uma classe normal, mas com menos código, porque o Java gera automaticamente vários métodos úteis.
//Pense em um record como uma ficha técnica que guarda informações (ex.: nome, idade) e não deixa mudar esses dados depois de criados.

//Esse código é equivalente a uma classe com:
//
//Atributos finais (imutáveis): cor e ano.
//Um construtor automático que recebe cor e ano.
//Getters automáticos: cor() e ano() (não usa "get" no nome).
//Métodos toString(), equals(), e hashCode() gerados automaticamente.

//Um DTO é um objeto simples usado para transferir dados entre camadas de uma aplicação (ex.: do backend para o frontend ou entre serviços). Ele contém apenas:
//
//Atributos (dados, como cor, ano).
//        Getters e, às vezes, setters.
//Nenhum ou pouco comportamento (métodos complexos).
//
//Records em Java são perfeitos para DTOs porque:
//
//São imutáveis (os dados não mudam após criados, ideal para transferências seguras).
//Geram automaticamente:
//
//        Construtor.
//Getters (ex.: cor() ao invés de getCor()).
//Métodos toString(), equals(), hashCode().
//
//
//Reduzem o código repetitivo (boilerplate).

public record Record(String fruta, Integer cor) {}
