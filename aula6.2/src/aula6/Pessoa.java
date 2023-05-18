package aula6;

import java.security.InvalidParameterException;

public class Pessoa {
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.equals("")) {
            throw new InvalidParameterException("Parametro nao pode ser nulo ou vazio");
        }
        this.nome = nome;
    }

    public Pessoa(String nome) {
        this.setNome(nome);
    }
    
    public static void main(String[] args) {
        Pessoa p = new Pessoa("batata");
        p.setNome("");
    }
    
}
