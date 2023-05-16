

// Faça um programa que receba o valor de x, e calcule e imprima o valor
// e f(x) conforme a função abaixo.

import java.util.Scanner;

public class c06ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Recebe o valor de x
        System.out.print("Digite o valor de x: ");
        double x = input.nextDouble();

        // Calcula f(x) de acordo com a função dada
        double fx;
        if (x < -4 || x > 4) {
            fx = (5 * x + 3) / Math.sqrt(Math.pow(x, 2) - 16);
        } else {
            fx = 0;


        }

        // Imprime o valor de f(x)
        System.out.printf("O valor de f(%.2f) é: %.2f", x, fx);
    }
}
