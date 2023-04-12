package aula4;

import java.util.Date;

public class Pessoa {
    private String nome;
    private Date dataDeNascimento;
    private Number altura;

    public Pessoa(String nome, Date dataDeNascimento, Number altura) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
    }
    
    public static void saudacao(String nome) {
        String sobrenome = "Batata";
        System.out.println("Ola " + nome);
    }
    public static void main(String[] args) {
        Pessoa.saudacao("Jao");
        Pessoa pe  = new Pessoa("Ze", new Date(), 1.8);
        pe.saudacao(pe.getNome());
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Number getAltura() {
        return altura;
    }

    public void setAltura(Number altura) {
        this.altura = altura;
    }
    
    
}
