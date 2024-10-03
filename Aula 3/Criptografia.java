public class Criptografia {
    int digito1,digito2,digito3,digito4,original;

    public Criptografia(){

    }
    public void descriptografar(int valor){
        digito1 = (valor / 1000) % 10;
        digito2 = (valor / 100) % 10;
        digito3 = (valor / 10) % 10;
        digito4 = valor % 10;
        
        digito1 = (digito1 + 7)/ 10;
        digito2 = (digito2 + 7)/ 10;
        digito3 = (digito3 + 7)/ 10;
        digito4 = (digito4 + 7)/ 10;

        original = digito3 * 1000 + digito4 * 100 + digito1 * 10 + digito2;

        System.out.printf("Numero original: %d", original);
    }
}
