import java.util.Scanner;

public class TST4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        float dias, horas, minutos, segundos, totalSeg;

        System.out.printf("Insira a quantidade de segundos: ");
        totalSeg = entrada.nextFloat();

        dias = totalSeg / (24 * 3600);  // dia = valor / total de seg por dia
        horas = (totalSeg % (24 * 3600)) / 3600;    //hora = (valor - total de seg por dia) / segundos por hora
        minutos = (totalSeg % 3600) / 60;   //minutos = (valor - total de seg por hora) / segundos por minutos
        segundos = totalSeg % 60;   //segundos = valor - total de seg

        System.out.printf("**** Resultado ****\n\n");
        System.out.printf("Horas: %.2f\n", horas);
        System.out.printf("Minutos: %.2f\n", minutos);
        System.out.printf("Segundos: %.2f\n", segundos);

        entrada.close();
    } 
}
