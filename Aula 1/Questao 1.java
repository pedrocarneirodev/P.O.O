import java.util.Scanner;

public class TST1 {
    public static void main( String[] args){
        Scanner entrada = new Scanner(System.in);

        float num1, num2, resultado;

        System.out.println("Insira o primeiro número: ");
        num1 = entrada.nextFloat();

        System.out.println("Insira o segundo número: ");
        num2 = entrada.nextFloat();

        resultado = num1 + num2;
        System.out.println("Soma: " + resultado);
        resultado = num1 - num2;
        System.out.println("Subtração: " + resultado);
        resultado = num1 * num2;
        System.out.println("Multiplicação: " + resultado);
        resultado = num1 / num2;
        System.out.println("Divisão: " + resultado);

        entrada.close();
    }
}
