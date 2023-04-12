package aula5.exercicios;

public class Triangulo extends Poligono {
    
    private double lado1;
    private double lado2;
    private double lado3;

    private Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    public static Triangulo getInstance(double lado1, double lado2, double lado3) {
        if (ehTriangulo(lado1, lado2, lado3)) {
            return new Triangulo(lado1, lado2, lado3);
        }
        return null;
    }
    
    public static boolean ehTriangulo(double lado1, double lado2, double lado3) {
        return lado1 !=0 && lado2 != 0 && lado3 != 0 &&
                lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2;
    }
    
    public boolean ehEquilatero() {
        return lado1 == lado2 && lado2 == lado3;
    }
    
    public boolean ehIsosceles() {
        return !ehEquilatero() &&
                (lado1 == lado2 || lado2 == lado3 || lado1 == lado3);
    }
    
    public boolean ehEscaleno() {
        return !ehEquilatero() && !ehIsosceles();
    }
    
    public boolean ehRetangulo() {
        return !ehEquilatero() &&
                (lado1 == Math.hypot(lado2, lado3)
                || lado2 == Math.hypot(lado1, lado3)
                || lado3 == Math.hypot(lado1, lado2));
    }
    
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
    
    public double calcularArea() {
        double p = calcularPerimetro() / 2;
        
        return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
    }

    @Override
    public String toString() {
        return "Triangulo com area "
                + calcularArea()
                + " e perimetro "
                + calcularPerimetro();
    }
    
}
