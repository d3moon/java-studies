package com.d3moon.carro;

// Classe Gol usando Generics
public class Gol<E extends Carro> {
    final String nome = "Gol";
    private final E carro; // Guarda um carro do tipo E

    // Construtor que recebe um carro do tipo E
    public Gol(E carro) {
        this.carro = carro;
    }

    void golMessage() {
        System.out.println("Nome: " + nome);
        carro.message(); // Chama o método message do carro
    }

    public static void main(String[] args) {
        // Cria um carro
        Carro carro = new Carro("vermelho", "2022");
        // Passa o carro para o construtor de Gol
        Gol<Carro> gol = new Gol<>(carro);
        gol.golMessage();
    }
}