import java.util.Scanner;

public class CalcularQuadrado{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int valor,j = 1,soma=0;

        System.out.printf("Insira o valor IMPAR que deseja ser ^2: ");
        valor = input.nextInt();
        
        System.out.printf("%d^2 = ", valor);
        for(int i = 1; i <= valor; i++){
            System.out.print(j);
            soma += j;
            if (i < valor) {
                System.out.print(" + ");
            }
            j+=2;
        }
        System.out.printf(" = %d\n", soma);
    }
}
