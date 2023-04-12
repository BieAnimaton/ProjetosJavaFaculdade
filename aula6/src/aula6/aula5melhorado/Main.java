package aula6.aula5melhorado;

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
            try {
                Quadrado quadrado = Quadrado.getInstance(n);
                poligonos.add(quadrado);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                i--;
            }
        }
        
        for (int i = 0; i < nt; i++) {
            double l1 = Math.random()*19 + 1;
            double l2 = Math.random()*19 + 1;
            double l3 = Math.random()*19 + 1;
            try {
                Triangulo triangulo = Triangulo.getInstance(l1, l2, l3);
                poligonos.add(triangulo);
            } catch (Exception e) {
                System.out.println(e.getMessage() + " l1: " + l1 + " l2: " + l2 + " l3: " + l3);
                i--;
            }
        }
        
        for (Object poligono : poligonos) {
            System.out.println(poligono);
        }
        
    }
}
