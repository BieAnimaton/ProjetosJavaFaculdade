/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula4;

/**
 *
 * @author aluno
 */
public class Aula4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Robo r1 = new Robo();
        Robo r2 = new Scara();
        Robo r3 = new ManipuladorIndustrial();
        Scara s1 = new Scara();
        ManipuladorIndustrial m1 = new ManipuladorIndustrial();
        
        //((Scara)r2).getNome();
        
        //s1.getNome();
        //s1.getNome("x");
        
        //System.out.println(r1.getNome());
        //System.out.println(s1.getNome());
        //System.out.println(m1.getNome());
        //System.out.println("");
        
        System.out.println(((Robo)m1).getNome());
        //System.out.println(r2.getNome());
        //System.out.println(r3.getNome());
        System.out.println("");
        
        Robo r[] = new Robo[3];
        r[0] = r1;
        r[1] = r2;
        r[2] = r3;
        
        for (int i = 0; i < r.length; i++) {
            System.out.println(r[i].getNome());
        }
    }
    
}
