package lista;

/**
 *
 * @author rafael.fgoulart1
 */
public class Aluno {
    private String nome, curso;
    private double nota;
    private int id;
    
    public Aluno() {}

    public Aluno(String nome, String curso, double nota) {
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n  Nome: " + nome + "\n  Curso: " + curso + "\n  Nota: " + nota;
    }
}