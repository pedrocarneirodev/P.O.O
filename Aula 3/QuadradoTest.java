import java.util.Scanner;

public class QuadradoTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tamanho;

        System.out.printf("Insira o tamanho do quadrado: ");
        tamanho = input.nextInt();

        Quadrado quadrado = new Quadrado(tamanho);
        quadrado.imprimir();
    }
}
