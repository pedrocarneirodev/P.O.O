import java.util.Scanner;
import javax.swing.JOptionPane;

public class Banco2Test{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldo = 0;
        int count = 0;
        Banco2 usuario = new Banco2(saldo);
        usuario.GetSaldo();
        do{
            String valor = JOptionPane.showInputDialog("Digite o valor desejado: "); 
            saldo = Integer.parseInt(valor);
            usuario.SetSaldo(saldo);
            usuario.GetSaldo();
            count++;
        }while(count != 2);
    }    
}
