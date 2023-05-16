
import javax.swing.JOptionPane;

import java.util.Scanner;

public class c07ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nomeEquipes;
        String Estado;

        nomeEquipes = JOptionPane.showInputDialog(null,
                "Digite o nome das Equipes: ",
                "Equipes",
                JOptionPane.QUESTION_MESSAGE);
        System.out.println(nomeEquipes);

        switch (nomeEquipes) {

            case "América, Atlético, Cruzeiro, Villa Nova" ->
                Estado = "Minas Gerais" ;

            case "Corinthians, Palmeiras, Santos, São Paulo" ->
                Estado = "São Paulo";

            case "Flamengo, Fluminense, Vasco" ->
                Estado = "Rio de Janeiro";

            case "Internacional, Grêmio" ->
                Estado = "Rio Grande do Sul";

            default ->
                Estado = "Não foi possivel indetificar o estado da esquipe!";


        }
        JOptionPane.showMessageDialog(null, "Equipes: "+nomeEquipes+" \nEstado: "+Estado);

        teclado.close();
    }
}
