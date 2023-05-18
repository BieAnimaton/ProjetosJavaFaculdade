package aula8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Questao1 {
    public static void main(String[] args) {
        double soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        int c = 0;
        try {
            FileReader reader = new FileReader("POO_Aula8_dados1.csv");
            BufferedReader buffer = new BufferedReader(reader);
            String linha = buffer.readLine();
            while(linha != null) {
                //System.out.println(linha);
                StringTokenizer tokens = new StringTokenizer(linha, "|");
                for (int i = 0; i < 3; i++) {
                    tokens.nextToken();
                }
                double d = Double.parseDouble(tokens.nextToken());
                //System.out.println(d);
                soma = soma + d;
                c++;
                if (d < menor) {
                    menor = d;
                }
                if (d > maior) {
                    maior = d;
                }
                linha = buffer.readLine();
            }
            System.out.println("Media: " + soma / c);
            System.out.println("Menor valor: " + menor);
            System.out.println("Maior valor: " + maior);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }   
}
