/*Escreva um programa que leia a quantidade em segundos e imprima o resultado em dias, horas, minutos e
segundos.*/

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int totalSeg, dias, horas, minutos, segundos;

        System.out.printf("\nInsira a quantidade em segundos: ");
        totalSeg = entrada.nextInt();

        dias = totalSeg / 86400;
        horas = (totalSeg % 86400) / 3600;
        minutos = (totalSeg % 3600) / 60;
        segundos = totalSeg % 60;
        System.out.printf("\n-------------------------");
        System.out.printf("\n  %dd  %dh  %dmin  %dseg", dias, horas, minutos, segundos);
        System.out.printf("\n-------------------------\n\n");
    }
}
