public class Quadrado {
    int tamanho;

    public Quadrado(int tamanho){
        this.tamanho = tamanho;
    }
    public void imprimir(){
        if (tamanho >= 1 && tamanho <= 20) {
            for (int i = 0; i < tamanho; i++) {
                for (int j = 0; j < tamanho; j++) {
                    if (i == 0 || i == tamanho - 1 || j == 0 || j == tamanho - 1) {
                        System.out.printf(" * ");
                    } else {
                        System.out.printf("   ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Tamanho inválido. Deve estar entre 1 e 20.");
        }
    }
}
