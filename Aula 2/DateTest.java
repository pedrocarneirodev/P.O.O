import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        int dia, mes, ano;
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.printf("\n\nDigite o dia: ");
            dia = input.nextInt();
            System.out.printf("Digite o mes: ");
            mes = input.nextInt();
            System.out.printf("Digite o ano: ");
            ano = input.nextInt();

            Date data= new Date();
            int ident = data.SetDate(dia,mes,ano);
            if(ident == 0){
                data.DisplayDate();
                break;
            }
        }
    }
}
