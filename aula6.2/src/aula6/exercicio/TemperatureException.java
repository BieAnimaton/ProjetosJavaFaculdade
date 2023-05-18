package aula6.exercicio;

public class TemperatureException extends Exception {

    @Override
    public String getMessage() {
        return "Temperatura fora do limite!";
    }
}
