





import java.util.Scanner;

public class c05ex10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, n1, n2, n3, n4, n5 ;

        System.out.println("Informa um número inteiro com 5 digitos: ");
        numero = teclado.nextInt();
        n1 = numero / 10000;
        n2 = numero / 1000 % 10;
        n3= numero % 1000 / 100;
        n4 = numero % 100 / 10;
        n5 = numero % 10 ;


        System.out.println("Número lido = " +numero);
        System.out.println("--> Impressão = \n" +n1+"\n"+n2+"\n"+n3+"\n"+n4+"\n"+n5);
        teclado.close();
   }
}
