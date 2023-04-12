// -*- coding: utf-8 -*-

package aula4.exercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;
        
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);

        System.out.print("Digite o 1º lado do triângulo: ");
        a = scanner.nextDouble();

        System.out.print("Digite o 2º lado do triângulo: ");
        b = scanner2.nextDouble();

        System.out.print("Digite o 3º lado do triângulo: ");
        c = scanner3.nextDouble();

        Triangulo t = new Triangulo(a, b, c);
                
        if (t.ehTriangulo()) {
            System.out.println("");
            System.out.println("É equilátero? " + t.ehEquilatero());
            System.out.println("É isóceles? " + t.ehIsosceles());
            System.out.println("É escaleno? " + t.ehEscaleno());
            System.out.println("É retângulo? " + t.ehRetangulo());
            System.out.println("");
            System.out.println("Perímetro do triângulo: " + t.calcularPerimetro());
            System.out.println("Área do triângulo: " + t.calcularArea());
        } else {
            System.out.println("Não é um triângulo");
        } 
    }
}
