

 // Quantidade de Poluente Emitido x Valor da Multa

import java.util.Scanner;

public class c04ex03 {
    public static void main(String[] args) {

        float multa1 = 0 , multa2 = 0 , multa3 = 0;
        int numero2000 = 0 , numero4500 = 0 ;


        Scanner scanner = new Scanner(System.in);





        System.out.print("Quantidade de Poluentes Emitidos: ");
        numero2000 = scanner.nextInt();

        System.out.print("Valor da multa: ");
        multa1 = scanner.nextFloat();

        // 1 linha tabela



        System.out.print("Quantidade de Poluentes Emitidos acima de 1500 até 3000: ");
        numero2000 = scanner.nextInt() ;

        System.out.print("Quantidade de Poluentes Emitidos acima de 1500 até 3000: ");
        numero4500 = scanner.nextInt() ;


        System.out.print("Valor da multa: ");
         multa2 = scanner.nextFloat();

         // 2 linha tabela

        System.out.print("Poluentes emitidos acima de 3000: ");
        numero4500 = scanner.nextInt();

        System.out.print("Valor da multa: ");

        multa3 = scanner.nextFloat();System.out.println(".........Quantidade de Poluente Emitido x Valor da Multa...........");
        System.out.println("Até "+numero2000+" multa de R$"+multa1);
        System.out.println("Acima de "+numero2000+" até "+numero4500+" multa de R$"+multa2);
        System.out.println("Acima de "+numero4500+" multa de R$"+multa3+" por poluente emitido");

        scanner.close();






    }
}
