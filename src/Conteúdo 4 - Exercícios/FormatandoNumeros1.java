
      // Formatando números com DecimalFormt

import java.text.DecimalFormat;
import java.util.Scanner;

public class FormatandoNumeros1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor = 55000.555;
        String valorFormatado;


        valorFormatado = new DecimalFormat("#,##0.000").format(valor);
        System.out.println("Valor = " +valorFormatado);

        valorFormatado = new DecimalFormat("R$ #,##0.00").format(valor);
        System.out.println("Valor="+valorFormatado);

        valorFormatado = new DecimalFormat("#,##0.0").format(valor);
        System.out.println("Valor= "+valorFormatado);
    }
}
