// Quantidade de Poluente emitido / Valor da Multa em R$



import java.util.Scanner;

public class c06ex02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de poluentes emitidos: ");
        double poluentes = scanner.nextDouble();

        double multa = calcularMulta(poluentes);

        System.out.printf("Multa = R$%.2f", multa);
    }

    public static double calcularMulta(double poluentes) {
        double multa = 0.0;
        if (poluentes <= 750.0) {
            multa = 0.0;
        } else if (poluentes > 750.0 && poluentes <= 2820.24) {
            multa = 3000.0;
        } else {
            multa = (poluentes * 5000.00);
        }
        return multa;
    }
}
