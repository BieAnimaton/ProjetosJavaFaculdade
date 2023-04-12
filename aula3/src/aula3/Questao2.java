package aula3;

public class Questao2 {
    public static int[] inverteVetor(int v[]) {
        int a[] = new int[v.length];
        
        for (int i = 0; i < a.length; i++) {
            a[i] = v[a.length - i - 1];
        }
        
        return a;
    }
}
