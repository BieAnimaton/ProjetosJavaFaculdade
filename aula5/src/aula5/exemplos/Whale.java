package aula5.exemplos;

public class Whale extends Animal implements Mammal, Aquatic {

    @Override
    public String getSpecies() {
        return "Willy";
    }

    @Override
    public int getNumberOfBreasts() {
        return 2;
    }

    @Override
    public boolean isSwimming() {
        return true;
    }
    
}
