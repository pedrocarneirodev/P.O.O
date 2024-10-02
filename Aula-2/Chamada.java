
import javax.swing.JOptionPane;

public class Chamada {
    String professor, curso, professorAnterior;
    public Chamada(String nome, String curso){
        professor = nome;
        this.curso = curso;
    }
    public void SetProfessor(){
        professorAnterior = professor;
        professor = JOptionPane.showInputDialog("Informe o nome do professor: ");
    }
    public void GetProfessor(){
        JOptionPane.showMessageDialog(null, "Nome: "+ professor + "\nCurso: " + curso);
    }
    public void GetProfessorAnterior(){
        JOptionPane.showMessageDialog(null, "Nome: "+ professorAnterior + "\nCurso: " + curso);
    }
}
