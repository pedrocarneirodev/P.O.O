import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,result = 1;

        System.out.println("Insira o n: ");
        n = input.nextInt();

        for(int i = n; i > 0; i--){
            result *= i;
        }
        System.err.printf("%d", result);
    }
}
