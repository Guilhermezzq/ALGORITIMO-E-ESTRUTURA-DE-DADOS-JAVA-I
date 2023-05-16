



import java.util.Scanner;

public class c05ex03 {
    public static void main(String[] args) {
        Scanner imposto = new Scanner(System.in);

        System.out.print("Informe o salário: ");
        double salario = imposto.nextDouble();

        System.out.print("Informe o número de dependentes: ");
        int dependentes = imposto.nextInt();

        double liquido = salario - (dependentes * 60.00);
        double impostoDeRenda = 0.15 * liquido;

        System.out.printf("O valor a ser retido de Imposto de Renda é R$%.2f", impostoDeRenda);
    }
}
