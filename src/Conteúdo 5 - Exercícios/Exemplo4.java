

  // Composição Númerica com


import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner impressao = new Scanner(System.in);

        System.out.print("Digite um numero inteiro com 3 digitos? ");
        int numInteiro = impressao.nextInt();

        int num1, num2 ,num3;

        num1 = numInteiro / 100 % 10;
        num2 = numInteiro / 10 % 10;
        num3 = numInteiro % 10;

        System.out.printf("Impressao = "+num1+"-"+num2+"-"+num3);
    }
}
