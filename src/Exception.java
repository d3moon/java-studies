import carro.Carro;

public class Exception {

    public static void main(String[] args) {
        Carro carroParado = null;
        try {
            carroParado.acelerar();
        } catch (NullPointerException e) {
            System.out.println("Não existe esse método");
        }
    }

}
