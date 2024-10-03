import java.util.Scanner;

public class BancoTest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double saldo = 0;
        int insert;

        Banco usuario = new Banco(saldo);  

        do{
            System.out.printf("\n\n   +----------------------+\n");
            System.out.printf("   +     1.Visualizar     +\n");
            System.out.printf("   +     2.Depositar      +\n");
            System.out.printf("   +     3.Finalizar      +\n");
            System.out.printf("   +----------------------+\n");
            System.out.printf("\n-> Insira a opção desejada: ");
            insert = input.nextInt();

            switch(insert){
                case 1:
                    usuario.GetSaldo();
                    break;
                case 2:
                    System.out.printf("\n-> Digite o valor desejado: ");
                    saldo = input.nextDouble();
                    usuario.SetSaldo(saldo);
                    break;
                case 3:
                    System.out.printf("\n\n*Programa finalizado!\n");
                    break;
                default:
                    System.out.printf("\n\nOpção inválida. Tente novamente\n");
            }
        }while(insert != 3);
        
    }
}