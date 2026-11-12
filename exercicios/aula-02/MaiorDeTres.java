import java.util.Scanner;

public class MaiorDeTres {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o primeiro numero: ");
        int num1 = leitor.nextInt();

        System.out.print("Insira o segundo numero: ");
        int num2 = leitor.nextInt();

        System.out.print("insira o terceiro numero: ");
        int num3 = leitor.nextInt();

        int maior = num1;
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }

        System.out.println("O maior é " + maior);

        leitor.close();
    }
}
