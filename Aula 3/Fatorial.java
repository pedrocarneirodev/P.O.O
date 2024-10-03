public class Fatorial {
    int num;
    public Fatorial(int num){
        this.num = num;
    }
    public void calculadora(int num){
        if (num< 0) {
            System.out.println("Numero inválido. Insira um numero positivo.");
        } else {
            int fatorial = 1;
            for (int i = 1; i <= num; i++) {
                fatorial *= i;
            }
            System.out.printf("O fatorial de %d é %d", num, fatorial);
        }
    }
}
