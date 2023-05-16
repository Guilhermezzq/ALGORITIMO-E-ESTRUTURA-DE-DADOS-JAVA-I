

  // calcule e imprima o valor de sua participação nos lucros
  // (PL Líquido) de acordo com a tabela e fórmulas abaixo:

import java.util.Scanner;

public class c06ex07
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o salário do empregado: ");
        double salario = input.nextDouble();

        double valorFixo = 0.0; // valor fixo da PL
        double percentual = 0.0; // percentual sobre o salário da PL

        if (salario <= 300.00) {
            valorFixo = 500.00;
            percentual = 0.7;
        } else if (salario > 300.00 && salario <= 1000.00) {
            valorFixo = 200.00;
            percentual = 0.5;
        } else if (salario > 1000.00){
            percentual = 0.3;
        }

        double plBruto = valorFixo + percentual * salario; // cálculo da PL bruto
        double impostoRenda = 0.25 * plBruto; // cálculo do imposto de renda
        double plLiquido = plBruto - impostoRenda; // cálculo da PL líquido

        System.out.println("PL Líquido: " + plLiquido ) ;
    }
}
