package aula5.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Poligono> poligonos = new ArrayList();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos quadrados?");
        int nq = scanner.nextInt();
        System.out.println("Quantos triangulos?");
        int nt = scanner.nextInt();
        
        for (int i = 0; i < nq; i++) {
            double n = Math.random()*19 + 1;
            Quadrado quadrado = Quadrado.getInstance(n);
            
            if (quadrado != null) {
                poligonos.add(quadrado);
            } else {
                i--;
            }
        }
        
        for (int i = 0; i < nt; i++) {
            double l1 = Math.random()*19 + 1;
            double l2 = Math.random()*19 + 1;
            double l3 = Math.random()*19 + 1;
            Triangulo triangulo = Triangulo.getInstance(l1, l2, l3);
            
            if (triangulo != null) {
                poligonos.add(triangulo);
            } else {
                i--;
            }
        }
        
        for (Object poligono : poligonos) {
            System.out.println(poligono);
        }
        
    }
}
