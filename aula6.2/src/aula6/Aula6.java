package aula6;

public class Aula6 {
    
    public long fibonacii(int n) throws NegativeException {
        long x = 1, c = 1;
        if (n < 0) {
            throw new NegativeException();
        }
        
        for (int i = 2; i <= n; i++) {
            x += x + c - 1;
        }
        
        return x;
    }
    
    public static void main(String[] args) {
        Aula6 aula6 = new Aula6();
        String s = null;
        String x = "";
        
        try {
            
            if (x.equals("")) {
                throw new Exception("Nao pode ser vazio, cara!");
            } // Pula para o último exception e vaza
            
            System.out.println(aula6.fibonacii(10));
            
            s.substring(0); // NullPointer exp
            
        //} catch (NegativeException ex) {
        //    System.out.println(ex.getMessage());
        //} catch (NullPointerException ex) {
        //    System.out.println("Objeto nulo");
        //} catch (Exception e) {
        //    System.out.println(e.getMessage());
        //}
        
        } catch (NegativeException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
