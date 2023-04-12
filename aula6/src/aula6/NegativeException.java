package aula6;

public class NegativeException extends Exception {

    @Override
    public String getMessage() {
        return "Numero nao pode ser negativo";
    }
    
}
