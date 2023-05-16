


 //  Usando if e else " IMC = Peso / Altura2 "


import java.util.Scanner;

public class c06ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o nome da pessoa: ");
        String nome = teclado.nextLine();

        System.out.print("Informe á altura em (metros): ");
        double altura = teclado.nextDouble();

        System.out.print("Informe seu peso em (kg): ");
        double peso = teclado.nextDouble();

        double imc = peso / Math.pow(altura,2);

        String calculo;
        if (imc < 18) {
            calculo = "Pessoa está desnutrida";
        } else if (imc < 20) {
            calculo = "Pessoa está abaixo do peso";
        } else if (imc < 25) {
            calculo = "Pesssoa está no peso ideal";
        } else if (imc < 27) {
            calculo = "Pessoa está acima do peso";
        } else {
            calculo = "Pessoa está obesa";
        }
        System.out.printf("%s está %s. Seu IMC é %.2f.", nome, calculo, imc);
        teclado.close();
    }
}
