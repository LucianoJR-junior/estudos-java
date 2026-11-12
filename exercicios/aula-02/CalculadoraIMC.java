import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira seu peso(KG): ");
        double peso = leitor.nextDouble();

        System.out.print("Insira sua altura(CM): ");
        double altura = leitor.nextDouble() / 100;

        double imc = peso / (altura * altura);

        System.out.printf("seu IMC é: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }

        leitor.close();
    }
}