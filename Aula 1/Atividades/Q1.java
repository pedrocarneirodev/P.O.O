/*Escreva um aplicativo que solicita ao usuário inserir dois inteiros, obtém do usuário esses 
números e imprime sua soma, produto, diferença e divisão.*/

import java.util.Scanner;

public class Q1{
    public static void main( String[] args){
        Scanner entrada = new Scanner(System.in);

        float num1, num2, resultado;

        System.out.println("Insira o valor para num1:");
        num1 = entrada.nextFloat();

        System.out.println("Insira o valor para num2:");
        num2 = entrada.nextFloat();

        System.out.printf("\n=========================\n");
        resultado = num1 + num2;
        System.out.printf(" Soma: ------------ %.2f\n", resultado);
        resultado = num1 - num2;    
        System.out.printf(" Subtração: ------- %.2f\n", resultado);
        resultado = num1 * num2;
        System.out.printf(" Multiplicação: --- %.2f\n", resultado);
        resultado = num1 / num2;
        System.out.printf(" Divisão: --------- %.2f\n", resultado);
        System.out.printf("=========================\n");
    }
}
