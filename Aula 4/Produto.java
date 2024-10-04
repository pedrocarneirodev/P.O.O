public class Produto{
    public static void main(String[] args){
        int resultado = 1;

        for(int i = 1; i <= 15; i += 2){
            resultado *= i; 
        }
        System.out.printf("\n\nResultado: %d\n", resultado);
    }
}
