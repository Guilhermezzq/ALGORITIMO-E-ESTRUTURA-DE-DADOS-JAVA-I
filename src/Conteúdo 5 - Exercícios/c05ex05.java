





import java.util.Scanner;

public class c05ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double kelvin = celsius + 273;
        double fahrenheit = ((celsius * 9) / 5) +32;

        System.out.println("Temperatura em Kelvin: " + kelvin);
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        sc.close();
    }
}