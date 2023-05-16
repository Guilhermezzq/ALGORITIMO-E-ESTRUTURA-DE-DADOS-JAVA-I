
    // Pela fórmula de Báskara

import java.util.Scanner;

public class c06ex06 {
    public static void main(String[] args) {
        Scanner calculo = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = calculo.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = calculo.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = calculo.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta >= 0) {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("teremos 1 raiz = " + raiz1);
            System.out.println("teremos 2 raizes = : " + raiz2);
        } else {
            System.out.println("Não existem raízes reais para a equação.");
        }

        calculo.close();
    }
}
 /*
                        Formula de Báskara
 import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Não há raízes reais.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("A única raiz é: " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes são: " + x1 + " e " + x2);
        }

        scanner.close();
    }
}

  */