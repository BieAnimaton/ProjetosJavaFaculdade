package aula5.exemplos;

public class Dog extends Animal implements Mammal, Terrestrial {

    @Override
    public String getSpecies() {
        return "dog";
    }

    @Override
    public int getNumberOfBreasts() {
        return 10;
    }

    @Override
    public boolean isWalking() {
        return false;
    }
    
}
