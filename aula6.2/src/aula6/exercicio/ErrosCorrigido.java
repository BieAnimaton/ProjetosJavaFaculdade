package aula6.exercicio;

public class ErrosCorrigido {

    public static void metodo() throws ArrayIndexOutOfBoundsException, NullPointerException {
        String s = null;
        int x[] = new int[3];
        try {
            for (int i = 0; i <= 3; i++) {
                x[i] = i;
                System.out.println("Mensagem " + i);
            }
            System.out.println("Mensagem 4 " + s.substring(0, 1)); // lança o erro
        } catch (NullPointerException e) {
            System.out.println("Mensagem 5");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Mensagem 6");
        } finally {
            System.out.println("Mensagem 7");
        }
    }
    
    public static void main(String[] args) {
        metodo();
    }
}
