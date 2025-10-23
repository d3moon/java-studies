package com.d3moon;
import com.d3moon.carro.Carro;
import com.d3moon.carro.Gol;

import java.util.*;

public class Main {

    public static void collection(){
        /*
        * Map -> Objetos que armazenam chave/valor
        * Set -> Objetos que não permite duplicatas
        * List -> Lista de elementos ordenados que aceitam repetição
        * Queue -> Fila de objetos e elementos processadas em ordem de chegada
        *
        * Todas essas collections são interfaces que podem ser estendidas para adicionar mais features. Ex: implements Set
        * */

        // Lista inicializada com valor fixo
        List<Integer> lista = List.of(1,2,3,4);
        System.out.println(lista.get(0));

        //Lista dinâmica
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(2);
        lista2.add(2);
        lista2.add(4);
        System.out.println(lista2.get(0));


        /*
        * HashSet é uma coleção que:
        * Não permite elementos duplicados.
        * Não mantém ordem dos elementos.
         * Usa hashing internamente para armazenar os itens de forma rápida.
        */
        Set<String> setList = new HashSet<>();
        setList.add("Teste");
        setList.add("Teste");
        System.out.println(setList); // retorna só o elemento unico
        System.out.println(setList.contains("Teste"));

        Map<Integer, String> mapping = new HashMap<>();

        mapping.put(1, "test1"); // adicionando chave/valor
        mapping.remove(1); // removendo
        System.out.println(mapping.get(1));


        // Tipagem de fila: FIFO
        Queue<String> queue = new LinkedList<>();
        queue.add("test1");
        queue.add("test2");
        System.out.println(queue.poll()); // remove primeiro elemento
        System.out.println(queue);
        System.out.println(queue.peek()); // acessar o primeiro elemento
        System.out.println(queue.remove()); // remove o primeiro elemento, lançando uma exceção
        // System.out.println(queue.remove()); // remove o primeiro elemento, lançando uma exceção

        // Tipagem de lista:
        // Permite acesso aleatório (ex.: get(índice)).
        // Pode adicionar/remover em qualquer posição (ex.: add(índice, elemento)).
        // Mais flexível, mas pode ser menos eficiente para operações de fila

        List<String> list = new LinkedList<>();

        // Adiciona elementos na lista
        list.add("Maçã");    // Posição 0
        list.add("Banana");  // Posição 1
        list.add("Laranja"); // Posição 2

        // Acessa elemento na posição 1
        System.out.println("Elemento na posição 1: " + list.get(1)); // Imprime: Banana

        // Adiciona um elemento na posição 1
        list.add(1, "Uva"); // Desloca "Banana" e "Laranja" para a direita

    }

    public static void streams(){
        // Stream API

        List<String> items = List.of("item1", "item2", "item3", "item4");

        // Filtra itens que contêm "1" e imprime
        items.stream()
                .filter(item -> item.contains("1")) // filtra itens que contêm "1"
                .forEach(System.out::println); // imprime os itens filtrados através dessa função

        // Mapeia itens para maiúsculas e coleta em uma nova lista
        List<String> upperItems = items.stream()
                .map(String::toUpperCase) // mapeia cada item para maiúsculas
                .toList(); // coleta os resultados em uma nova lista
        System.out.println(upperItems);

        // Reduz a lista de itens concatenando-os em uma única string
        String concatenated = items.stream()
                .reduce("", (acc, item) -> acc + item + " "); // reduz a lista concatenando os itens
        System.out.println(concatenated.trim());

        // Exemplo com set
        Set<Integer> numbers = Set.of(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0) // filtra números pares
                .mapToInt(Integer::intValue) // mapeia para int
                .sum(); // soma os números filtrados
        System.out.println("Soma dos números pares: " + sum);
        
    }

    public static void main(String[] args){
        Carro carro = new Carro("vermelho", "2022"); // Cria um carro do tipo da classe Carro
        Gol<Carro> gol = new Gol<>(carro); // Cria um carro do tipo Gol, passando o carro como parâmetro do construtor Gol
        //gol.golMessage(); // Aqui ele não executa o método pois só está disponível dentro do pacote que ele pertence (package private)
        collection();

        // Instanciando record
        Record record = new Record("morango", 23);
        System.out.println(record.fruta() + " " + record.cor());
        streams();
    }
}
