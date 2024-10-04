import java.util.Scanner;

public class MenorNumero{
    Scanner input = new Scanner(System.in);
    int quantidade, num, aux, menor;
    public MenorNumero(int quantidade){
        this.quantidade = quantidade;
    }
    public void setIdentificador(){
        System.out.printf("\n1º numero: ");
        aux = input.nextInt();
        for(int i = 2; i <= quantidade; i++){
            System.out.printf("%dº numero: ",i);
            num = input.nextInt();
            if(num < aux){
                aux = num;
            }
        }
    }
    public void getIdentidicador(){
        System.out.printf("\nResultado: %d\n", aux);
    }
}
