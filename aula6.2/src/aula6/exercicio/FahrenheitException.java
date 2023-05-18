package aula6.exercicio;

public class FahrenheitException extends TemperatureException {
    
    @Override
    public String getMessage() {
        return "Valor deve ser maior que o zero absoluto!";
    }
}
