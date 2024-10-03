public class Conta {

    int numConta;
    int saldo, itens, creditos, limite;

    public Conta(int numConta, int saldo, int itens, int creditos, int limite){
        this.numConta = numConta;
        this.saldo = saldo;
        this.itens = itens;
        this.creditos = creditos;
        this.limite = limite;
    }
    public void calcular(){
        int novoSaldo = creditos - (saldo + itens);
        if(novoSaldo <= limite){
            System.out.printf("\nLimite não exedido!");
            System.out.printf("\nSaldo: R$%.2f", novoSaldo);
        }else{
            System.out.printf("\nLimite exedido de R$%.2f.", saldo);
            System.out.printf("\nSaldo: R$%.2f", novoSaldo);
        }
    }
    
}
