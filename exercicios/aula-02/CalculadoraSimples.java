import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o primeiro numero: ");
        double numUm = leitor.nextDouble();

        System.out.print("Insira o segundo numero: ");
        double numDois = leitor.nextDouble();

        System.out.println("Selecione um operador");
        System.out.println(" 1 = + \n 2 = - \n 3 = X \n 4 = /");
        System.out.print("Opção: ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1 -> System.out.println(numUm + " + " + numDois + " = " + (numUm + numDois));
            case 2 -> System.out.println(numUm + " - " + numDois + " = " + (numUm - numDois));
            case 3 -> System.out.println(numUm + " X " + numDois + " = " + (numUm * numDois));

            case 4 -> {
                if (numDois == 0) {
                    System.out.print("Não e possivel divisão por zero");
                } else {
                    System.out.println(numUm + " / " + numDois + " = " + (numUm / numDois));
                }
            }
            default -> System.err.println("opção invalida!");

        }

        leitor.close();
    }
}
