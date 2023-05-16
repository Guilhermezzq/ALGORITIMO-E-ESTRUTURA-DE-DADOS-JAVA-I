import java.util.Scanner;
public class BugJava {
    public static void main(String[] args) {
        int idade;
        String nome;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe sua idade: ");
        idade = teclado.nextInt();
        teclado.nextLine(); // Acrescentar uma linha após utilizar uma variável
        // "int, long e double";
        System.out.print("Informe seu nome: ");
        nome = teclado.nextLine();
        teclado.close();
    }
}
