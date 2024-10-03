
import java.util.Scanner;

public class FatorialTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.printf("Insira um numero inteiro positivo: ");
        num = input.nextInt();
        
        CalcularFatorial fatorial= new CalcularFatorial(num);
        fatorial.calculadora(num);
    }
}
