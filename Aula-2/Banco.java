public class Banco {
    private double saldo;
    public Banco(double saldo){
        this.saldo = saldo;
    }
    public void SetSaldo(double saldo){
        this.saldo += saldo;
    }
    public void GetSaldo(){
        System.out.printf("\n\n   +----------------------+\n");
        System.out.printf("     ==== SALDO TOTAL ====\n");
        System.out.printf("      -> R$%.2f\n",saldo);
        System.out.printf("     =====================\n");
        System.out.printf("   +----------------------+\n");
    }
}