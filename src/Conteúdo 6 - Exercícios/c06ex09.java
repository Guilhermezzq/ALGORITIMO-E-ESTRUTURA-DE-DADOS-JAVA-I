

   // (“F” para feminino e “M” para masculino), faça um programa que
   // calcule o peso ideal da mesma,

import java.util.Scanner;

public class c06ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a altura da pessoa em metros: ");
        double altura = input.nextDouble();

        System.out.print("Digite o sexo da pessoa (F para feminino e M para masculino): ");
        String sexo = input.next();

        double pesoIdeal;

        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = 72.7 * altura - 58;
        } else if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal = 62.1 * altura - 44.7;
        } else {
            System.out.println("Sexo inválido.");
            return;
        }

        System.out.printf("O peso ideal para uma pessoa com %.3f m de altura e sexo %s é %.3f kg.", altura, sexo, pesoIdeal);
        
    }
}
