package aula5.exemplosaula4;

public abstract class Animal {
    private String nome;
    
    public abstract void faz();

    public Animal() {
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
