package marcelino.lucas.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double soma = 0;
    private double[] salario;
    private double media = 0;


    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salario != null) {
            for (int i = 0; i < salario.length; i++) {
                soma += salario[i];
            }
            mediaImpressa();
        }
    }

    public void mediaImpressa() {
        if (salario == null) {
            return;
        }
        media = soma / salario.length;
        System.out.println(media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia(){
        return media;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSoma() {
        return soma;
    }

    public double[] getSalario(double[] doubles) {
        return salario;
    }
}
