import java.util.Scanner;
public class c07ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int  nota1, nota2, nota3;

        System.out.print("Digite sua primeira nota entre 0 e 10: ");
        nota1 = teclado.nextInt();

        System.out.print("Digite sua segunda nota entre 0 e 10: ");
        nota2 = teclado.nextInt();

        System.out.print("Digite sua terceira nota entre 0 e 10: ");
        nota3 = teclado.nextInt();

        int notaFinal = (nota1 + nota2 + nota3 )/ 3;
        System.out.println("Nota final: " + notaFinal);



        switch (notaFinal) {


            case 9,10 -> System.out.println("Conceito A");

            case 8 -> System.out.println("Conceito B");

            case 7 -> System.out.println("Conceito C");

            case 5,6 -> System.out.println("Conceito D");

            case 1,2,3,4 -> System.out.println("Conceito E");

            default ->
                    System.out.println("Notas invalidas");




        }
        teclado.close();

    }
}
