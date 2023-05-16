import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner regiaoPercentente = new Scanner(System.in);

        System.out.print("Digite o nome de um Estado do Brasil? ");
        String estado = regiaoPercentente.nextLine();

        switch (estado) {
            case "Minas Gerias" -> System.out.println("Sudeste");

            case "Paraná" -> System.out.println("Sul");

            case "Alagoas" -> System.out.println("Nordeste");


            default -> System.out.println("Estado Invalido!");


        }
        regiaoPercentente.close();
    }
}
