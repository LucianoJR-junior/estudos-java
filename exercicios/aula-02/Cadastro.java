import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual seu nome? ");
        String nome = leitor.nextLine();

        System.out.print("Qual sua idade? ");
        int idade = leitor.nextInt();

        System.out.print("Qual seu salario? ");
        double salario = leitor.nextDouble();

        System.out.println("Olá, " + nome + "!");
        System.out.println("Daqui a 5 anos voce terá " + (idade + 5) + " anos");
        System.out.printf("Seu salario anual é de R$ %.2f%n", salario * 12);

        leitor.close();
    }
}
