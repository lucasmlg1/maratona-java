package marcelino.lucas.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double soma = 0;
    public double[] salario = {1, 2, 3};

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
        double media = 0;
        media = soma / salario.length;
        System.out.println(media);
    }
}
