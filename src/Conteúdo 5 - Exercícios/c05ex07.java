


import java.util.Scanner;
public class c05ex07 {
    public static void main(String[] args) {
        Scanner  teclado = new Scanner(System.in);
        System.out.println("Digite o valor de x: ");
        double x = teclado.nextDouble();

        double resultado = Math.sqrt((Math.pow((x / 4 + 1), 2 ))  +(  x * (1/5.0)));
        System.out.println("f(x)=" + resultado);

        teclado.close();

    }
}
