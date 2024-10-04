public class CalcularPi {
    public static double pi(int contagem){
        double valor=0;
        int j = 0;
        for(int i = 1; i < contagem; i+=2){
            valor += Math.pow(-1, j)*4/i;
            j++;
        }
        return valor;
    }
    public static void main(String[] args){
        double valor;
        int contador = 200000;
        do{
            valor = CalcularPi.pi(contador);
            System.out.printf("%dn = %.7f\n",contador, valor);
            contador+=1000;
        }while(valor <= 3.1415900);
        
    }
}
