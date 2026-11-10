public class ConversorTemperatura {
    public static void main(String[] args) {

        double celsius = 25;
        double fahrenheit = celsius * 9 / 5 + 32; // Colocar o parenteses (9 /5) da errado pois ele ira executar primero
                                                  // '9/5'

        System.out.println("A temperatura fahrenheit é: " + fahrenheit);
    }
}
