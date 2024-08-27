import java.util.Scanner;

public class Q3 {
    public static void main( String[] args){
        Scanner entrada = new Scanner( System.in);

        double a, b, c, delta, x1, x2;

        System.out.printf("\nInsira o valor de a: ");
        a = entrada.nextDouble();
        System.out.printf("Insira o valor de b: ");
        b = entrada.nextDouble();
        System.out.printf("Insira o valor de c: ");
        c = entrada.nextDouble();

        delta = b * b - 4 * a * c;
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("\n\n=========================\n");
        System.out.printf(" Delta: --------- %.2f \n\n", delta);
        System.out.printf(" X1: ------------ %.2f \n", x1);
        System.out.printf(" X2: ------------ %.2f \n", x2);
        System.out.printf("=========================\n");
    }
}
