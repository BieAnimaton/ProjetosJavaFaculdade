package aula4;

public class ManipuladorIndustrial extends Robo {
    private int rotGDL = 6;
    
    @Override
    public int getTotalGdl() {
        return rotGDL;
    }

    @Override
    public String getNome() {
        return "Braço robótico";
    }
    
    
    
}
