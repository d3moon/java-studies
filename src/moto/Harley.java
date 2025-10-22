package moto;

public class Harley implements Moto{
    private int vel = 0;

    public Harley(int vel){
        this.vel = vel;
    }
    final int limit = 150; // final define que o valor é fixo e final, não há alterações

    @Override
    public void acelerar() {
        if(this.vel < limit){
            vel += 10;
            System.out.println("Acelerando a moto Harley " + vel);
        } else {
            System.out.println("Moto Harley atingiu a velocidade máxima");
        }
    }

    @Override
    public void ligar() {
        System.out.println("Ligando a moto Harley");
    }

}
