/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2.testes;

import aula2.Pessoa;
import java.util.Date;

/**
 *
 * @author Bie_Animation
 */
public class Teste {
    public static void main(String[] args) {
        System.out.println("Sei la");
        
        Pessoa p = new Pessoa("Ze", new Date(), 0.5);
        System.out.println("Nome: " + p.getNome() + " altura: " + p.getAltura());
        
        String frase = "Nome: " + p.getNome() + " altura: " + p.getAltura();
        System.out.println(frase);
    }
}
