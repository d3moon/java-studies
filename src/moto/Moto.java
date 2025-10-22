package moto;

/*
* Uma interface em Java é um contrato.
* Define métodos que uma classe deve implementar, mas não implementa a lógica (antes do Java 8, depois disso pode ter métodos default com implementação).
* Serve para garantir que diferentes classes compartilhem um conjunto de comportamentos.
* Uma classe usa implements para seguir a interface.
* */

public interface Moto {
    void acelerar();
    default void ligar(){
        System.out.println("Ligando a moto");
    }
}
