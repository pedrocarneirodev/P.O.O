import java.util.Scanner;

public class Q2 {
  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    int num, casa1, casa2, casa3, casa4, casa5;

    System.out.printf("\nInsira um numero com 5 digitos: ");
    num = entrada.nextInt();

    casa1 = (num/10000) % 10;
    casa2 = (num/1000) % 10;
    casa3 = (num/100) % 10;
    casa4 = (num/10) % 10;
    casa5 = (num/1) % 10;

    System.out.printf("\n%d\t%d\t%d\t%d\t%d\t", casa1, casa2, casa3, casa4, casa5);
  }
}