



import java.util.Scanner;

public class c06ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantidade de bolas produzidas: ");
        int qtdBolas = input.nextInt();

        System.out.print("Quantidade de bolas com defeito: ");
        int qtdDefeito = input.nextInt();

        System.out.print("Preço unitário das caixas de papelão: ");
        double precoCaixa = input.nextDouble();

        System.out.print("Quantidade de meses até a Copa: ");
        int mesesCopa = input.nextInt();

        System.out.print("Valor mensal do aluguel do galpão: ");
        double valorAluguel = input.nextDouble();

        // Cálculo da quantidade de caixas necessárias para estocar todas as bolas
        int qtdCaixas = (int) Math.ceil((double) (qtdBolas - qtdDefeito) / 10);

        // Cálculo da quantidade de galpões necessários para a estocagem
        int qtdGalpoes = (int) Math.ceil((double) qtdCaixas / 850);

        // Cálculo do custo total de embalagem
        double custoEmbalagem = qtdCaixas * precoCaixa;

        // Cálculo do custo total de estocagem
        double custoEstocagem = qtdGalpoes * valorAluguel * mesesCopa;

        // Cálculo do custo total
        double custoTotal = custoEmbalagem + custoEstocagem;

        // Impressão dos resultados

        System.out.printf("Custo total: R$ %.2f%n", custoTotal);

        input.close();
    }
}
