package aula6.exercicio;

public class Erros {

    public static void main(String[] args) {
        String s = null;
        int x[] = new int[3];
        try {
            for (int i = 0; i <= 3; i++) { // lança o erro
                x[i] = i;
                System.out.println("Mensagem " + i);
            }
            System.out.println("Mensagem 4 " + s.substring(0, 1));
        } catch (NullPointerException e) {
            System.out.println("Mensagem 5");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Mensagem 6");
        } finally {
            System.out.println("Mensagem 7");
        }
    }
}