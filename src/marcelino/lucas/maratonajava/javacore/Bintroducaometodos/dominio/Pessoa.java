package marcelino.lucas.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime() {
        System.out.println(this.idade);
        System.out.println(this.nome);
    }

   public void setNome(String nome){
        this.nome = nome;
   }

   public void setIdade(int idade){
        if ( idade < 0 ){
            System.out.println("Idade inválida.");
            return;
        }
       this.idade = idade;
   }
   public String getNome(){
        return this.nome;
   }

   public int getIdade(){
        return this.idade;
   }

}

