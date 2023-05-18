package aula6.exercicio;
import java.util.Scanner;
public class TemperatureConverter {
    public Double toCelsius(double f) throws Exception {
        double c;
        if (f < -459.67) {
            throw new FahrenheitException();
        }
        return 5 * (f - 32) / 9;
    }   

    public static void main(String[] args) {
        double f;
        System.out.println("Digite um valor em Fahrenheit para conveter em Celsius: ");
        Scanner s = new Scanner(System.in);
        f = s.nextDouble();
        TemperatureConverter tc = new TemperatureConverter();
        try {
            System.out.println(tc.toCelsius(f));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
