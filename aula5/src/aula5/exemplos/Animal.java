package aula5.exemplos;

public abstract class Animal {
    
    private boolean alive;

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    
    public abstract String getSpecies();
}
