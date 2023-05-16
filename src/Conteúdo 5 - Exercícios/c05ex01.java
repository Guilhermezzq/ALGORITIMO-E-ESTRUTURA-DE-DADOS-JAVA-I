


 // Função f(X)


import java.util.Scanner;

public class c05ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valordex, funcaox, x;

        System.out.print("Qual valor de x: ");
        valordex = teclado.nextInt();
        x = valordex;

        funcaox = (int) Math.pow(x, 3) + 4 * x + 10;
        System.out.print("f(x) = " + funcaox);

        teclado.close();
    }
}


/* Calcule a soma dos números
        double soma = n1 + n2 + n3 + n4 + n5;

 Calcule a média aritmética
        double media = soma / 5;


 */