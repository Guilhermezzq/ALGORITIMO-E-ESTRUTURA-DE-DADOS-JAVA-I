



import java.util.Scanner;

public class c05ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double area, raio , volume;


        System.out.print("Qual valor do Raio ?");
        raio = teclado.nextDouble();
        area = 4 * 3.1416 * Math.pow(raio,2);
        System.out.print("Area = " +area);

        volume = 4  * (3.1416 * Math.pow(raio,3))/3;
        System.out.print("Volume = " +volume);






    }
}
