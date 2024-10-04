import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n,k,resultado;

        System.out.printf("Insira um numero: ");
        n = scanner.nextDouble();

        System.out.printf("Insira o valor de k: ");
        k = scanner.nextDouble();

        for (int i = 1; i <= 12; i++) {
            k = (k + n / k) / 2;
            System.out.printf("Iteração %d: k= %f\n", i, k);
        }
        resultado = Math.sqrt(n);
        System.out.printf("\nResultado: %.2f",resultado);
    }
}