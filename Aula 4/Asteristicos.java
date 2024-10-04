import java.util.Scanner;

public class Asteristicos {
    Scanner input = new Scanner(System.in);
    int num, num1, num2,  num3, num4, num5;

    public Asteristicos(){
    }
    public int getDigitos(int i){
        do {
            System.out.printf("Insira um valor para o numero %d (1 - 30): ", i);
            num = input.nextInt();

            if (num < 1 || num > 30) {
                System.out.println("Valor invalido. Tente novamente.");
            }
        } while (num < 1 || num > 30);

        return num;
    }
    public void setDigtos(){
        num1 = getDigitos(1);
        num2 = getDigitos(2);
        num3 = getDigitos(3);
        num4 = getDigitos(4);
        num5 = getDigitos(5);
    }
    public void setAsteristicos(){
        getAsteristicos(num1);
        getAsteristicos(num2);
        getAsteristicos(num3);
        getAsteristicos(num4);
        getAsteristicos(num5);
    }
    public void getAsteristicos(int num){
        System.out.print("\n");
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }
}
