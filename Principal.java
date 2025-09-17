package Exercicioginastica;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Aluno Aluno1 = new Aluno(
            01, "123.456.789-00", "Fernando", 1.70, 67.2
        );

        Aluno Aluno2 = new Aluno(
            02, "987.654.321-00", "Lucas", 1.81, 83.3
        );

        Aluno Aluno3 = new Aluno();

        JOptionPane.showMessageDialog(null,
                "Id: " + Aluno1.getId() +
                "\nCpf: " + Aluno1.getCpf() +
                "\nNome: " + Aluno1.getNome() +
                "\nAltura: " + Aluno1.getAltura() + 
                "\nPeso: " + Aluno1.getPeso()
        );
        
        JOptionPane.showMessageDialog(null,
                "Id: " + Aluno2.getId() +
                "\nCpf: " + Aluno2.getCpf() +
                "\nNome: " + Aluno2.getNome() +
                "\nAltura: " + Aluno2.getAltura() + 
                "\nPeso: " + Aluno2.getPeso()
        );
        
        JOptionPane.showMessageDialog(null,
                "Id: " + Aluno3.getId() +
                "\nCpf: " + Aluno3.getCpf() +
                "\nNome: " + Aluno3.getNome() +
                "\nAltura: " + Aluno3.getAltura() + 
                "\nPeso: " + Aluno3.getPeso()
        );
        
    }
}