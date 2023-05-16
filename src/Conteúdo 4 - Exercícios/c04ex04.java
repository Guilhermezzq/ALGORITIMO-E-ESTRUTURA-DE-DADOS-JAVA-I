

// Sobrenome, PrimeirNome, SegundoNome com Caixa de Diálogo

import javax.swing.JOptionPane;

public class c04ex04 {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual seu Sobrenome? ");
        String Sobrenome = scanner.nextLine();

        System.out.print("Qual seu PrimeiroNome? ");
        String PrimeiroNome = scanner.nextLine();

        System.out.print("Qual seu SegundoNome? ");
        String SegundoNome = scanner.nextLine();

        System.out.print("Qual sua idade? ");
        int idade = scanner.nextInt();

        System.out.println(Sobrenome + "," +PrimeiroNome+ " " +SegundoNome);
        System.out.print("Idade: "+idade+" anos.");

        scanner.close();
        */

        String SobreNome = JOptionPane.showInputDialog(null,
                "Qual seu Sobrenome? ",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        String PrimeiroNome = JOptionPane.showInputDialog(null,
                "Qual seu Primeiro nome? ",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        String SegundoNome = JOptionPane.showInputDialog(null,
                "Qual seu Segundo nome? ",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);

        String idadeStr = JOptionPane.showInputDialog(null,
                "Qual sua idade? ",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);
        int idade = Integer.valueOf(idadeStr);
        JOptionPane.showMessageDialog(null,
                "Nome: "+SobreNome+ ", " +PrimeiroNome+ " " +SegundoNome+ "\nIdade: " +idadeStr+" anos.");


        










    }
}
