class Main {

        public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static void main(String args[]) {
        String str = "Hello World";

        if (str.contains("H")) {
            str = "Hello Universe. Looping in: ";
        }

        String[] arr = { "one", "two", "three" };

        for (int i = 0; i < arr.length; i++) {
            str += " " + arr[i];
        }

        switch (arr.length) {
            case 1:
                str += " (1 element)";
                break;
            case 2:
                str += " (2 elements)";
                break;
            default:
                str += " \n(" + arr.length + " elements)";
                break;
        }

        while (str.length() < 3) {
            str += " .";
        }

        str = "Sopa";

        // Invertendo caracteres da string de forma eficiente
        String letters = "abc";
        String newLetters = new StringBuilder(letters).reverse().toString();

        // Outra forma de inverter menos eficiente
        char[] charArray = letters.toCharArray();
        String reversed = "";

        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed += charArray[i];
        }

        System.out.println(newLetters);
        System.out.println(reversed);

        System.out.println(str.toUpperCase());

        int result = sum(10);
        System.out.println(result);

        for (int i = 10; i >= 0; i--) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        int number = 10;
        do {
            System.out.println(number);
            number--;
        } while (number > 0);

        double five = 5;
        System.out.println(Math.sqrt(five)); // Raiz quadrada
        System.out.println(Math.pow(five, 2)); // Potencia
        System.out.println(Math.ceil(five));  // Arredonda para cima
        System.out.println(Math.abs(five));  // Valor absoluto
        System.out.println(Math.floor(five)); // Arredonda para baixo
        System.out.println(Math.round(five)); // Arredonda para o inteiro mais próximo


    }

}