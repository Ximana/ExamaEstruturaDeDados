
package model;

public class Pessoa {
    private String nome;
    private int idade;
    private String deficiente;
    private String operacao;
    private String senha;
    
    private String genero;
    private int id;

    public Pessoa() {
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String isDeficiente() {
        return deficiente;
    }

    public void setDeficiente(String deficiente) {
        this.deficiente = deficiente;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    

    @Override
    public String toString() {
        return "Pessoa{" + "Senha=" + senha + ", Operação=" + operacao + ", Nome=" + nome + ", Idade=" + idade + ", Deficiente=" + deficiente + '}';
    } 
    
    
    public String toStringGrafo() {
        return  "Id =  " + id + ", Nome = " + nome + ", Idade = " + idade + ", Genero = " + genero ;
    } 
}
