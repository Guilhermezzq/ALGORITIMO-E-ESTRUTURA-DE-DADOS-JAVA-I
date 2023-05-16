
  // Nota Final = Média aritmética das duas maiores Notas das Provas X Peso1
  // + Nota do Trabalho Final X Peso2


import java.util.Arrays;
import java.util.Scanner;


  public class c06ex16 {
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          // Leitura dos valores de entrada
          System.out.print("Digite o número de faltas: ");
          int faltas = input.nextInt();

          System.out.print("Digite as notas das três provas (separadas por espaço): ");
          double[] provas = new double[3];
          for (int i = 0; i < 3; i++) {
              provas[i] = input.nextDouble();
          }

          System.out.print("Digite a nota do trabalho final: ");
          double trabalhoFinal = input.nextDouble();

          System.out.print("Digite a idade do aluno: ");
          int idade = input.nextInt();

          // Cálculo da nota final
          double peso1 = 0.8;
          double peso2 = 0.2;
          double[] notasProvas = Arrays.copyOf(provas, provas.length);
          Arrays.sort(notasProvas);
          double notaFinal = ((notasProvas[1] + notasProvas[2]) / 2) * peso1 + trabalhoFinal * peso2;

          // Verificação do resultado
          if (faltas > 10 || notaFinal < 6.0 || idade < 18 || idade > 60) {
              System.out.println("Resultado: Reprovado");
          } else if (notaFinal >= 9.0) {
              System.out.println("Resultado: Excelente");
          } else if (notaFinal >= 7.0) {
              System.out.println("Resultado: Bom");
          } else {
              System.out.println("Resultado: Regular");
          }

          input.close();
      }
  }