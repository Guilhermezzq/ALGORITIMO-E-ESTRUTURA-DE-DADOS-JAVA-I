
 // SALÁRIO = VALOR FIXO + COMISSÃO COM IF E ELSE


import java.util.Scanner;

public class c06ex03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor das vendas mensais do vendedor: R$");
        double vendas = scanner.nextDouble();

        double salarioFixo = 240.0;
        double comissao = 0.0;
        double comissaofixa = 1000.00;

        if (vendas >= 0 && vendas <= 1000.0) {
            comissao = 0.0;
        } else if (vendas > 1000.0 && vendas <= 10000.00) {
            comissao = vendas * 0.1;
        } else if (vendas > 10000.00) {
            comissao = comissaofixa;i
        }

        double salarioMensal = salarioFixo + comissao;
        System.out.printf("Salário = R$%.2f", salarioMensal);
    }
}



/*
import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor das vendas mensais do vendedor: R$");
        double vendas = scanner.nextDouble();

        double salarioFixo = 240.0;
        double comissao = 0.0;
        double comecaofixo = 1.000.00;

        if (vendas >= 0 && vendas <= 1.000,00) {
            comissao = vendas * salarioFixo;
        } else if (vendas > 1.000.00 && vendas <= 10.000,00) {
            comissao = vendas * 0.1;
        } else if (vendas > 10.000,00 ) {
            comissao = vendas * 0.1;

        double salarioMensal = salarioFixo + comissao;
        System.out.printf("Salário = R$%.2f", salarioMensal);
    }
}
*/