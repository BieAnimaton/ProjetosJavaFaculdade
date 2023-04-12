package aula6.exercicio;

public class TemperatureException extends Exception {

    @Override
    public String getMessage() {
        return "Valor deve ser maior que o zero absoluto!";
    }
    
    
    
}
