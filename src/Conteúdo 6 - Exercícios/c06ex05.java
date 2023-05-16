
  // calcule e imprima se ele é divisível ao mesmo tempo por 5 e 7.

import java.util.Scanner;

public class c06ex05 {
    public static void main(String[] args) {
        Scanner divisivel = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = divisivel.nextInt();


        if (numero % 5 == 0 && numero % 7 == 0) {
            System.out.println("O número é divisível por 5 e 7 ao mesmo tempo.");
        } else {
            System.out.println("O número não é divisível por 5 e 7 ao mesmo tempo.");
        }

        divisivel.close();
    }
}