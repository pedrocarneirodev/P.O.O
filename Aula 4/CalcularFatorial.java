public class CalcularFatorial {
    public static void main(String[] args) {
        for (int n = 1; n <= 20; n++) {
            int fatorial = 1;
            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }
            System.out.printf("\n%dn = %d%n", n, fatorial);
        }
    }
}
