



import java.util.Scanner;
public class c05ex08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.print("Qual e a área de um setor circular: ?");
        double area = teclado.nextDouble();

        System.out.print("Qual e o valor do ângulo: ?");
        double angulo = teclado.nextDouble();

        double raio = Math.sqrt((area * 360) / (Math.PI * angulo)); // cálculo do raio
        double calculo =  angulo * Math.PI * Math.pow(raio, 2)  / 360.0;
        System.out.println("O raio é " + raio);
        System.out.println("S = " + calculo);


         /*
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual e a área de um setor circular: ?");
        double area = teclado.nextDouble();

        System.out.print("Qual e o valor do ângulo: ?");
        double angulo = teclado.nextDouble();

        double calculo = Math.PI * Math.pow(r, 2) * angulo  / 360.0;
        System.out.println("S=" +calculo);


        teclado.close();
        */



    }
}