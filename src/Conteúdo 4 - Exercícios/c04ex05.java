
         // Ficha Funcional com Caixa de Diálogo para saída de dados

import java.util.Scanner;
import javax.swing.JOptionPane;


public class c04ex05 {
    public static void main(String[] args)  {
        Scanner ficha = new Scanner(c04ex05.class.getResourceAsStream("ficha.txt"));


        String nome = ficha.nextLine();
        String cpf = ficha.nextLine();
        String cI = ficha.nextLine();
        String tituloEleitor = ficha.nextLine();
        String carteiraMotorista= ficha.nextLine();
        String empresa= ficha.nextLine();
        String salario = ficha.nextLine();



        JOptionPane.showMessageDialog(null, "FICHA FUNCIONAL DE: " +nome+ "\n\n" +"Documentos: \n\n" + "CPF: " + cpf + "\n" + "C.I.: " + cI + "\nTitulo de Eleitor: " +tituloEleitor + "\nCarteira de motorista: " + carteiraMotorista + "\n\nEmpresa: " + empresa + "\nSalario: " + salario );
    }
}
