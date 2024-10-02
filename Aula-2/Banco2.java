import javax.swing.JOptionPane;

public class Banco2{
    private double saldo;
    public Banco2(double saldo){
        this.saldo = saldo;
    }
    public void SetSaldo(double saldo){
        this.saldo += saldo;
    }
    public void GetSaldo(){
        JOptionPane.showMessageDialog(null, "Saldo total é de R$" + saldo);
    }
}