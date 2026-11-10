public class OrcamentoMensal {
    public static void main(String[] args) {
        double salario = 2800;
        double aluguel = 800;
        double mercado = 450;
        double transporte = 180;
        double lazer = 200;
        boolean orcamento = true;

        double TotalGastos = aluguel + mercado + transporte + lazer;
        double sobra = salario - TotalGastos;

        double porcentagem = (TotalGastos / salario) * 100;

        System.out.printf("O acumulo de gastos é: " + TotalGastos);
        System.out.println("\nA sobra é: " + sobra);
        System.out.printf("Você gastou %.2f%% do seu salario\n", porcentagem);

        if (TotalGastos > salario) {
            orcamento = false;
            System.out.println("Dentro do orçamento? " + orcamento);
        } else {
            System.out.println("Dentro do orçamento? " + orcamento);
        }

    }
}
