
   // Sobrenome, PrimeirNome, SegundoNome

import java.util.Scanner;


public class c04ex01 {
    public static void main(String[] args) {
        String PrimeiroNome , SegundoNome, SobreNome;
        int idade = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual seu Primeiro nome: ");
        PrimeiroNome = teclado.nextLine();
        System.out.print("Qual seu Segundo nome: ");
        SegundoNome= teclado.nextLine();
        System.out.print("Qual seu Sobrenome: ");
        SobreNome= teclado.nextLine();

        System.out.print("Qual sua idade: ");
        idade = teclado.nextInt();

        System.out.println(PrimeiroNome + ", " + SegundoNome + ", " + SobreNome);
        System.out.println("Idade: "+idade+" anos.");




    }
}
