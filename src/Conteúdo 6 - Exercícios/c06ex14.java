
  //  Faça um programa com número inteiro de 4 digitos e imprima de trás para
  // frente usando Decomposição Numérica


import java.util.Scanner;

public class c06ex14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro de 4 dígitos: ");
        int num = input.nextInt();

        if (num < 1000 || num > 9999) {
            System.out.println("NÚMERO TEM QUE TER 4 DÍGITOS");
        } else {
            int d1 = num % 10;  // Obtém o último dígito
            int d2 = (num / 10) % 10;  // Obtém o penúltimo dígito
            int d3 = (num / 100) % 10;  // Obtém o antepenúltimo dígito
            int d4 = (num / 1000);  // Obtém o primeiro dígito

            System.out.printf("%d%d%d%d\n", d1, d2, d3, d4);
        }

        input.close();
    }
}



