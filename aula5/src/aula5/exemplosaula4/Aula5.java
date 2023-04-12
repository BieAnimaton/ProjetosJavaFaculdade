package aula5.exemplosaula4;

public class Aula5 {

    public static void main(String[] args) {
        Animal animais[] = new Animal[5];
        animais[0] = new Cachorro();
        animais[1] = new CachorroGrande();
        animais[2] = new Gato();
        animais[3] = new GatoRico();
        animais[4] = new GatoPobre();
        
        for (int i = 0; i < animais.length; i++) {
            animais[i].faz();
        }
        
        Animal a = new Animal() {
            @Override
            public void faz() {
                System.out.println("Sei la");
            }
        };
        
        a.faz();
    }
    
}
