public class Poupanca {
    double a,p,r = 0.05;
    public Poupanca(double valInvertido){
        p = valInvertido;
    }
    public void contador(){
        for(int n=1; n <= 10; n++){
            a = p*Math.pow(1+r, n);
            System.out.printf("\n%02dº ano: R$%.2f", n,a);
        }
    }
}
