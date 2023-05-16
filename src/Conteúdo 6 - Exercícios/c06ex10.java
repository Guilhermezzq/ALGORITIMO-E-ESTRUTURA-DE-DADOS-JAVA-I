
  // Rendimento = Capital Aplicado  x  Taxa Diária  x  Número de Dias
  //Imposto de Renda = 15%  sobre o Rendimento
  //Valor Resgatado = Capital Aplicado + Rendimento – IR – Taxa de Administração

  /*
import java.util.Scanner;

public class c06ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // entrada dos dados pelo usuário
        System.out.print("Digite o valor do capital aplicado: ");
        double capitalAplicado = sc.nextDouble();

        System.out.print("Digite o número de dias que ficou aplicado: ");
        int numeroDias = sc.nextInt();

        System.out.print("Digite a taxa diária em percentual: ");
        double taxaDiaria = sc.nextDouble() / 100;

        sc.close();

        // cálculo do rendimento
        double rendimento = capitalAplicado * taxaDiaria * numeroDias;

        // cálculo do imposto de renda
        double impostoRenda = rendimento * 0.15;

        // cálculo do valor resgatado
        double valorResgatado = capitalAplicado + rendimento - impostoRenda - 10.0;

        // impressão dos resultados

        System.out.printf("Valor Resgatado: R$%.2f\n", valorResgatado);
    }
}
*/

  import java.util.Scanner;

  public class c06ex10 {
      public static void main(String[] args) {
          Scanner leitor = new Scanner(System.in);

          // entrada dos dados pelo usuário
          System.out.print("Digite o valor do capital aplicado: ");
          double capitalAplicado = leitor.nextDouble();

          System.out.print("Digite o número de dias que ficou aplicado: ");
          int numeroDias = leitor.nextInt();

          System.out.print("Digite a taxa diária em percentual: ");
          double taxaDiaria = leitor.nextDouble() / 100;

          leitor.close();

          // cálculo do rendimento
          double rendimento = capitalAplicado * taxaDiaria * numeroDias;

          // cálculo do imposto de renda
          double impostoRenda = rendimento * 0.15;

          // cálculo do valor resgatado
          double valorResgatado = capitalAplicado + rendimento - impostoRenda - 10.0;

          // impressão dos resultados

          System.out.printf("Valor Resgatado: R$%.2f\n", valorResgatado);
      }
  }