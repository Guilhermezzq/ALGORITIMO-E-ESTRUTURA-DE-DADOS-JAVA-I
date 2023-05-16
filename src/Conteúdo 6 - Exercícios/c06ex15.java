
 // Conta = Valor Fixo + Diárias Canais PPP + Serviços Extras + Imposto
 // (sobre Fixo/PPP/Extra


import java.util.Scanner;
public class c06ex15 {

public static void main(String[]args) {
    Scanner conta = new Scanner(System.in);

    double valorFixo, diaria, importoCalc, imposto, conta1;

    System.out.println("Informe sua cidade: ");
    String cidade = conta.nextLine();

    System.out.println("Informe o codigo do seu pacote: ");
    int codigo = conta.nextInt();

    System.out.println("Informe o valor dos serviços extras: ");
    double servicos = conta.nextDouble();

    System.out.println("Informe o numero de dias de consumo de canais pay-per-view: ");
    int dias = conta.nextInt();

    if (codigo == 1) {
        valorFixo = 65;
        diaria = dias * 1.20;
        if (diaria >= 65) diaria = 65;
    } else {
        if (codigo == 2) {
            valorFixo = 104;
            diaria = dias * 2.10;
        } else {
            valorFixo = 137;
            diaria = 0;

        }
    }
    if (cidade.equalsIgnoreCase("Belo Horizonte")) imposto = 0;

    else {
        if (cidade.equalsIgnoreCase("São Palo")) imposto = 0.01;
        else {
            if (cidade.equalsIgnoreCase("Rio de Janeiro")) imposto = 0.015;
            else imposto = 0.02;

        }
    }

    importoCalc = (valorFixo + diaria + servicos) * imposto;
    conta1 = valorFixo + diaria + servicos + importoCalc;
    System.out.printf("Sua conta tem o valor de: R$%.2 ", conta);
    conta.close();
}
}



