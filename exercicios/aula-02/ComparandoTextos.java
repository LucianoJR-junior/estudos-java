import java.util.Scanner;

public class ComparandoTextos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Deseja continuar?: ");
        String resposta = leitor.nextLine();

        if (resposta == "sim") {
            System.out.println("Continuando com ==");
        }

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Continuando com EqualsIgnore case...");
        }

        leitor.close();
    }
}
