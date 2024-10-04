import java.util.Scanner;
public class PoupancaTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valInvestido;

        System.out.printf("Insira o valor que deseja colocar na poupanca: R$");
        valInvestido = input.nextDouble();

        Poupanca usuario = new Poupanca(valInvestido);
        usuario.contador();
}
}