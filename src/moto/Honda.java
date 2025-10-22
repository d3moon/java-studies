package moto;

public class Honda implements Moto{

    private int vel;
    final int limit = 150;

    public Honda(int vel){
        this.vel = vel;
    }

    @Override
    public void acelerar() {
        if(this.vel < limit){
            vel += 10;
            System.out.println("Acelerando a moto Honda " + vel);
        } else {
            System.out.println("Moto Honda atingiu a velocidade máxima");
        }
    }


    @Override // sobrescrevendo o método da interface
    public void ligar() {
        System.out.println("Ligando a moto Honda");
    }
}
