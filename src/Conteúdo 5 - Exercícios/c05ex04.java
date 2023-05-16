



import java.util.Scanner;

public class c05ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x1 , y1, x2, y2 , distancia , pontosx , pontosy;

        System.out.print("Qual valor de x1: ");
        x1 = teclado.nextDouble();

        System.out.print("Qual valor de x2: ");
        x2 = teclado.nextDouble();

        System.out.print("Qual valor de y1: ");
        y1 = teclado.nextDouble();

        System.out.print("Qual valor de y2: ");
        y2 = teclado.nextDouble();

        pontosx = Math.pow( x1 - x2, 2);

        pontosy = Math.pow(y1 - y2, 2);

        distancia = Math.pow( (pontosx + pontosy),0.5);

        System.out.println("Distância = " +distancia);

    }
}
