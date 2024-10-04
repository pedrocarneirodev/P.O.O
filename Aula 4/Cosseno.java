import java.util.Scanner;

public class Cosseno {
    public static double fatorial(double n){
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int j = 0;
        double cos = 0;
        double x;

        System.out.print("Digite o valor de cos(x): ");
        x = input.nextDouble();
        x= x*3.14/180;

        for(int i = 0; i<= 15; i+=2){
            cos += Math.pow(-1, j)*Math.pow(x, i)/Cosseno.fatorial(i);
            j++;
        }
        System.out.printf("cos(x) = %.2f", cos);
    }
}
