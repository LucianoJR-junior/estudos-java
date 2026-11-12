import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual seu nome?: ");
        String nome = leitor.nextLine();

        System.out.print(nome + ", qual o horário atual? (0 a 23): ");
        int horario = leitor.nextInt();

        if (horario >= 5 && horario <= 11) {
            System.out.println("Bom dia, " + nome + "!");
        } else if (horario >= 12 && horario <= 17) {
            System.out.println("Boa tarde, " + nome + "!");
        } else {
            System.out.println("Boa noite, " + nome + "!");
        }

        leitor.close();
    }
}
