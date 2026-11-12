import java.util.Scanner;

public class AnaliseOrcamento {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Salario: ");
        double salario = leitor.nextDouble();

        System.out.print("Total de gastos: ");
        double gastos = leitor.nextDouble();

        double percentual = gastos / salario * 100;
        System.out.printf("voce gastou %.1f%% do salario.%n", percentual);

        if (percentual > 100) {
            System.out.println("Orçamento estourado!");
        } else if (percentual > 80) {
            System.out.println("Atenção: quase no limite.");
        } else if (percentual > 50) {
            System.out.println("Dentro do orçamento");
        } else {
            System.out.println("Ótimo! sobrou bastante.");
        }

        leitor.close();
    }
}
