



import java.util.Scanner;

public class c05extra2 {

    public static void main(String[] args) {
        Scanner relatividade = new Scanner(System.in);

        System.out.print("Informe o tempo em segundos (t): ");
        double t =relatividade.nextDouble();

        System.out.print("Informe a velocidade em m/s (v): ");
        double v = relatividade.nextDouble();

        double c = 3e8;
        double T = t / Math.sqrt(1 - Math.pow(v/c, 2));

        System.out.printf("O tempo relativo é de %.4f segundos.", T);

        relatividade.close();
    }

}
