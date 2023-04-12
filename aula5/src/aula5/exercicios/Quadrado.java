package aula5.exercicios;

public class Quadrado extends Poligono {

    private double tamanhoLados;

    private Quadrado(double tamanhoLados) {
        this.tamanhoLados = tamanhoLados;
    }
    
    public static Quadrado getInstance(double tamanhoLados) {
        if (tamanhoLados > 0) {
            return new Quadrado(tamanhoLados);
        }
        return null;
    }
    
    @Override
    public double calcularPerimetro() {
        return 4*tamanhoLados;
    }

    @Override
    public double calcularArea() {
        return tamanhoLados * tamanhoLados;
    }

    @Override
    public String toString() {
        return "Quadrado com area "
                + calcularArea()
                + " e perimetro "
                + calcularPerimetro();
    }
    
    
    
}
