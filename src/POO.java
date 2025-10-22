import carro.Carro; // importando o pacote
import moto.Harley;
import moto.Honda;

public class POO {

    /*
    * A POO (Programação Orientada a Objetos) no Java serve pra organizar o código de forma mais modular, reutilizável e fácil de manter.
     * construtor -> método especial usado para inicializar objetos de uma classe. Tem o mesmo nome da classe e não possui um tipo de retorno.
    *               - Ele é chamado automaticamente quando um objeto da classe é criado.
    *               - Ele é public para que possa ser acessado de outras classes.
    * */


    public static void main(String[] args) {
        Carro carro = new Carro("Fusca"); // criando um objeto da classe Carro usando o construtor
        Carro carro2 = new Carro("Gol");
        carro.frear();
        System.out.println("Modelo do carro 1: " + carro.modelo);
        System.out.println("Modelo do carro 2: " + carro2.acelerar());

        // Intanciando o objeto Honda

        /*
         * Polimorfismo -> Polimorfismo é a capacidade de um objeto se comportar de várias formas dependendo do contexto.
         * Nesse caso temos uma interface definindo um contrato para as classes Honda e Harley.
         * As respectivas classes atribuem valores aos seus métodos de forma diferente.
         *
         */


        Honda honda1 = new Honda(100);
        honda1.acelerar();
        honda1.ligar();

        Harley harley1 = new Harley(200);
        harley1.acelerar();
        harley1.ligar();


        // Instanciando a classe Filho herdada de features do Pai
        Filho filho = new Filho();
        filho.dormir();
        filho.respirar();
        filho.quantosAnos();




    }
}