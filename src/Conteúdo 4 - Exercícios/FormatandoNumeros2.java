
    // Formatando números percentuais com a classe NumberFormat

import java.text.NumberFormat;
public class FormatandoNumeros2 {
    public static void main(String[] args) {
        double valor = 0.5;
        String valorFormatado;
        valorFormatado = NumberFormat.getPercentInstance().format(valor);
        System.out.println(valorFormatado);
        // Imprimirá: 50%
    }
}
