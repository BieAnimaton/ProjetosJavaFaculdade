package aula3;

public class Questao4 {
    public static int[] criaVetor(int min, int max, int n) {
        int v[] = new int[n];
        
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) ( Math.random() * (max - min + 1)) + min;
        }
        
        return v;
    }
    
    public static void main(String[] args) {
        int max = 100;
        int min = 25;
        int n = 13;
        
        int a[] = criaVetor(min, max, n);
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println("");
    }
}
