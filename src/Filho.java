public class Filho extends Pai{

    public Filho(){
        /*
        * Chamar o construtor da superclasse:
        * Acessar métodos da superclasse que foram sobrescritos:
        * Acessar atributos da superclasse quando há conflito de nomes:
        * */
        super(20); // super chama o construtor da classe Pai
    }

    @Override
    public void respirar() {
        System.out.println("Respirando");
    }

    public void quantosAnos(){
        System.out.println("Eu tenho " + this.idade + " anos");
    }

}
