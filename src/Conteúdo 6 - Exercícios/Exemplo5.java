
 // CalcaulaINSS5

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Exemplo5 {
    public static void main(String[] args) {
        double salario, inss;
        String salarioStr, inssStr;
        salarioStr = JOptionPane.showInputDialog(null,
                "Informe o valor do seu salário:",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);
        salario = Double.valueOf(salarioStr);
        if (salario <= 300)
            inss = salario * 0.08;
        else
        if (salario <= 1000)
            inss = salario * 0.09;
        else
            inss = salario * 0.1;
        inssStr = new DecimalFormat("#,##0.00").format(inss);
        JOptionPane.showMessageDialog(null,
                "Salário: "+salarioStr+"\nValor do INSS = R$"+inssStr,
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
