public class ConversorSegundos {
    public static void main(String[] args) {
        int segundos = 10000;

        int conversorMinutos = segundos / 60;
        int conversorHoras = conversorMinutos / 60;
        int minutosResto = conversorMinutos % 60;
        int segundosResto = segundos % 60;

        System.out.println(segundos + " segundos = " + conversorHoras + "H " + minutosResto + "Min " + segundosResto);
    }
}
