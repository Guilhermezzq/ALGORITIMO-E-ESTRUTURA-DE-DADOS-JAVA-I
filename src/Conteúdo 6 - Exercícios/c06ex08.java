

   //  IMC = Peso / Altura2

import java.util.Scanner;

public class c06ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = input.nextLine();

        System.out.print("Digite a altura da pessoa em metros: ");
        double altura = input.nextDouble();

        double pesoIdealMinimo = 0.0;
        double pesoIdealMaximo = 0.0;
        double imc = 0.0;

        // Cálculo do peso mínimo e máximo de acordo com o IMC
        imc = pesoIdealMinimo / (altura * altura);
        if (imc < 20) {
            pesoIdealMinimo = 20 * altura * altura;
            pesoIdealMaximo = 25 * altura * altura;
        } else if (imc >= 20 && imc <= 25) {
            pesoIdealMinimo = pesoIdealMaximo = pesoIdealMinimo = 25 * altura * altura;
        } else {
            pesoIdealMinimo = 20 * altura * altura;
            pesoIdealMaximo = 25 * altura * altura;
        }

        System.out.println("Peso ideal de " + nome + ": mínimo de " + pesoIdealMinimo + " kg e máximo de " + pesoIdealMaximo + " kg.");
    }
}
