
//Faça um programa que leia o número referente a algum mês do ano
//, e imprima a que trimestre ele pertence.

     //  Trimestre utlizando If


import java.util.Scanner;
public class Exemplo1 {
    public static void main(String[] args) {
        int mes;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com o número do mês: ");
        mes = teclado.nextInt();
        if (mes < 1 || mes > 12)
            System.out.println("Código do mês inválido");
        else if (mes <= 3)
            System.out.println("Mês pertence ao 1º trimestre");
        else if (mes <= 6)
            System.out.println("Mês pertence ao 2º trimestre");
        else if (mes <= 9)
            System.out.println("Mês pertence ao 3º trimestre");
        else
            System.out.println("Mês pertence ao 4º trimestre");
        teclado.close();
    }
}

    // Trismetre Utilizando Switch

/*


import java.util.Scanner;
public class TrimestreSwitchNovo {
    public static void main(String[] args) {
        int mes;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com o número do mês: ");
        mes = teclado.nextInt();
        switch (mes) {
            case 1, 2, 3 ->
                    System.out.println("Mês pertence ao 1º trimestre");
            case 4, 5, 6 ->
                    System.out.println("Mês pertence ao 2º trimestre");
            case 7, 8, 9 ->
                    System.out.println("Mês pertence ao 3º trimestre");
            case 10, 11, 12 ->
                    System.out.println("Mês pertence ao 4º trimestre");
            default ->
                    System.out.println("Código do mês inválido");
        }
        teclado.close();
    }
}

 */