


import java.util.Scanner;

public class c05extra1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê um número inteiro de 4 dígitos
        System.out.print("Digite um número inteiro de 4 dígitos: ");
        int numero = scanner.nextInt();

        // Verifica se o número é um palíndromo
        int digito1 = numero / 1000;
        int digito2 = (numero / 100) % 10;
        int digito3 = (numero / 10) % 10;
        int digito4 = numero % 10;

        if (digito1 == digito4 && digito2 == digito3) {
            System.out.println(numero + " é um palíndromo");
        } else {
            System.out.println(numero + " não é um palíndromo");
        }

        scanner.close();
    }
}
