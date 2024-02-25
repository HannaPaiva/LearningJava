public class Pessoa {
    // Atributos
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para obter o nome
    public String getNome() {
        return nome;
    }

    // Método para definir o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para obter a idade
    public int getIdade() {
        return idade;
    }

    // Método para definir a idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
