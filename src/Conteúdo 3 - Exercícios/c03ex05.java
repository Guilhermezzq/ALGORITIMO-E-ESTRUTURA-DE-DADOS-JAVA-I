
    // CalcIdade - Exercicio 5


import java.util.Scanner;


public class c03ex05 {
    public static void main(String[] args) {
        String nome = "";
        int anoNasc = 0, anoAtual = 0, idade = 0 ;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();

        System.out.print("Digite o ano em que você nasceu: ");
        anoNasc = teclado.nextInt();

        System.out.print("Digite o ano em que estamos: ");
        anoAtual =  teclado.nextInt();

        idade = anoAtual - anoNasc;

        System.out.println(nome+", você tem/terá "+idade+" anos em "+anoAtual);






        // Criei esse aqui só para Praticar um pouco e ver se estou aprendendo mesmo...!

        int ano_nasc = 0, mesNasc = 0, diaNasc = 0 ;

        System.out.print("Digite o ano do seu nascimento: ");
        ano_nasc = teclado.nextInt();

        System.out.print("Digite o mês do seu nascimento: ");
        mesNasc = teclado.nextInt();

        System.out.print("Digite o dia do seu nascimento: ");
        diaNasc = teclado.nextInt();

        System.out.println("Minha data de nascimento é " + diaNasc + "/" + mesNasc + "/" + ano_nasc);

        teclado.close();
    }
}

