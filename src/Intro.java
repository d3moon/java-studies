import java.util.ArrayList;

//1. Todo arquivo java deve declarar uma classe
//2. O nome que for declarar deve ser igual ao nome do arquivo
//3. o método main é obrigatório em toda classe criada em Java -> public static void main(String[] args)


public class Intro {
    public static void types(){
        int a = 5; // tipo inteiro -> 32 bits -> -2.147.483.648 a 2.147.483.647
        var b = 10; // inferência de tipo (Java 10+) -> o compilador deduz o tipo da variável
        byte c = 125; // tipo byte -> 8 bits -> -128 a 127
        short d = 32000; // tipo short -> 16 bits -> -32.768 a 32.767
        long e = 1000; // tipo long -> 64 bits -> -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

        float f = 5.75f; // tipo float -> 32 bits -> números de ponto flutuante (decimais)
        double g = 19.99; // tipo double -> 64 bits -> números de ponto flutuante (decimais)

        String word = "Hello"; // tipo String -> sequência de caracteres -> objeto construido a partir da classe String
        String[] nomes = new String[3];
        nomes[0] = "João";
        nomes[1] = "Maria";
        System.out.println(nomes[0]);


        char letter = 'A'; // tipo char -> 16 bits -> um único caractere

        boolean bool = true; // tipo boolean -> true ou false
        System.out.println(a);
    }


    public static void conditionals(){

        String input = "Hello";
        if (input.equals("Hello")) {
            System.out.println("Condition is true");
        } else if (input.equals("Hi")) {
            System.out.println("Condition is false in else if");
        }
        else {
            System.out.println("Condition is false");
        }
    }

    public static void vectors (){ // são arrays em Java
       /*
       * Quer criar e inicializar com valores? Use {}.
       * Quer criar um array e preencher depois? Use [] com tamanho.
       * Você não pode misturar os dois no mesmo momento.
       * Só com uso de ArrayList para criar arrays dinâmicos.
       * */

        int[] numbers = {1,2,3,4,5}; // criando e inicializando um array de inteiros
        int[] moreNumbers = new int[5]; // criando um array de inteiros com tamanho 5
        String[] words = new String[3]; // criando um array de Strings com tamanho

        words[0] = "Hello";
        System.out.println("Number of words: " + words.length);
        System.out.println("Number of words: " + words[0]);


    }

    public static void arrayList(){
        /*
        * ArrayList é uma classe em Java que implementa uma lista dinâmica.
        * Diferente dos arrays, que têm tamanho fixo, os ArrayLists podem crescer e encolher conforme necessário.
        * Eles fazem parte do pacote java.util e oferecem métodos convenientes para manipular a lista.
        * */

        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println("Number of items in the list: " + list.size()); // size() retorna o número de elementos na lista
        System.out.println("First item in the list: " + list.get(0)); // get() retorna o elemento na posição especificada
        System.out.println("Removing item: " + list.remove(0)); // remove() remove o elemento na posição especificada e retorna o elemento removido
    }

    public static void loops(){
        // for, while, do while

        int start = 2;

        for (int i = start; i == 2; i++){
            start--;
            System.out.println("For loop iteration: " + i);
        }

        start = 2;

        while (start == 2){
            start--;
            System.out.println("This is an infinite while loop");
        }


        do {
            System.out.println("This is an infinite do while loop");
            start--;
        } while (start == 2);


        int[] lista = {1,2,3,4,5};

        for(int num: lista){
            System.out.println("Número da lista: " + num);
        }

    }

    public static void casting(){
        /*
        * Type casting é o processo de converter um tipo de dado em outro.
        * Em Java, existem dois tipos principais de casting: casting implícito e casting explícito.
        * - Casting implícito ocorre quando o compilador converte automaticamente um tipo de dado menor para um tipo maior (por exemplo, de int para long).
        * - Casting explícito é quando o programador força a conversão de um tipo maior
        * - Uma classe wrapper é uma classe que encapsula um tipo de dado primitivo, fornecendo métodos e funcionalidades adicionais.
        * */

        int a = 100;
        long b = a; // casting implícito de int para long
        int c = (int) b; // casting explícito de long para int

        String numStr = "123";
        int num = Integer.parseInt(numStr); // casting explícito de String para int -> Interger é uma classe wrapper para o tipo primitivo int
        String numStrUpdated = Integer.toString(num); // convertendo int para String usando a classe wrapper Integer
        // verificando os tipos
        System.out.println(((Object) numStr).getClass().getSimpleName());       // String
        System.out.println(((Object) num).getClass().getSimpleName());          // Integer (autoboxing)
        System.out.println(((Object) numStrUpdated).getClass().getSimpleName()); // String

    }





    public static void main(String[] args) { // entry-point -> ponto de entrada de qualquer aplicação Java
        //types();
        //conditionals();
        //vectors();
        //arrayList();
        //loops();
        //casting();
    }
}
