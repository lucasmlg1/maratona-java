package marcelino.lucas.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professor;

    public void imprimir(){
        System.out.println(this.nome);
        if (professor == null) return;
        for (Professor professor1 : professor) {
            System.out.println(professor1.getNome());
        }
    }

    public Escola(String nome, Professor[] professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessor() {
        return professor;
    }

    public void setProfessor(Professor[] professor) {
        this.professor = professor;
    }
}
