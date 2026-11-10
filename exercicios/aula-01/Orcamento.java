public class Orcamento {
    public static void main(String[] args) {
        String nome = "Ana";
        double salario = 3500.00;
        double aluguel = 1200.00;
        double mercado = 800.50;
        boolean temReserva = false;

        double totalGastos = aluguel + mercado;
        double sobra = salario - totalGastos;

        System.out.println("Orçamento de " + nome);
        System.out.println("total de gastos: " + totalGastos);
        System.out.println("Sobra no mês: " + sobra);
        System.out.printf("Sobra formatada: R$ %.2f%n", sobra);
        System.out.println("Tem reserva? " + temReserva);

    }
}
