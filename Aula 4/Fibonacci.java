import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 1, b = 1, atual = 0;

        System.out.print("Insira um numero do fibo(n), onde n>=3: ");
        int n = input.nextInt();
        if (n < 3) {
            System.out.println("Numero invalido. Tente novamente");
        }else{
            for (int i = 3; i <= n; i++) {
                atual = a + b;
                a = b; 
                b = atual;  
            }
            System.out.printf("\n %dº termo = %d ",n, atual);
        }
    }
}
