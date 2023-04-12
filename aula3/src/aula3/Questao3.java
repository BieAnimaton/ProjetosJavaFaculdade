package aula3;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        
        while(n < 1) {
            System.out.println("Entre com tamanho maior que 0:");
            n = scanner.nextInt();
        }
        
        int v[] = Questao1.criaVetorFibonacci(n);
        
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + "\t");
        }
        System.out.println("");
        
        int vi[] = Questao2.inverteVetor(v);
        
        for (int i = 0; i < vi.length; i++) {
            System.out.print(vi[i] + "\t");
        }
        System.out.println("");
    }   
}
