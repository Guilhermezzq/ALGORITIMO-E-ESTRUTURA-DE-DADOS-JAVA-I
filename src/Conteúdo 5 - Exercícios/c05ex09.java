




import java.util.Scanner;
public class c05ex09 {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);

        System.out.print("Qual valor da nota 1: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Qual valor da nota 2: ");
        double nota2 = teclado.nextDouble();

        System.out.print("Qual valor da nota 3: ");
        double nota3 = teclado.nextDouble();

        double mediaponderada = (nota1 * 2 + nota2 * 3  + nota3 * 5) / 10;
        System.out.print("Média = " +mediaponderada);

        teclado.close();
    }
}