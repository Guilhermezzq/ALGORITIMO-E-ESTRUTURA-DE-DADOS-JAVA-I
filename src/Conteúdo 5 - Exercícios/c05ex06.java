




import java.util.Scanner;
public class c05ex06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor de A da reta R: ");
        double  a = teclado.nextDouble();

        System.out.println("Digite o valor de B da reta R: ");
        double  b = teclado.nextDouble();

        System.out.println("Digite o valor de C da reta R: ");
        double  c = teclado.nextDouble();



        System.out.println("Digite o valor de X do ponto P: ");
        double x = teclado.nextDouble();

        System.out.println("Digite o valor de Y do ponto P: ");
        double y = teclado.nextDouble();

        double distancia =  Math.abs((a * x + b * y + c)/ Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));

        System.out.println("Distância = " +distancia);
        teclado.close();
    }
}
