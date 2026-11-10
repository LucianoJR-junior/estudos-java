public class MediaNotas {
    public static void main(String[] args) {
        int notaUm = 7;
        int notaDois = 8;
        int notaTres = 8;

        double media = ((double) notaUm + notaDois + notaTres) / 3.0;

        System.out.printf("A media das tres notas %.2f\n", +media);
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
