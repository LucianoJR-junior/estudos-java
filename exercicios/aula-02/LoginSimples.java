import java.util.Scanner;

public class LoginSimples {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String usuario = "admin";
        String senha = "java123";

        System.out.print("Insira o usuario: ");
        String usuarioInput = leitor.nextLine();

        System.out.print("Insira a senha: ");
        String senhaInput = leitor.nextLine();

        if (usuarioInput.equalsIgnoreCase(usuario) && senhaInput.equals(senha)) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Usuário ou senha inválidos");
        }

        leitor.close();
    }
}
