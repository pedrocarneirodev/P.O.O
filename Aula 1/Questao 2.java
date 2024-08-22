import java.util.Scanner;

public class TST2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int num;

        System.out.printf("Insira um número com 5 digitos: ");
        num = entrada.nextInt();

        int digito1 = num/10000 % 10;
        int digito2 = (num/1000) % 10;
        int digito3 = (num/100) % 10;
        int digito4 = (num/10) % 10;
        int digito5 = num % 10;

        System.out.printf("\n%d\t%d\t%d\t%d\t%d\n", digito1, digito2, digito3, digito4, digito5);
        entrada.close();
    }
}
