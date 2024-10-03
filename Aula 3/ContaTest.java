
import java.util.Scanner;

public class ContaTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numConta;
        int saldo,creditos, limite,itens = 0;

        System.out.println("Insira o número da conta: ");
        numConta = input.nextInt();
        System.out.println("Insira o saldo inicial: ");
        saldo = input.nextInt();

        System.out.printf("Informe os valores cobrados\n");
        System.out.printf("*Digite '0' para finalizar*\n\n");
        for(int i = 1; i != 0;i++){ 
            System.out.printf("  Item %d: R$",i);
            double temp = input.nextInt();
            if(temp > 0.00){
                itens += temp;
                temp = 0;
            }else{
                break;
            }
        }
            
        System.out.println("\nInsira o total de créditos aplicados: ");
        creditos = input.nextInt();
        System.out.println("Insira o limite autorizado: ");
        limite = input.nextInt();

        Conta usuario = new Conta(numConta, saldo,itens,creditos,limite);
        usuario.calcular();
    }
}
