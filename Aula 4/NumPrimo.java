import java.util.Scanner;

public class NumPrimo {
    public static int verificador(int n) {
        if (n <= 1) {
            return 1;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();
        
        if (verificador(n) == 0) {
            System.out.println(n + " é um número primo.");
        } else {
            System.out.println(n + " não é um número primo.");
        }
    }
}
