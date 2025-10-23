package com.d3moon.carro;

public class Carro implements Model {
    String cor;
    String ano;

    public Carro(String cor, String ano) {
        this.cor = cor;
        this.ano = ano;
    }

    void message() {
        System.out.println("A cor do carro é " + this.cor + " e o ano é " + this.ano + ".");
        System.out.println("A pintura desse carro é: " + this.pintura());
    }

    public static void main(String[] args) {
        Carro carro = new Carro("vermelho", "2022");
        carro.message();
    }
}