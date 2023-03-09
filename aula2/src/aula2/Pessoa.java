/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2;

import java.util.Date;

/**
 *
 * @author Bie_Animation
 */
public class Pessoa {
    String nome;
    Date dataDeNascimento;
    Number altura;

    public Pessoa(String nome, Date dataDeNascimento, Number altura) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
    }
    
    private Pessoa() {
        
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

