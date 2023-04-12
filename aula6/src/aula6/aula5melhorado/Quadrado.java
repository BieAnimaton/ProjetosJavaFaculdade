package aula6.aula5melhorado;

public class Quadrado extends Poligono {

    private double tamanhoLados;

    private Quadrado(double tamanhoLados) {
        this.tamanhoLados = tamanhoLados;
    }
    
    public static Quadrado getInstance(double tamanhoLados) throws Exception {
        if (tamanhoLados > 0) {
            return new Quadrado(tamanhoLados);
        }
        throw new Exception("Tamanho deve ser maior que zero!");
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
