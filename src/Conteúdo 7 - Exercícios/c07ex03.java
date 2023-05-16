import java.util.Scanner;

public class c07ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int diasAtraso, imposto;
        double calculMulta = 0;

        System.out.print("Qual valor do imposto: ");
        imposto = teclado.nextInt();

        System.out.print("Qual o número de dias de atraso: ");
        diasAtraso = teclado.nextInt();

        switch (diasAtraso) {
            case 1, 2, 3, 4, 5 ->
                calculMulta = 0;

            case 6, 7, 8 ->
                calculMulta = imposto * 0.2;

            case 9, 10 ->
                calculMulta = imposto * 0.10 +( 0.5 * diasAtraso);

            default ->
                calculMulta = imposto * 1.5 +(1.00 * diasAtraso) ;

        }

        System.out.printf("O valor da multa a ser paga é R$%.2f.", calculMulta);
    }
}
