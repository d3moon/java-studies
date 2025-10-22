public abstract class Pai {

    protected int idade;
    public Pai(int idade){
        this.idade = idade;
    }

    public void dormir(){
        System.out.println("Dormindo");
    }

    public abstract void respirar(); // O abstract nesse método significa que ele não tem implementação na classe abstrata e obriga qualquer classe que herde essa classe a implementar o método respirar().


}
