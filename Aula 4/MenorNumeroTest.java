import java.util.Scanner;

public class MenorNumeroTest {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int quantidade, num, aux, menor;

        do{ 
            System.err.printf("Insira a quantidade de numeros que deseja inserir: ");
            quantidade = input.nextInt();
            if(quantidade <= 0){
                System.err.println("Quantidade inválida. Tente Novamente");
            }
        }while(quantidade <= 0);
        
        MenorNumero numero = new MenorNumero(quantidade);
        numero.setIdentificador();
        numero.getIdentidicador();
    }
}
