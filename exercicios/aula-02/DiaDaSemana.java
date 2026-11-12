import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero de 1 a 7: ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sabado");
            default -> System.out.println("Dia invalido!");
        }

        if (opcao >= 1 && opcao <= 7) {
            String tipoDeDia = (opcao == 1 || opcao == 7) ? "Fim de semana" : "Dia útil";
            System.out.println(tipoDeDia);
        }

        leitor.close();
    }
}
