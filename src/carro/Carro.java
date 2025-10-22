package carro; // definindo um pacote

public class Carro {
    public  String modelo; // atributo da classe -> característica ou propriedade do objeto -> public para export o atributo para outras classes externas ao pacote.

    // método construtor
    public Carro(String modelo) { // construtor com parâmetro
        this.modelo = modelo; // inicializando o atributo modelo com o atributo passado como parâmetro
    }

    // métodos da classe -> ações ou comportamentos do objeto

    public String acelerar() {
        ligar(); // chamando o método privado ligar()
        return "O carro " + modelo + " está acelerando."; // retornando uma string indicando que o carro está acelerando
    }

    public void frear() {
        System.out.println("O carro " + modelo + " está freando."); // imprimindo uma mensagem indicando que o carro está freando
    }

    private void ligar() {
        System.out.println("O carro " + modelo + " está ligado."); // imprimindo uma mensagem indicando que o carro está ligado
    }


    /**
     * Modificadores de acesso: São palavras-chave que definem a visibilidade e o acesso aos membros (atributos e métodos) de uma classe.
     * public: acessível de qualquer lugar.
     * private: acessível apenas dentro da própria classe.
     * protected: quem está no mesmo pacote ou é subclasse (extends) acessa, mesmo que esteja em outro pacote.
     * default (sem modificador): acessível apenas dentro do mesmo pacote.
     *
     * Pacotes: São usados para organizar classes relacionadas em grupos. Eles ajudam a evitar conflitos de nomes e facilitam a manutenção do código.
     * Declaração de pacote: A declaração do pacote deve ser a primeira linha do arquivo Java, antes de qualquer importação ou declaração de classe.
     * Exemplo: package com.exemplo.meupacote;
     * Respeitam a estrutura de diretórios do sistema de arquivos.
     *
     *
     */
}
