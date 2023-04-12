package aula3;

public class Questao5 {
    public static int[][] criaMatriz(int min, int max, int lin, int col) {
        int m[][] = new int[lin][col];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = (int) ( Math.random() * (max - min + 1)) + min;
            }
        }
        
        return m;
    }
    
    public static void main(String[] args) {
        int min = 137;
        int max = 500;
        int lin = 6;
        int col = 8;
        
        int[][] m = criaMatriz(min, max, lin, col);
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.printf("%d\t", m[i][j]);
            }
            System.out.println("");
        }
    }
}
