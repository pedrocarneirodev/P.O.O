import java.util.Scanner;
public class CriptografiaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o número criptografado de quatro dígitos do usuário
        System.out.print("Insira o numero de quatro dígitos criptografado: ");
        int criptoValor = scanner.nextInt();

        Criptografia valor = new Criptografia();
        valor.descriptografar(criptoValor);
    }
}