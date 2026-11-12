import java.util.Scanner;

public class MenuBanco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("1 - Ver saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.print("Escolha uma opção: ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1 -> System.out.println("Seu saldo é R$ 1.500,00");
            case 2 -> System.out.println("Abrindo depósito...");
            case 3 -> System.out.println("Abrindo saque...");
            default -> System.out.println("Opção inválida.");
        }

        leitor.close();
    }
}
