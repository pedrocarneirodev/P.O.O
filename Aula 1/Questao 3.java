import java.util.Scanner;

public class TST3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double a,b,c;
        double x1,x2;

        System.out.printf("Insira o valor de a: ");
        a = entrada.nextDouble();

        System.out.printf("Insira o valor de b: ");
        b = entrada.nextDouble();

        System.out.printf("Insira o valor de c: ");
        c = entrada.nextDouble();

        x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2*a);
        x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2*a);

        System.out.printf("**** Resultado ****\n\n");
        System.out.printf("X'  : %.2f \n", x1);
        System.out.printf("X'' : %.2f \n", x2);

        entrada.close();
    }
}
