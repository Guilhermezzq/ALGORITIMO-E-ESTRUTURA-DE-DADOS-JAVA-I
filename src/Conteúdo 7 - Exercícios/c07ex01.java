
import java.util.Scanner;
public class c07ex01 {
    public static void main(String[] args) {

        int acertos;
        String nome ;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual seu nome: ");
        nome = teclado.nextLine();

        System.out.print("Quantidade de Jogos que voce acertou: ");
        acertos = teclado.nextInt();




        switch (acertos) {

            case 1,2,3,4,5 ->
                System.out.print( nome+ " recebi nenhuma premiação ");

            case 6,7,8,9,10 ->
                System.out.print(nome+ " ganha outro cartao ");

            case 11 ->
                System.out.printf(nome+ " recebi R$100,00");

            case 12 ->
                System.out.printf(nome+ " recebi R$1.000,00");

            case 13 ->
                System.out.printf(nome+ " recebi R$50.000,00");

            default ->
                System.out.println("Codigo do mês invalido!");

        }
        teclado.close();
    }
}
