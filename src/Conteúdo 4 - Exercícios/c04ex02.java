
  // Ficha Funcional

import java.text.DecimalFormat;
import java.util.Scanner;

public class c04ex02 {
    public static void main(String[] args) {
        String NomeFuncional, Documentos, CPF, CI, Titulo, Carteira, Empresa, SalarioFormatado;
        double salario;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ficha Funcional de: ");
        NomeFuncional = scanner.nextLine();

        System.out.println("Documentos: ");

        System.out.print("CPF ...................................");
        CPF = scanner.nextLine();

        System.out.print("C.I. ..................................");
        CI = scanner.nextLine();

        System.out.print("Titulo de Eleitor .....................");
        Titulo = scanner.nextLine();

        System.out.print("Carteira de motorista .................");
        Carteira = scanner.nextLine();

        System.out.println();
        System.out.print("Empresa: ");
        Empresa = scanner.nextLine();

        System.out.print("Salario: R$ ");
        salario = scanner.nextDouble();
        DecimalFormat df = new DecimalFormat("#,##0.00");
        SalarioFormatado = df.format(salario);
        System.out.println("Salario: R$ " + SalarioFormatado);

        scanner.close();
    }
}
