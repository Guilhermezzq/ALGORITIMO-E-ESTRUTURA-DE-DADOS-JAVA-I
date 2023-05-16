




import java.util.Scanner;

public class c05ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("");

        System.out.print("Digite o tempo em segundos: ");
        int tempo = input.nextInt();

        int horas = tempo / 3600;
        int minutos = (tempo % 3600) / 60;
        int segundos = tempo % 60;



        System.out.printf("Hor = %d, Min = %d, Seg = %d", horas, minutos, segundos);
    }
}

