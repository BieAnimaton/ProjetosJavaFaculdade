package aula3;

public class Questao1 {
    public static int[] criaVetorFibonacci(int n) {
        int v[] = new int[n];
        
        for (int i = 0; i < v.length; i++) {
            if (i == 0 || i == 1) {
                v[i] = i;
            } else {
                v[i] = v[i-1] + v[i - 2];
            }
        }
        
        return v;
    }
}
