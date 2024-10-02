import javax.swing.JOptionPane;



public class ChamadaTest {
    public static void main(String[] args) {
        
        String nome = "Adam Smith", curso = "POO";
        Chamada professor = new Chamada(nome, curso);
        JOptionPane.showMessageDialog(null, "Nome: "+ nome + "\nCurso: " + curso);
        loop: while(true){
            professor.SetProfessor();
            professor.GetProfessor();
                
            String insert;
            char option;

            do { 
                insert = JOptionPane.showInputDialog(null, "Deseja recuperar o nome anterior? (s/n)");
                option = insert.charAt(0);

                if(option == 's' || option == 'S'){
                    professor.GetProfessorAnterior();
                    break;
                }else if(option == 'n' || option == 'N'){
                    insert = JOptionPane.showInputDialog(null, "Deseja sair do programa? (s/n)");
                    option = insert.charAt(0);
                    if(option == 's' || option == 'S'){
                        break;
                    }else if(option == 'n' || option == 'N'){
                        continue loop;
                    }
                }else{
                    JOptionPane.showInputDialog(null, "Opção inválida. Tente Novamente.");
                }
            } while(true);
            break;
        }
    }
}
