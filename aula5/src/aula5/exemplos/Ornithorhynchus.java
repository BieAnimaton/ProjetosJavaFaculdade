package aula5.exemplos;

public class Ornithorhynchus extends Animal implements Mammal, Terrestrial, Aquatic {

    @Override
    public String getSpecies() {
        return "ornitorrinco";
    }

    @Override
    public int getNumberOfBreasts() {
        return 2;
    }

    @Override
    public boolean isWalking() {
        return true;
    }

    @Override
    public boolean isSwimming() {
        return false;
    }
    
}
