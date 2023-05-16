




import java.util.Scanner;
public class c05ex11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int banco,agencia, sequencial, numerodocheque;

        System.out.print("Informe o número do cheque: ");
        numerodocheque = teclado.nextInt();

        banco = numerodocheque / 1000000;
        agencia = numerodocheque / 1000 % 1000;
        sequencial = numerodocheque / 10 % 1000   ;

        System.out.println("Banco = "+banco+"\nAgencia = "+agencia+"\nSequencial = "+sequencial);













    }
}
