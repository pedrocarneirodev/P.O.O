
import javax.swing.JOptionPane;

public class Date {
    int dia, mes, ano;
   public int SetDate(int dia, int mes, int ano){
        if(dia >= 1 && dia <= 31){
            this.dia = dia;
        }else{
            JOptionPane.showMessageDialog(null, "Data inválida. Insira 1-31.");   
            return 1;
        }
        if(mes >= 1 && mes <= 12){
            this.mes = mes;
        }else{
            JOptionPane.showMessageDialog(null, "Mês inválido. Insira 1-12."); 
            return 1; 
        }
        this.ano = ano;
        return 0;
   }
   public void DisplayDate(){
        System.out.printf("\n-------------");  
        System.out.printf("\n %d/%d/%d", dia,mes,ano);
        System.out.printf("\n-------------");   
   }
}
