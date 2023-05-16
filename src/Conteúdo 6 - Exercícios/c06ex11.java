

//Faça um programa que leia os nomes das equipes (equipe 1 e equipe 2)
// e o placar de um jogo (sets ganhos da equipe 1 e sets ganhos da equipe 2),
// e calcule e imprima os pontuação que cada equipe ganhou na partida.


import java.util.Scanner;

public class c06ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da Equipe 1: ");
        String equipe1 = scanner.nextLine();

        System.out.print("Digite o nome da Equipe 2: ");
        String equipe2 = scanner.nextLine();

        System.out.print("Digite o número de sets ganhos pela " + equipe1 + ": ");
        int setsEquipe1 = scanner.nextInt();

        System.out.print("Digite o número de sets ganhos pela " + equipe2 + ": ");
        int setsEquipe2 = scanner.nextInt();

        int pontosEquipe1, pontosEquipe2;

        if (setsEquipe1 == 3 && setsEquipe2 < 3) {
            pontosEquipe1 = 3;
            pontosEquipe2 = 0;
        } else if (setsEquipe1 == 3 && setsEquipe2 == 1 || setsEquipe2 == 0) {
            pontosEquipe1 = 3;
            pontosEquipe2 = 0;
        } else if (setsEquipe1 == 2 && setsEquipe2 == 3) {
            pontosEquipe1 = 1;
            pontosEquipe2 = 2;
        } else {
            pontosEquipe1 = 0;
            pontosEquipe2 = 3;
        }

        System.out.println("Pontos " + equipe1 + " = " + pontosEquipe1);
        System.out.println("Pontos " + equipe2 + " = " + pontosEquipe2);

        scanner.close();
    }
}



