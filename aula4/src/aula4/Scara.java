package aula4;

public class Scara extends Robo {
    private int rotGDL = 3;
    private int tranlGDL = 1;
    
    @Override
    public String getNome() {
        return "SCARA";
    }
    
    public String getNome(String modelo) {
        return "SCARA" + modelo;
    }
    
    @Override
    public int getTotalGdl() {
        return rotGDL + tranlGDL;
    }
    
    public int getTranslPos() {
        return 100;
    }
}
