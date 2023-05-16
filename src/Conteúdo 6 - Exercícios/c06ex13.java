
  // Faça um programa que leia a hora inicial, minuto inicial, hora final
  // e minuto final de um jogo (cada valor em uma variável do tipo inteiro
  // diferente). A seguir, calcule e imprima a duração do jogo, mostrando o
  // resultado no seguinte formato:

import java.util.Scanner;

public class c06ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora inicial: ");
        int horaInicial = sc.nextInt();
        System.out.print("Digite o minuto inicial: ");
        int minutoInicial = sc.nextInt();
        System.out.print("Digite a hora final: ");
        int horaFinal = sc.nextInt();
        System.out.print("Digite o minuto final: ");
        int minutoFinal = sc.nextInt();

        int duracaoHoras, duracaoMinutos;

        // calcula a duração em minutos
        int duracaoTotalMinutos = (horaFinal * 60 + minutoFinal) - (horaInicial * 60 + minutoInicial);

        if (duracaoTotalMinutos < 0) {
            duracaoTotalMinutos += 24 * 60; // adiciona um dia em minutos caso a hora final seja menor que a inicial
        }

        // calcula a duração em horas e minutos
        duracaoHoras = duracaoTotalMinutos / 60;
        duracaoMinutos = duracaoTotalMinutos % 60;

        System.out.printf("O jogo durou %d horas e %d minutos\n", duracaoHoras, duracaoMinutos);

        sc.close();
    }
}
