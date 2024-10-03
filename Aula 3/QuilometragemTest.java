import java.util.Scanner;

public class QuilometragemTest{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int quilometros, litros, total = 0;
	char opcao;

	Quilometragem viagem = new Quilometragem(0, 0);
	while(true) { 
		System.out.println("Insira quantos Km rodados: ");
		quilometros = input.nextInt();
		System.out.println("Insita quantos litros gastos: ");
		litros = input.nextInt();
		viagem.setQuilometragem(quilometros, litros);
		System.out.printf("Quilometragem: %dKm/L", viagem.getQuilometragem());
		total += viagem.getQuilometragem();

		System.out.printf("\nDeseja continuar(s/n)?");
		opcao = input.next().charAt(0);

		if(opcao == 's' || opcao == 'S'){
			continue;
		}else{
			break;
		}
	}
	System.out.printf("\nQuilometragem total: %dKm/L", total);
	
}

}
