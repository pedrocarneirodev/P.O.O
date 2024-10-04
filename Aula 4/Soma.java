import java.util.Scanner;

public class Soma {
    public static int fatorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double E = 1;
        int n;

        System.out.print("Digite a quantidade do fatorial: ");
        n = input.nextInt();

        for(int i = 1; i<= n; i++){
            E += 1.0/Soma.fatorial(i);
        }
        System.out.printf("E = %f", E);
    }
}
