/*
import java.util.Scanner;

public class VerdadeiroFalso {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



            System.out.print("Voce tem curso tecnico de programção? ");
            String cursotecnico = teclado.nextLine();


            if ( cursotecnico.equals("V")) {
                System.out.println("Tem mais de três anos de experiencia!");
                cursotecnico = teclado.nextLine();


            }

            System.out.print("Você tem curso superior de programação?");
            String cursosuperior = teclado.nextLine();
            System.out.print("Voce tem menos de 3 anos de experiência em programação? ");
            String experiencia = teclado.nextLine();

            System.out.print("Você se considera uma pessoa criativa?");
            String criatividade = teclado.nextLine();

            System.out.print("Voce prefere liderar a ser liderado?");
            String liderar = teclado.nextLine();


            if (liderar.equals("V")){
            System.out.println("Não recebera o valor de R$1500");
            liderar = teclado.nextLine();


            }

            System.out.print("Você prefere trabalhar sozinho a trabalhar em equipe?");
            String trabalhar = teclado.nextLine();
            System.out.print("Você e autodidata(Aprende sozinho)?");
            String autodidata = teclado.nextLine();
            System.out.print("Você aceitaria uma remuneração inicial de R$1500?");
            String remuneracao = teclado.nextLine();
            System.out.print("Você só aceitaria trabalhar em escritótos da empresa dntro da grande BH?");
            String escritorio = teclado.nextLine();

            teclado.close();
    }

}
*/





import java.util.Scanner;

public class c06ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cursoTecnico, cursoSuperior, experiencia, criatividade, lideranca, trabalhoEquipe, autodidata, salario, localizacao;


        System.out.print("Você tem curso técnico de programação? ");
        cursoTecnico = sc.nextLine().equalsIgnoreCase("V");

        System.out.print("Você tem curso superior de programação? ");
        cursoSuperior = sc.nextLine().equalsIgnoreCase("V");

        System.out.print("Você tem menos de 3 anos de experiência em programação? ");
        experiencia = sc.nextLine().equalsIgnoreCase("V");

        System.out.print("Você se considera uma pessoa criativa? ");
        criatividade = sc.nextLine().equalsIgnoreCase("V");

        System.out.print("Você prefere liderar a ser liderado? ");
        lideranca = sc.nextLine().equalsIgnoreCase("V");

        System.out.print("Você prefere trabalhar sozinho a trabalhar em equipe? ");
        trabalhoEquipe = sc.nextLine().equalsIgnoreCase("F");

        System.out.print("Você é autodidata (aprende sozinho)? ");
        autodidata = sc.nextLine().equalsIgnoreCase("V");

        System.out.print("Você aceitaria uma remuneração inicial de R$1500? ");
        salario = sc.nextLine().equalsIgnoreCase("F");

        System.out.print("Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH? ");
        localizacao = sc.nextLine().equalsIgnoreCase("F");

        if ((cursoTecnico && experiencia) || cursoSuperior) {
            if (lideranca && salario) {
                System.out.println("Você não está apto para exercer a função de programador na empresa.");
            } else {
                System.out.println("Você está apto para exercer a função de programador na empresa.");
            }
        } else {
            System.out.println("Você não está apto para exercer a função de programador na empresa.");
        }

        sc.close();
    }
}
